package com.weather.forecast.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.weather.forecast.R;
import com.weather.forecast.data.remote.WeatherRepository;
import com.weather.forecast.model.Channel;
import com.weather.forecast.model.Example;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WeatherActivity extends AppCompatActivity implements WeatherContract.WeatherView {

    @BindView(R.id.tvDate)
    TextView tvDate;

    @BindView(R.id.tvLowTemp)
    TextView tvLowTemp;

    @BindView(R.id.tvHighTemp)
    TextView tvHighTemp;

    @BindView(R.id.view_loading)
    View viewLoading;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initUi();
    }

    private void initUi() {
        WeatherPresenter weatherPresenter = new WeatherPresenter(this, new WeatherRepository());
        weatherPresenter.getWeatherInformation(this);
    }

    @Override
    public void showProgress() {
        viewLoading.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        viewLoading.setVisibility(View.GONE);
    }

    @Override
    public void showWeatherData(Example example) {

        Channel channel = null;

        if (example != null && example.getQuery() != null && example.getQuery().getResults() != null &&
                example.getQuery().getResults().getChannel() != null) {
            channel = example.getQuery().getResults().getChannel();
        }
        if (channel != null) {
            tvDate.setText(example.getQuery().getResults().getChannel().getLastBuildDate());

        }

        if (channel != null && channel.getItem() != null && channel.getItem().getForecast() != null) {
            if (!channel.getItem().getForecast().isEmpty()) {
                tvHighTemp.setText(String.format("%s%s", channel.getItem().getForecast().get(0).getHigh(), getString(R.string.temp)));
                tvLowTemp.setText(String.format("%s%s", channel.getItem().getForecast().get(0).getLow(), getString(R.string.temp)));
            }
        }
    }

    @Override
    public void onNetworkUnavailable() {
        Toast.makeText(this,R.string.enable_internet,Toast.LENGTH_LONG).show();
    }


}
