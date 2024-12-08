package com.xworkz.flightdatas.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.flightdatas.Entity.FlightEntity;


public class FlightQuery5 {
	
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query query = em.createNamedQuery("getAllbyName&Email");
		query.setParameter("name", "Swapna");
		query.setParameter("email", "swapna@gmail.com");
		
		List<FlightEntity> list = query.getResultList();
		list.forEach(ref->System.out.println(ref));
	}

}




