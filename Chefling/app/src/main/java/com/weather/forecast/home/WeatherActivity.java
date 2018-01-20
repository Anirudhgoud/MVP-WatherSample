package com.weather.forecast.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.weather.forecast.R;
import com.weather.forecast.data.remote.WeatherRepository;
import com.weather.forecast.model.Example;

public class WeatherActivity extends AppCompatActivity implements WeatherContract.WeatherView {

    private WeatherPresenter weatherPresenter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUi();
    }

    private void initUi() {

        weatherPresenter = new WeatherPresenter(this,new WeatherRepository());

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showWeatherData(Example example) {

    }
}
