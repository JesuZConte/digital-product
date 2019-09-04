package com.nisum.stomas.demo.digitalproduct.rest;

import com.nisum.stomas.demo.digitalproduct.dao.ProductDAO;
import com.nisum.stomas.demo.digitalproduct.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {


    private ProductDAO productDAO;

    // quick and dirty: inject product dao (use constructor injection)
    @Autowired
    public ProductRestController(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    // expose "/products" and return list of products

    @GetMapping("/products")
    public List<Product> findAll() {
        return productDAO.findAll();
    }

}
