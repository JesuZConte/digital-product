package com.nisum.stomas.demo.digitalproduct.service;

import com.nisum.stomas.demo.digitalproduct.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();
    Product findById(int id);
    void save(Product product);
    void deleteById(int id);
}
