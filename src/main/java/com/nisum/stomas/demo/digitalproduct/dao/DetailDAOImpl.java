package com.nisum.stomas.demo.digitalproduct.dao;

import com.nisum.stomas.demo.digitalproduct.entity.Detail;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
}
