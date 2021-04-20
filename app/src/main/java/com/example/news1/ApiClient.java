package com.example.news1;

import android.app.AlertDialog;

//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient<Retrofit> {
    private static final String BASE_URL = "1db3f1086090414a9418d7934a32d028";
    private static ApiClient apiClient;
    private Retrofit retrofit;
/*
    private ApiClient(){
        AlertDialog.Builder GsonConverterFactory = null;
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
    }
*/
    public static synchronized ApiClient getInstance(){
        if (apiClient == null){
            apiClient = new ApiClient();
        }
        return apiClient;
    }


    public Retrofit getApi(){
        return retrofit;
    }
}
