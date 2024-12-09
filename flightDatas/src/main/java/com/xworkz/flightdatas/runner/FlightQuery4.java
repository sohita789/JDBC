package com.xworkz.flightdatas.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.flightdatas.Entity.FlightEntity;

public class FlightQuery4 {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query query = em.createNamedQuery("getSingleAll");
		query.setParameter("id", 4);
		query.setParameter("id",5);
		List<FlightEntity> str = (List<FlightEntity>)query.getResultList();
		str.forEach(ref->System.out.println(ref));
	}


}


