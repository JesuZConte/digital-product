package com.nisum.stomas.demo.digitalproduct.analytics;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Representa un objeto JSON para Analytics
 */
public class AnalyticsJSON {

    @JsonProperty("data")
    private DataJSON data;

    /**
     * Obtiene un DataJSON de AnalyticsJSON
     * @return DataJSON
     */
    public DataJSON getData() {
        return data;
    }

    /**
     * Modifica DataJSON de AnalyticsJSON
     * @param data
     */
    public void setData(DataJSON data) {
        this.data = data;
    }
}
