package com.zwe.constellationdemo;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by Asus on 2017/4/5.
 */

public interface ConstellationService {
    String BASEURL="http://web.juhe.cn:8080";

    @GET("constellation/{config}")
    Observable<ConstellationItem> rxConsName(@Path("config")String config);
}
