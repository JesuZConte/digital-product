package com.nisum.stomas.demo.digitalproduct.analytics;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("meta")
public class MetaJSON {

    private AnalyticsJSON analytics;

    public AnalyticsJSON getAnalytics() {
        return analytics;
    }

    public void setAnalytics(AnalyticsJSON analytics) {
        this.analytics = analytics;
    }
}
