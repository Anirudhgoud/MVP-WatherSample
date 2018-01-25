package com.weather.forecast.data.remote;

import com.weather.forecast.model.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Eitan Software Labs on 20-01-2018.
 */

public interface ApiService {

   /* @GET("yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20**text%3D%22{bangalore}%2C%20be%22)%20and%20u%3D%27c%27&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
    Call<Example> getWeatherData();*/

    @GET("v1/public/yql")
    Call<Example> getWeatherData(@Query("q") String query,
                             @Query("format") String format);

}
