package com.weather.forecast.data.remote;

import com.weather.forecast.model.Example;

/**
 * Created by Eitan Software Labs on 20-01-2018.
 */

public interface WeatherDataSource {

    interface LoadWeatherCallback {

        void onWeatherDataLoaded(Example example);

        void onDataNotAvailable(String message);

        void onNetworkError(String message);
    }

    void getWeatherDetails(LoadWeatherCallback weatherCallback);
}
