package com.nisum.stomas.demo.digitalproduct.service;

import com.nisum.stomas.demo.digitalproduct.dao.ProductDAOImpl;
import com.nisum.stomas.demo.digitalproduct.entity.Product;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceImplTest {

    @InjectMocks
    private ProductServiceImpl productService;

    @Mock
    private ProductDAOImpl productDAO;

    @Mock
    private Product product;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void findAll() {
        when(productDAO.findAll()).thenReturn(Arrays.asList(new Product()));

        List<Product> productList = productService.findAll();

        assertEquals(1, productList.size());
    }

    @Test
    public void findById() {
        when(productDAO.findById(1)).thenReturn(product);
        Product newProduct = productService.findById(1);

        assertEquals(product, newProduct);
    }

    @Test
    public void save() {
       productService.save(product);

       verify(productDAO, times(1)).save(product);
    }

    @Test
    public void deleteById() {
        productService.deleteById(1);

        verify(productDAO, times(1)).delete(1);
    }
}