package com.example.news1;

import android.telecom.Call;

import androidx.room.Query;

import com.example.news1.Model.Headlines;

import retrofit2.http.GET;

public interface ApiInterface {


    @GET("top-headlines")
    Call<Headlines> getHeadlines(
            String country,
            String apiKey
    );

    @GET("everything")
    Call<Headlines> getSpecificData(
            String query,
            String apiKey
    );



}
