package com.xworkz.xworkz_admin_details.repository;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.xworkz_admin_details.entity.XworkzEntity;
@Repository
public class XworkzRepoImpl implements XworkzRepository{
	
	@Autowired
	EntityManagerFactory emf;
	@Override
	public boolean save(XworkzEntity xworkzEntity) {
		System.out.println("saving entity");

	   EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
        EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			et.begin();
			em.persist(xworkzEntity);
			et.commit();
			
		} catch (Exception e) {
			if (et.isActive()) {
				et.rollback();
			}
		} finally {
			em.close();
			//emf.close();
		}

		return true;
	}

}
