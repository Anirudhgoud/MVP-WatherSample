package com.weather.forecast.data.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Eitan Software Labs on 20-01-2018.
 */

public class ApiClient {

    public static final String YAHOO_WEATHER_API = "https://query.yahooapis.com/v1/public/";

    public static final String BASE_URL = YAHOO_WEATHER_API;
    private static Retrofit googleRetrofit = null;

    public static Retrofit getYahooClient() {
        if (googleRetrofit == null) {
            googleRetrofit = new Retrofit.Builder()
                    .baseUrl(YAHOO_WEATHER_API)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return googleRetrofit;
    }
}
