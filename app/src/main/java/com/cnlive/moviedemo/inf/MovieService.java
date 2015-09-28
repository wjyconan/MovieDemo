package com.cnlive.moviedemo.inf;

import com.cnlive.moviedemo.bean.Movies;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by WJY on 2015/9/26.
 */
public interface MovieService {
	@GET("3/discover/movie?%20")
	Call<Movies> getMovies(@Query("sort_by") String sort_by, @Query("api_key") String api_key);
}
