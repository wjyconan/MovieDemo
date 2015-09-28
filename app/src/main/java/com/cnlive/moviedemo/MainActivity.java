package com.cnlive.moviedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.cnlive.moviedemo.adapter.GridViewAdapter;
import com.cnlive.moviedemo.bean.Movies;
import com.cnlive.moviedemo.inf.MovieService;
import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnTouchListener {

	@Bind(R.id.iv_more)
	ImageView ivPopSelect;
	@Bind(R.id.gv_movies)
	GridView gvMovies;
	@Bind(R.id.tv_sort_title)
	TextView tvSortTitle;
	private String baseUrl = "https://api.themoviedb.org/";
	private String apiKey = "062da0340d7cec6489f68575cc629c42";
	private String popSort = "popularity.desc";
	private String voteSort = "vote_average.desc";
	private MovieService service;
	private Retrofit retrofit;
	private Call<Movies> moviesCall;
	private List<Movies.ResultsEntity> resultsEntityList;
	private List<String> posterPathList;
	private PopupWindow popupWindow;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Fresco.initialize(this);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);

		init();
		initPopupWindowView();
		getPopSort();
		setAllClick();


	}

	/**
	 * 初始化popupwindow
	 * 功能:menu菜单
	 */
	private void initPopupWindowView() {
		View view = getLayoutInflater().inflate(R.layout.item_popup_windows, null, false);
		popupWindow = new PopupWindow(view, 100, 200);
		//实现外部点击关闭PopupWindow
		popupWindow.setOutsideTouchable(true);
		popupWindow.setFocusable(true);

		view.setOnTouchListener(this);

		view.findViewById(R.id.tv_pop_sort).setOnClickListener(this);
		view.findViewById(R.id.tv_vote_sort).setOnClickListener(this);
	}


	/**
	 * 设置所有的点击监听
	 */
	private void setAllClick() {
		gvMovies.setOnItemClickListener(this);
		ivPopSelect.setOnClickListener(this);
	}


	private void init() {
		retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(baseUrl).build();
		service = retrofit.create(MovieService.class);

	}

	/**
	 * 按照最流行获得数据
	 */
	private void getPopSort() {

		moviesCall = service.getMovies(popSort, apiKey);
		getData();
	}

	/**
	 * 按照最高评分获得数据
	 */
	private void getVoteSort() {
		moviesCall = service.getMovies(voteSort, apiKey);
		getData();
	}

	/**
	 * 获取数据
	 */
	private void getData() {
		moviesCall.enqueue(new Callback<Movies>() {
			@Override
			public void onResponse(Response<Movies> response) {

				Log.e("=========", response.body().results.get(0).poster_path);
				Log.e("list", String.valueOf(response.body().results.size()));

				resultsEntityList = new ArrayList<Movies.ResultsEntity>();
				posterPathList = new ArrayList<>();
				resultsEntityList = response.body().results;

				for (int i = 0; i < response.body().results.size(); i++) {
					posterPathList.add(resultsEntityList.get(i).poster_path);
				}
				gvMovies.setAdapter(new GridViewAdapter(MainActivity.this, posterPathList));
			}


			@Override
			public void onFailure(Throwable t) {
				Log.e("+++++++", t.toString());
				Toast.makeText(MainActivity.this, t.toString(), Toast.LENGTH_LONG).show();
			}
		});
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Intent intent = new Intent(MainActivity.this, MovieDetailActivity.class);
		Bundle bundle = new Bundle();
		bundle.putSerializable("results", resultsEntityList.get(position));
		intent.putExtras(bundle);
		startActivity(intent);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.iv_more:
				if (popupWindow != null && popupWindow.isShowing()) {
					popupWindow.dismiss();
					popupWindow = null;
				} else {
					initPopupWindowView();
					popupWindow.showAsDropDown(v, 0, 5);
				}
				break;
			case R.id.tv_pop_sort:
				tvSortTitle.setText("Pop Movies");
				popupWindow.dismiss();
				getPopSort();
				break;
			case R.id.tv_vote_sort:
				tvSortTitle.setText("Best Movies");
				popupWindow.dismiss();
				getVoteSort();
				break;
		}
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		if (popupWindow != null && popupWindow.isShowing()) {
			popupWindow.dismiss();
			popupWindow = null;
		}
		return false;
	}
}

