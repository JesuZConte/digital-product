package com.nisum.stomas.demo.digitalproduct.dao;

import com.nisum.stomas.demo.digitalproduct.entity.Detail;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

/**
 * Implementación de interfaz DetailDAO
 * @author L. J. Zúñiga
 * @version 1.0
 */
@Repository
public class DetailDAOImpl implements DetailDAO {

    private EntityManager entityManager;

    /**
     * Constructor que inyecta dependencia de la interfaz EntityManager
     * @param entityManager permite interactuar con el contexto de persistencia
     */
    @Autowired
    public DetailDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public Detail getDetail(int id) {
        Session currentSession = entityManager.unwrap(Session.class);

        return (Detail) currentSession.get("detail", id);
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public void save(Detail detail) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(detail);
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public void delete(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Detail> theQuery = currentSession.createQuery("delete from Detail where product_id=:detailId");
        theQuery.setParameter("detailId", id);
        theQuery.executeUpdate();

    }
}
