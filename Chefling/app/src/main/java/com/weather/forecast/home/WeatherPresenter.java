package com.weather.forecast.home;

import android.content.Context;

import com.weather.forecast.data.remote.WeatherDataSource;
import com.weather.forecast.data.remote.WeatherRepository;
import com.weather.forecast.home.WeatherContract.WeatherView;
import com.weather.forecast.model.Example;
import com.weather.forecast.utils.GeneralUtils;

/**
 * Created by Eitan Software Labs on 21-01-2018.
 */

public class WeatherPresenter implements WeatherContract.WeathetPresenter {

    private WeatherView weatherView = null;
    private WeatherRepository weatherRepository = null;

    public WeatherPresenter(WeatherView weatherView, WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
        this.weatherView = weatherView;
    }


    public void getWeatherInformation(Context context) {
        if (GeneralUtils.isNetworkAvailable(context)) {
            weatherView.showProgress();
            weatherRepository.getWeatherDetails(new WeatherDataSource.LoadWeatherCallback() {
                @Override
                public void onWeatherDataLoaded(Example example) {
                    if (example != null) {
                        weatherView.hideProgress();
                        weatherView.showWeatherData(example);
                    }
                }

                @Override
                public void onDataNotAvailable() {
                    weatherView.hideProgress();
                    if (weatherView != null) {
                    }
                }

                @Override
                public void onNetworkError(String message) {

                }
            });
        } else {
            weatherView.onNetworkUnavailable();
        }
    }
}
