package com.example.springsecurityjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Transactional
@Repository
public class UserRepository {

    @Autowired
    EntityManager em;

    User findByUserName(String userName) {
        Query query = em.createQuery("SELECT e FROM User e WHERE e.user_name = :userName");
        query.setParameter("userName", userName);
        return (User) query.getSingleResult();
    }
}
