package com.plt.common;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * Created by Dori on 3/10/2016.
 */
public interface Interface {

    //This method is used for "POST"
    @FormUrlEncoded
    @POST("/api.php")
    void postData(@Field("method") String method,
                  @Field("username") String username,
                  @Field("password") String password,
                  Callback<ServerResponse> serverResponseCallback);

    //This method is used for "GET"

    @GET("user")
    Call<ServerResponse> getMainData(@QueryMap HashMap<String, String> param);

    @GET("mcbt/mobilecbt/apps/version")
    Call<ServerResponse> getVersion(@QueryMap HashMap<String, String> param);

    @GET("mcbt/mobilecbt/apps/version")
    Call<ServerResponse> getVersionData(@QueryMap HashMap<String, String> param);

    @GET("mcbt/mobilecbt/claim/myInfo")
    Call<ServerResponse> getMyPageData(@QueryMap HashMap<String, String> param);


    @GET("mcbt/mobilecbt/search/popularkeywords")
    Call<ServerResponse> geSearchPopularData(@QueryMap HashMap<String, String> param);

    @GET("mcbt/mobilecbt/product/barcordinfo")
    Call<ServerResponse> getBarcordInfoData(@QueryMap HashMap<String, String> param);

    @GET("mcbt/mobilecbt/search/categorylist")
    Call<ServerResponse> getSearchCountData(@QueryMap HashMap<String, String> param);

}