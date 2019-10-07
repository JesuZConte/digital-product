package com.nisum.stomas.demo.digitalproduct.util;

import com.nisum.stomas.demo.digitalproduct.analytics.AnalyticsJSON;
import com.nisum.stomas.demo.digitalproduct.analytics.MetaJSON;
import org.springframework.stereotype.Component;

/**
 * Clase que contiene Metadata para Analytics
 */
@Component
public class MetaUtil {

    /**
     * Método que construye la Metadata para Analytics
     * @param analytics
     * @return MetaJSON
     */
    public MetaJSON buildMetaAnalytics(AnalyticsJSON analytics){
        MetaJSON metaJson = new MetaJSON();
        metaJson.setAnalytics(analytics);
        return metaJson;
    }
}
