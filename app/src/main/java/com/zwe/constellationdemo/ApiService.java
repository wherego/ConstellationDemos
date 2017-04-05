package com.zwe.constellationdemo;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Asus on 2017/4/5.
 */

public interface ApiService {
    String BASEURL = "https://api.github.com";

    //...
    @GET("users/{user}")
    Observable<GitModel> rxUser(@Path("user") String user);
}
