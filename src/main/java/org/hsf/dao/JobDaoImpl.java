package org.hsf.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.hsf.entities.Job;

import java.util.List;

public class JobDaoImpl implements JobDao {
    private EntityManager entityManager;

    public JobDaoImpl() {
        entityManager = Persistence.createEntityManagerFactory("ats-jpa-unit").createEntityManager();
    }

    @Override
    public Job createJob(Job job) {
        EntityTransaction tx = null;
        try {
            tx = entityManager.getTransaction();
            tx.begin();
            entityManager.persist(job);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            throw new RuntimeException("An error has occurred!");
        }
        return job;
    }

    @Override
    public List<Job> findByTitle(String title) {
        TypedQuery<Job> query = entityManager.createQuery("SELECT j " + " FROM Job j WHERE j.title LIKE :param", Job.class);
        query.setParameter("param", "%" + title + "%");
        return query.getResultList();
    }
}
