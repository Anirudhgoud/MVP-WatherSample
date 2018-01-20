package com.weather.forecast.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Eitan Software Labs on 20-01-2018.
 */

public class Item {

    @SerializedName("title")
    private String title;

    @SerializedName("lat")
    private String lat;

    @SerializedName("long")
    private String _long;

    @SerializedName("link")
    private String link;

    @SerializedName("pubDate")
    private String pubDate;

    @SerializedName("condition")
    private Condition condition;

    @SerializedName("forecast")
    private List<Forecast> forecast = null;

    @SerializedName("description")
    private String description;

    @SerializedName("guid")
    private Guid guid;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLong() {
        return _long;
    }

    public void setLong(String _long) {
        this._long = _long;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public List<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Guid getGuid() {
        return guid;
    }

    public void setGuid(Guid guid) {
        this.guid = guid;
    }
}
