package com.weather.forecast.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Eitan Software Labs on 20-01-2018.
 */

public class Example {

    @SerializedName("query")
    private Query query;

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }
}
