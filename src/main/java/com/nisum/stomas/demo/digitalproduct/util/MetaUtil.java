package com.nisum.stomas.demo.digitalproduct.util;

import com.nisum.stomas.demo.digitalproduct.analytics.AnalyticsJSON;
import com.nisum.stomas.demo.digitalproduct.analytics.MetaJSON;
import org.springframework.stereotype.Component;

@Component
public class MetaUtil {

    public MetaJSON buildMetaAnalytics(AnalyticsJSON analytics){
        MetaJSON metaJson = new MetaJSON();
        metaJson.setAnalytics(analytics);
        return metaJson;
    }
}
