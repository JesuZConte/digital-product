package com.nisum.stomas.demo.digitalproduct.dao;

import com.nisum.stomas.demo.digitalproduct.entity.Product;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Implementación de interfaz ProductDAO
 * @author L. J. Zúñiga
 * @version 1.0
 */
@Repository
public class ProductDAOImpl implements ProductDAO {

    private EntityManager entityManager;

    private DetailDAO detailDao;

    /**
     * Constructor que inyecta dependencia de la interfaz EntityManager y de DetailDAO
     * @param entityManager permite interactuar con el contexto de persistencia
     * @param detailDao acceso para data de detalle de un producto
     */
    @Autowired
    public ProductDAOImpl(EntityManager entityManager, DetailDAO detailDao) {
        this.entityManager = entityManager;
        this.detailDao = detailDao;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Product> findAll() {
        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // create a query
        Query<Product> theQuery = currentSession.createQuery("from Product", Product.class);


        // execute query and get result list
        List<Product> products = theQuery.getResultList();

        // return the results
        return products;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Product findById(int id) {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // get the product
        Product product = currentSession.get(Product.class, id);

        // return the product
        return product;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(Product product) {
        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        product.getProductDetail().setProduct(product);

        // save product
        currentSession.saveOrUpdate(product);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(int id) {
        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // deleting product detail first
        detailDao.delete(id);

        // deleting product

        Query<Product> productQuery = currentSession.createQuery("delete from Product where product_id=:productId");
        productQuery.setParameter("productId", id);

        productQuery.executeUpdate();
    }
}
