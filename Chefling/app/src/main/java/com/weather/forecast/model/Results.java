package com.weather.forecast.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Eitan Software Labs on 20-01-2018.
 */

public class Results {

    @SerializedName("channel")
    private Channel channel;

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

}
