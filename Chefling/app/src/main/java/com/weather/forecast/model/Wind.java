package com.weather.forecast.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Eitan Software Labs on 20-01-2018.
 */

public class Wind {

    @SerializedName("chill")
    private String chill;

    @SerializedName("direction")
    private String direction;

    @SerializedName("speed")
    private String speed;


    public String getChill() {
        return chill;
    }

    public void setChill(String chill) {
        this.chill = chill;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
