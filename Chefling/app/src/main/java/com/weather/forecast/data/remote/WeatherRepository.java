package com.weather.forecast.data.remote;

import android.support.annotation.NonNull;

import com.weather.forecast.R;
import com.weather.forecast.model.Example;
import com.weather.forecast.utils.GeneralUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Eitan Software Labs on 20-01-2018.
 */

public class WeatherRepository implements WeatherDataSource {

    @Override
    public void getWeatherDetails(LoadWeatherCallback weatherCallback) {
        loadWeatherData(weatherCallback);
    }

    private void loadWeatherData(final LoadWeatherCallback weatherCallback) {

        char unit = 'c';


        String YQL = String.format("select * from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"%s\") and u='" + unit + "'", "bangalore");

        Call<Example> weatherDetailsCall = ApiClient.getYahooClient().create(ApiService.class)
                .getWeatherData(YQL, "json");

        weatherDetailsCall.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(@NonNull Call<Example> call, @NonNull Response<Example> response) {
                if (response.body() != null && response.code() == 200) {
                    weatherCallback.onWeatherDataLoaded(response.body());
                } else {
                    weatherCallback.onDataNotAvailable();
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                weatherCallback.onDataNotAvailable();
            }
        });
    }
}
