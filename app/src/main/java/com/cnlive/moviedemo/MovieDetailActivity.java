package com.cnlive.moviedemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MovieDetailActivity extends AppCompatActivity implements View.OnClickListener {

	@Bind(R.id.iv_back)
	ImageView ivBack;
	@Bind(R.id.iv_more)
	ImageView ivMore;
	@Bind(R.id.tv_title)
	TextView tvTitle;
	@Bind(R.id.sdv_poster)
	SimpleDraweeView sdvPoster;
	@Bind(R.id.tv_release_date)
	TextView tvReleaseDate;
	@Bind(R.id.tv_vote_average)
	TextView tvVoteAverage;
	@Bind(R.id.tv_overview)
	TextView tvOverview;
	@Bind(R.id.tv_vote_count)
	TextView tvVoteCount;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Fresco.initialize(this);
		setContentView(R.layout.activity_movie_detail);
		ButterKnife.bind(this);

		initView();
		setAllClick();
	}

	private void setAllClick() {
		ivBack.setOnClickListener(this);
	}

	private void initView() {
		Intent intent = getIntent();
		Bundle bundle = intent.getExtras();
		tvTitle.setText(bundle.getString("title"));
		tvReleaseDate.setText(bundle.getString("release"));
		tvOverview.setText("OverView:   " + bundle.getString("overview"));
		tvVoteCount.setText(bundle.getString("voteCount"));
		tvVoteAverage.setText(bundle.getString("vote"));
		sdvPoster.setImageURI(Uri.parse("http://image.tmdb.org/t/p/w185" + bundle.getString("poster")));


	}


	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.iv_back:
				finish();
				break;
		}
	}
}
