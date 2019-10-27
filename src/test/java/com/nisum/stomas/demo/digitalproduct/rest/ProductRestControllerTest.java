package com.nisum.stomas.demo.digitalproduct.rest;

import com.nisum.stomas.demo.digitalproduct.analytics.AnalyticsJSON;
import com.nisum.stomas.demo.digitalproduct.analytics.MetaJSON;
import com.nisum.stomas.demo.digitalproduct.entity.Product;
import com.nisum.stomas.demo.digitalproduct.service.ProductServiceImpl;
import com.nisum.stomas.demo.digitalproduct.util.AnalyticsUtil;
import com.nisum.stomas.demo.digitalproduct.util.MetaUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ProductRestControllerTest {

    @InjectMocks
    private ProductRestController productRestController;

    @Mock
    private ProductServiceImpl productService;

    @Spy
    private AnalyticsUtil analyticsUtil;

    @Spy
    private MetaUtil metaUtil;

    private Product product;


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        product = mock(Product.class);
    }

    @Test
    public void findAllProducts() {

        when(productService.findAll()).thenReturn(Arrays.asList(product));

        List<Product> productList = productRestController.findAll();

        assertNotNull(productList);
        assertEquals(1, productList.size());
    }

    @Test
    public void getProductSuccess() {

        when(productService.findById(1)).thenReturn(product);
        doReturn(new AnalyticsJSON()).when(analyticsUtil).buildAnalyticsData(any(Product.class));
        when(metaUtil.buildMetaAnalytics(any(AnalyticsJSON.class))).thenReturn(new MetaJSON());

        Response response = productRestController.getProduct(1);

        assertNotNull(response);
        assertEquals(200, response.getStatus());
    }

    @Test
    public void getProductError() {
        when(productService.findById(1)).thenReturn(null);

        Response response = productRestController.getProduct(1);

        assertNotNull(response);
        assertEquals(404, response.getStatus());
    }

    @Test
    public void addProduct() {
        productRestController.addProduct(product);

        verify(productService, times(1)).save(product);

    }

    @Test
    public void updateProduct() {
        productRestController.updateProduct(product);

        verify(productService, times(1)).save(product);
    }

    @Test
    public void deleteProduct() {
        when(productService.findById(anyInt())).thenReturn(product);

        productRestController.deleteProduct(1);

        verify(productService, times(1)).deleteById(1);
    }

    @Test(expected = RuntimeException.class)
    public void deleteProductException() {
        when(productService.findById(anyInt())).thenReturn(null);

        productRestController.deleteProduct(1);
    }
}