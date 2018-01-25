package com.weather.forecast.home;

import com.weather.forecast.model.Example;

/**
 * Created by Eitan Software Labs on 21-01-2018.
 */

public interface WeatherContract {

    interface WeatherView {

        void showProgress();

        void hideProgress();

        void showWeatherData(Example example);

        void onNetworkUnavailable();
    }

    interface WeathetPresenter {


    }

}
