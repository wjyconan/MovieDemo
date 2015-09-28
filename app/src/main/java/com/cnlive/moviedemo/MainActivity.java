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
	private List<String> posterPathList;
	private List<String> overviewList;
	private List<String> titleList;
	private List<String> voteList;
	private List<String> releaseList;
	private PopupWindow popupWindow;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Fresco.initialize(this);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);

		init();
		getPopSort();
		setAllClick();
		initPopupWindowView();


	}

	private void initPopupWindowView() {
		View view = getLayoutInflater().inflate(R.layout.item_popup_windows, null, false);
		popupWindow = new PopupWindow(view, 100, 120);
		
		view.setOnTouchListener(this);
		
		view.findViewById(R.id.tv_pop_sort).setOnClickListener(this);
		view.findViewById(R.id.tv_vote_sort).setOnClickListener(this);
	}


	private void setAllClick() {
		gvMovies.setOnItemClickListener(this);
		ivPopSelect.setOnClickListener(this);
	}

	private void init() {
		retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(baseUrl).build();
		service = retrofit.create(MovieService.class);

	}

	private void getPopSort() {

		moviesCall = service.getMovies(popSort, apiKey);
		getData();
	}

	private void getVoteSort() {
		moviesCall = service.getMovies(voteSort, apiKey);
		getData();
	}

	private void getData(){
		moviesCall.enqueue(new Callback<Movies>() {
			@Override
			public void onResponse(Response<Movies> response) {
				Log.e("=========", response.body().results.get(0).poster_path);
				posterPathList = new ArrayList<String>();
				titleList = new ArrayList<String>();
				overviewList = new ArrayList<String>();
				voteList = new ArrayList<String>();
				releaseList = new ArrayList<String>();
				for (int i = 0; i < response.body().results.size(); i++) {
					posterPathList.add(response.body().results.get(i).poster_path);
					overviewList.add(response.body().results.get(i).overview);
					titleList.add(response.body().results.get(i).title);
					voteList.add(response.body().results.get(i).vote_average);
					releaseList.add(response.body().results.get(i).release_date);
				}
				gvMovies.setAdapter(new GridViewAdapter(MainActivity.this, posterPathList));

			}


			@Override
			public void onFailure(Throwable t) {
				Log.e("++++++++++", t.toString());
			}
		});
	}
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Intent intent = new Intent(MainActivity.this, MovieDetailActivity.class);
		Bundle bundle = new Bundle();
		bundle.putString("title", titleList.get(position));
		bundle.putString("poster", posterPathList.get(position));
		bundle.putString("overview", overviewList.get(position));
		bundle.putString("vote", voteList.get(position));
		bundle.putString("release", releaseList.get(position));
		intent.putExtras(bundle);
		startActivity(intent);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.iv_more:
				if (popupWindow!=null&&popupWindow.isShowing()){
					popupWindow.dismiss();
					popupWindow=null;
				}else {
					initPopupWindowView();
					popupWindow.showAsDropDown(v,0,5);
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
		if (popupWindow!=null&&popupWindow.isShowing()){
			popupWindow.dismiss();
			popupWindow=null;
		}
		return false;
	}
}

