package com.nisum.stomas.demo.digitalproduct.analytics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AnalyticsJSON {

    @JsonProperty("data")
    private DataJSON data;

    public DataJSON getData() {
        return data;
    }

    public void setData(DataJSON data) {
        this.data = data;
    }
}
