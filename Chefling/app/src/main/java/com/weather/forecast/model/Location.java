package com.weather.forecast.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Eitan Software Labs on 20-01-2018.
 */

public class Location {

    @SerializedName("city")
    private String city;

    @SerializedName("country")
    private String country;

    @SerializedName("region")
    private String region;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}
