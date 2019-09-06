package com.nisum.stomas.demo.digitalproduct.dao;

import com.nisum.stomas.demo.digitalproduct.entity.Detail;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class DetailDAOImpl implements DetailDAO {

    private EntityManager entityManager;

    @Autowired
    public DetailDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public Detail getDetail(int id) {
        Session currentSession = entityManager.unwrap(Session.class);

        return (Detail) currentSession.get("detail", id);
    }

    @Override
    public void save(Detail detail) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(detail);
    }

    @Override
    public void delete(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Detail> theQuery = currentSession.createQuery("delete from Detail where id=:detailId");
        theQuery.setParameter("detailId", id);
        theQuery.executeUpdate();

    }
}
