package com.weather.forecast.home;

import com.weather.forecast.data.remote.WeatherRepository;
import com.weather.forecast.home.WeatherContract.WeatherView;

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


}
