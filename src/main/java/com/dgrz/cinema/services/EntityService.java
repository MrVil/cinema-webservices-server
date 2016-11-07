package com.dgrz.cinema.services;

/**
 * Created by thomasd on 07/11/16.
 */
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;

public abstract class EntityService
{
    protected EntityManager entitymanager;
    protected EntityManagerFactory emf;

    public EntityTransaction startTransaction()
    {
        emf=Persistence.createEntityManagerFactory("persistenceUnit");
        //new PersistenceJPAConfig();
        entitymanager=emf.createEntityManager();
        return entitymanager.getTransaction();
    }

    public Object find(Class classe, int id) {
        Object object = null;

        EntityTransaction transaction = startTransaction();
        transaction.begin();

        object = entitymanager.find(classe, id);
        entitymanager.close();
        emf.close();

        return object;
    }


    public ArrayList findAll(String sql){
        EntityTransaction transaction = startTransaction();
        transaction.begin();
        ArrayList listObject = (ArrayList) entitymanager.createQuery(sql).getResultList();
        entitymanager.close();
        emf.close();
        return listObject;
    }

    public ArrayList findAllWithLimit(String sql, int offset, int limit){

        EntityTransaction transaction = startTransaction();
        transaction.begin();

        Query query = entitymanager.createQuery(sql);
        query.setFirstResult((offset) * limit);
        query.setMaxResults(limit);
        ArrayList listObject = (ArrayList) query.getResultList();
        entitymanager.close();
        emf.close();
        return listObject;
    }

    public void insert(Object object){
        EntityTransaction transaction = startTransaction();
        if (!entitymanager.contains(object)) {
            transaction.begin();
            entitymanager.persist(object);
            entitymanager.flush();
            transaction.commit();
        }
        entitymanager.close();
    }

    public void update(Object object) {

        EntityTransaction transaction = startTransaction();
        transaction.begin();
        entitymanager.merge(object);
        transaction.commit();
        entitymanager.close();
        emf.close();
    }

    public boolean delete(Class classe, int id) {

        EntityTransaction transaction = startTransaction();
        transaction.begin();

        Object object = entitymanager.find(classe, id);
        entitymanager.remove(object);
        entitymanager.getTransaction().commit();

        entitymanager.close();
        emf.close();

        return true;
    }
}
