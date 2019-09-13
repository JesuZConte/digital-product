package com.nisum.stomas.demo.digitalproduct.dao;

import com.nisum.stomas.demo.digitalproduct.entity.Product;

import java.util.List;

/**
 * Provee acceso a la base de datos de Producto (Data Access Object)
 * @author L. J. Zúñiga
 * @version 1.0
 */
public interface ProductDAO {

    /**
     * Obtiene lista de Productos
     * @return List
     */
    List<Product> findAll();

    /**
     * Obtiene Producto por id
     * @param id identificador de un Producto
     * @return Product
     */
    Product findById(int id);

    /**
     * Guarda o Actualiza Producto
     * @param product Producto
     */
    void save(Product product);

    /**
     * Elimina Producto por id
     * @param id identificador de un Producto
     */
    void delete(int id);
}
