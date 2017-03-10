package com.otherhshe.niceread.api;

import com.otherhshe.niceread.constant.Api;
import com.otherhshe.niceread.data.GankItemData;
import com.otherhshe.niceread.data.HttpResult;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Author: Othershe
 * Time: 2016/8/12 16:50
 */
public interface GankItemService {
    String BASE_URL = Api.URL_GET_GANK;

    @GET("{suburl}")
    Observable<HttpResult<List<GankItemData>>> getGankItemData(@Path("suburl") String suburl);
}
