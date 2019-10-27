package com.nisum.stomas.demo.digitalproduct.util;

import com.nisum.stomas.demo.digitalproduct.analytics.AnalyticsJSON;
import com.nisum.stomas.demo.digitalproduct.analytics.DataJSON;
import com.nisum.stomas.demo.digitalproduct.entity.Detail;
import com.nisum.stomas.demo.digitalproduct.entity.Product;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AnalyticsUtilTest {

    @InjectMocks
    private AnalyticsUtil analyticsUtil;

    private AnalyticsJSON analyticsJSON;
    private Product product;
    private Detail detail;

    @Before
    public void setUp() {
        product = new Product();
        detail = new Detail();
    }

    @Test
    public void buildAnalyticsJSONWithEmptyProduct() {
        analyticsJSON = analyticsUtil.buildAnalyticsData(product);

        assertNotNull(analyticsJSON);

    }

    @Test
    public void buildAnalyticsJSONWithProduct() {
        buildDetail();
        buildProduct();
        analyticsJSON = analyticsUtil.buildAnalyticsData(product);

        assertNotNull(analyticsJSON);
        assertEquals( "1", analyticsJSON.getData().getProductId()[0]);
        assertEquals("Availability message", analyticsJSON.getData().getProductAvailabilityMessage()[0]);
        assertEquals( "2", analyticsJSON.getData().getCategoryId()[0]);
        assertEquals("Category Name", analyticsJSON.getData().getCategoryName()[0]);
        assertEquals("Name", analyticsJSON.getData().getProductName()[0]);
        assertEquals("1000.0", analyticsJSON.getData().getProductPrice()[0]);
        assertEquals("10.0", analyticsJSON.getData().getProductReviews()[0]);
        assertEquals("12345678", analyticsJSON.getData().getProductUpc()[0]);
        assertEquals("false", analyticsJSON.getData().getProductVideo()[0]);


    }

    private void buildProduct() {
        product.setId(1);
        product.setPrice(1000);
        product.setProductUrl("http://url-of-a-product/1");
        product.setTopLevelCategoryId("2");
        product.setTopLevelCategoryName("Category Name");
        product.setProductDetail(detail);
    }

    private void buildDetail() {
        Product childProduct = new Product();
        detail.setProduct(childProduct);
        detail.setAvailabilityMessage("Availability message");
        detail.setAvailable(true);
        detail.setBrand("This is the brand");
        detail.setDescription("This is the description of the product");
        detail.setHasVideo(false);
        detail.setName("Name");
        detail.setReviewStatistics(10);
        detail.setUpcNumber("12345678");
    }
}