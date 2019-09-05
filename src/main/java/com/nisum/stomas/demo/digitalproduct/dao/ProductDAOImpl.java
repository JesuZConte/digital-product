package com.nisum.stomas.demo.digitalproduct.dao;

import com.nisum.stomas.demo.digitalproduct.entity.Product;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {

    // define field for entitymanager
    private EntityManager entityManager;

    // setup constructor for injection
    @Autowired
    public ProductDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

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

    @Override
    public Product findById(int id) {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // get the product
        Product product = currentSession.get(Product.class, id);

        // return the product
        return product;
    }

    @Override
    public void save(Product product) {
        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // save product
        currentSession.saveOrUpdate(product);
    }

    @Override
    public void delete(int id) {
        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // delete object with primary key
        Query<Product> theQuery = currentSession.createQuery("delete from Product where id=:productId");
        theQuery.setParameter("productId", id);

        theQuery.executeUpdate();
    }
}
