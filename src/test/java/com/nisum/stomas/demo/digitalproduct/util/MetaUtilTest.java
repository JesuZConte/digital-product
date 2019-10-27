package com.nisum.stomas.demo.digitalproduct.util;

import com.nisum.stomas.demo.digitalproduct.analytics.AnalyticsJSON;
import com.nisum.stomas.demo.digitalproduct.analytics.MetaJSON;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class MetaUtilTest {

    @InjectMocks
    private MetaUtil metaUtil;

    private MetaJSON metaJSON;
    private AnalyticsJSON analyticsJSON;

    @Before
    public void setUp() {
        analyticsJSON = new AnalyticsJSON();
    }

    @Test
    public void buildMetaAnalytics() {
        metaJSON = metaUtil.buildMetaAnalytics(analyticsJSON);

        assertNotNull(metaJSON);
    }


}