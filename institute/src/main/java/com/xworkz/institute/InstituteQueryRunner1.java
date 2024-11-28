package com.xworkz.institute;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InstituteQueryRunner1 {
	
	public static void main(String[]args) {
		
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	List<InstituteEntity> list = em.createQuery("select cd.name, cd.phoneNumber from InstituteEntity cd where cd.age >27", InstituteEntity.class)
			.getResultList();
	
	for(InstituteEntity entity: list) {
		System.out.println("InstituteEntity = "+ entity.getName() + ", "+ entity.getAge());
	}
	
	try {
		et.begin();
		et.commit();
		
	} catch (Exception e) {
		if(et.isActive()) {
			et.rollback();
		}
	}finally {
		emf.close();
		em.close();
	}
}
	}
