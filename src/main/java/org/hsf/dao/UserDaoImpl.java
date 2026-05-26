package org.hsf.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.hsf.entities.Department;
import org.hsf.entities.User;

import java.util.List;

public class UserDaoImpl implements UserDao{
    private EntityManager entityManager;

    public UserDaoImpl() {
        entityManager = Persistence.createEntityManagerFactory("ats-jpa-unit").createEntityManager();
    }

    @Override
    public List<User> findAll() {
        TypedQuery<User> query = entityManager.createQuery("SELECT u " + " FROM User u", User.class);
        return query.getResultList();
    }

    @Override
    public User createUser(User user) {
        EntityTransaction tx = null;
        try {
            tx = entityManager.getTransaction();
            tx.begin();
            entityManager.persist(user);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            throw new RuntimeException("An error has occurred!");
        }
        return user;
    }
}
