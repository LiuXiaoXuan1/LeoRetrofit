package com.xiaoxuan.myapplication.Presenter;

import javax.security.auth.callback.Callback;

import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by xiaoxuan on 2015/6/12.
 */
public interface User {
    @GET("/user/list.json")
    void getUsers(@Query("pagesize") int pagesize, Callback callback);
}
