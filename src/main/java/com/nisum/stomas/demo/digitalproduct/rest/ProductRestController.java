package com.nisum.stomas.demo.digitalproduct.rest;

import com.nisum.stomas.demo.digitalproduct.entity.Product;
import com.nisum.stomas.demo.digitalproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {


    private ProductService productService;

    @Autowired
    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    // expose "/products" and return list of products

    @GetMapping("/products")
    public List<Product> findAll() {
        return productService.findAll();
    }

    // add mapping for GET /product/{productId}

    @GetMapping("/products/{productId}")
    public Product getProduct(@PathVariable int productId) {
        Product product = productService.findById(productId);

        if (product == null) {
            throw new RuntimeException("Product id not found - " + productId);
        }
        return product;
    }

    // add mapping for POST /products - add new product
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        product.setId(0);

        productService.save(product);

        return product;
    }

    // add mapping for PUT /products - update existing product
    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product) {
        productService.save(product);

        return product;
    }
}
