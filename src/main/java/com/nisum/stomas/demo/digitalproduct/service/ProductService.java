package com.nisum.stomas.demo.digitalproduct.service;

import com.nisum.stomas.demo.digitalproduct.entity.Product;

import java.util.List;

/**
 * Servicio que permite interactuar con los Objectos de Acceso a la persistencia.
 * @author L.J Zúñiga
 * @version 1.0
 */
public interface ProductService {

    /**
     * Obtiene lista de productos.
     * @return List
     */
    List<Product> findAll();

    /**
     * Obtiene producto por id.
     * @param id identificador de un producto.
     * @return Product
     */
    Product findById(int id);

    /**
     * Guarda o actualiza producto.
     * @param product producto.
     */
    void save(Product product);

    /**
     * Elimina producto por id.
     * @param id identificador
     */
    void deleteById(int id);
}
