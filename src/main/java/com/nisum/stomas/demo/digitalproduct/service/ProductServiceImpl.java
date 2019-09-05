package com.nisum.stomas.demo.digitalproduct.service;

import com.nisum.stomas.demo.digitalproduct.dao.ProductDAO;
import com.nisum.stomas.demo.digitalproduct.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductDAO productDAO;

    @Autowired
    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    @Transactional
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    @Transactional
    public Product findById(int id) {
        return productDAO.findById(id);
    }

    @Override
    @Transactional
    public void save(Product product) {
        productDAO.save(product);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        productDAO.delete(id);
    }
}
