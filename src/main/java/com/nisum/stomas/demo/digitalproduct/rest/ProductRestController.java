package com.nisum.stomas.demo.digitalproduct.rest;

import com.nisum.stomas.demo.digitalproduct.analytics.AnalyticsJSON;
import com.nisum.stomas.demo.digitalproduct.entity.Product;
import com.nisum.stomas.demo.digitalproduct.error.ErrorJSON;
import com.nisum.stomas.demo.digitalproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Controlador Rest para acceder a los servicios de un Producto.
 * @author L.J. Zúñiga
 * @version 1.0
 */
@RestController
@RequestMapping("/api")
public class ProductRestController {


    private ProductService productService;

    /**
     * Constructor que inyecta dependencia de ProductService.
     * @param productService servicio de un producto.
     */
    @Autowired
    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    /**
     * Obtiene lista de productos.
     * @return List
     */
    @GetMapping("/products")
    public List<Product> findAll() {
        return productService.findAll();
    }

    /**
     * Obtiene un Producto por id.
     * @param productId identificador de un producto.
     * @return Product
     */
    @GetMapping("/products/{productId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProduct(@PathVariable int productId) {
        final Map<String, Object> productToProductJSON = new HashMap<>();

        Product product = productService.findById(productId);

        if (product == null) {
            ErrorJSON errorJSON = new ErrorJSON();
            errorJSON.setMessage("Product id not found - " + productId);
            return Response.status(HttpStatus.NOT_FOUND.value()).entity(errorJSON).build();
        }

        productToProductJSON.put("Product", product);

        // Generar objeto Analytics data y agregarlo al objeto response solo para productos individuales
        AnalyticsJSON analytics = new AnalyticsJSON();
        productToProductJSON.put("Analytics", analytics);

        return Response.ok(productToProductJSON).build() ;
    }

    /**
     * Agrega un producto.
     * @param product Producto a agregar.
     * @return Product
     */
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        product.setId(0);

        productService.save(product);

        return product;
    }

    /**
     * Modifica un producto.
     * @param product producto a modificar.
     * @return Product
     */
    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product) {
        productService.save(product);

        return product;
    }

    /**
     * Elimina producto por id.
     * @param productId identificador del producto a eliminar.
     * @return String
     */
    @DeleteMapping("/products/{productId}")
    public String deleteProduct(@PathVariable int productId) {
        Product tempProduct = productService.findById(productId);

        if (tempProduct == null) {
            throw new RuntimeException("Product id not found - " + productId);
        }

        productService.deleteById(productId);

        return "Deleted product id - " + productId;
    }
}
