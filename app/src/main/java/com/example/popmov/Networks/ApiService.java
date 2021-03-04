package com.example.popmov.Networks;

import com.example.popmov.Models.Movie;
import com.example.popmov.Response.MovieResponse;
import com.example.popmov.Response.ReviewResponse;
import com.example.popmov.Response.TrailerResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface ApiService {
//    @GET("s")
//    Call<MovieResponse> getAllMovies(@Query("s") String mealName);
//    @GET("i")
//    Call<MealResponse> getFavoriteMeals(@Query("i") String idMeals);
     @GET("popular?")
     Call<MovieResponse> getAllMovies(@Query("api_key") String api_key,@Query("language")String language,@Query("page")Integer page);
     @GET
     Call<Movie> getFavoriteMovie(@Url String url, @Query("api_key")String api_key);
     @GET
     Call<TrailerResponse> getTrailers(@Url String url, @Query("api_key")String api_key);
     @GET
     Call<ReviewResponse> getReviews(@Url String url,@Query("api_key") String api_key, @Query("language")String language, @Query("page")Integer page);
     //https://api.themoviedb.org/3/movie/343611/reviews?api_key=4e44d9029b1270a757cddc766a1bcb63&language=en-US&page=1

}