package com.nisum.stomas.demo.digitalproduct.analytics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetaJSON {

    @JsonProperty("analytics")
    private AnalyticsJSON analytics;


    public AnalyticsJSON getAnalytics() {
        return analytics;
    }

    public void setAnalytics(AnalyticsJSON analytics) {
        this.analytics = analytics;
    }
}
