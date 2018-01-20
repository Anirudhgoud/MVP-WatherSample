package com.weather.forecast.data.remote;

import com.weather.forecast.R;
import com.weather.forecast.model.Example;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Eitan Software Labs on 20-01-2018.
 */

public class WeatherRepository implements WeatherDataSource {

    public static final String location = "bangalore";

    @Override
    public void getWeatherDetails(LoadWeatherCallback weatherCallback) {
        loadWeatherData(weatherCallback);
    }

    private void loadWeatherData(final LoadWeatherCallback weatherCallback) {


        Call<Example> weatherDetailsCall = ApiClient.getYahooClient().create(ApiService.class)
                .getWeatherData(location);

        weatherDetailsCall.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                if (response.body() != null && response.code() == 200) {
                    weatherCallback.onWeatherDataLoaded(response.body());
                } else {
                    weatherCallback.onDataNotAvailable(R.string.data_unavailable);
                }

            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                weatherCallback.onDataNotAvailable();
            }
        });
    }
}
