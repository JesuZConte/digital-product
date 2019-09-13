package com.nisum.stomas.demo.digitalproduct.service;

import com.nisum.stomas.demo.digitalproduct.dao.ProductDAO;
import com.nisum.stomas.demo.digitalproduct.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Implementación de la interfaz ProductService
 * @author L.J. Zúñiga
 * @version 1.0
 */
@Service
public class ProductServiceImpl implements ProductService{

    private ProductDAO productDAO;

    /**
     * Constructor que inyecta dependencia de ProductDAO.
     * @param productDAO objeto que permite el acceso a la persistencia de producto.
     */
    @Autowired
    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public Product findById(int id) {
        return productDAO.findById(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public void save(Product product) {
        productDAO.save(product);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public void deleteById(int id) {
        productDAO.delete(id);
    }
}
