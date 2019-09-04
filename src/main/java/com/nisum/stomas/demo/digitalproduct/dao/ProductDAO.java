package com.nisum.stomas.demo.digitalproduct.dao;

import com.nisum.stomas.demo.digitalproduct.entity.Product;

import java.util.List;

public interface ProductDAO {

    List<Product> findAll();
}
