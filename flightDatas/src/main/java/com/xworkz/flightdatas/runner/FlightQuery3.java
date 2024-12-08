package com.xworkz.flightdatas.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FlightQuery3 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query query = em.createNamedQuery("getCountByAge");
		
		query.setParameter("age", 15);
		Long age = (Long)query.getSingleResult();
		System.out.println("Age count is: "+age);
	}

}



