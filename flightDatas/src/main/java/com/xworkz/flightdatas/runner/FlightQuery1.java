package com.xworkz.flightdatas.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.flightdatas.Entity.FlightEntity;

public class FlightQuery1 {
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query query = em.createNamedQuery("getAll");
		List<FlightEntity> list = (List<FlightEntity>)query.getResultList();
		for(FlightEntity fde: list) {
			System.out.println(fde);
		}
	}

}


