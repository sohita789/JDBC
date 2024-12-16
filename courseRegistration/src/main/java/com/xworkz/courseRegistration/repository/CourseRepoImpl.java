package com.xworkz.courseRegistration.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.courseRegistration.entity.CourseEntity;

@Repository
public class CourseRepoImpl implements CourseRepository{

	@Autowired
    EntityManagerFactory entityManagerFactory;
	 
    @Override
    public boolean save(CourseEntity entity) {
        System.out.println("data in repositoryImpl===="+ entity);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        
        try{
        	
            entityTransaction.begin();
            entityManager.persist(entity);
            entityTransaction.commit();
        } 
        catch (Exception e) {
            if(entityTransaction.isActive()){
               entityTransaction.rollback();
            }
        }
        finally {
            entityManager.close();
        }
        return false;
    }

    @Override
    public String getNameByEmailAndPassword(String email, String password) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        String name = null;
        try{
            entityTransaction.begin();
            Query query = entityManager.createNamedQuery("getNameByEmailAndPassword");
            query.setParameter("byEmail",email).setParameter( "byPassword",password);
            name = (String) query.getSingleResult();


            entityTransaction.commit();
        } catch (Exception e) {
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
        }
        finally {
            entityManager.close();
        }
        return name;
    }
}




