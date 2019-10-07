package com.nisum.stomas.demo.digitalproduct.analytics;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Representa la Metadata para Analytics
 */
@JsonRootName("meta")
public class MetaJSON {

    private AnalyticsJSON analytics;

    /**
     * Obtiene un AnalyticsJSON del MetaJSON
     * @return
     */
    public AnalyticsJSON getAnalytics() {
        return analytics;
    }

    /**
     * Modifica el AnalyticsJSON del MetaJSON
     * @param analytics
     */
    public void setAnalytics(AnalyticsJSON analytics) {
        this.analytics = analytics;
    }
}
