package com.example.administrator.myapplication.api;


import com.example.administrator.myapplication.ui.model.LeoStreamData;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by xiaoxuan on 2015/6/13.
 */
public class ApiClient {

    private static LeoApiInterface sLeoApiService;

    public static LeoApiInterface getLeoClient() {
        if(sLeoApiService==null)
        {
            RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint("http://api.leo.like/api").build();
            sLeoApiService = restAdapter.create(LeoApiInterface.class);
        }
        return sLeoApiService;
    }



    public interface LeoApiInterface {
        @GET("stream/list.json")
        void getStreams(@Query("limit") int limit, @Query("offset") int offset, Callback<List<LeoStreamData>> callback);
    }
}
