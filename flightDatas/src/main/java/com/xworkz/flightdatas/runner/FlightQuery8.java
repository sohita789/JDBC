package com.xworkz.flightdatas.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class FlightQuery8 {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			Query query = em.createNamedQuery("updateByName&Email");
			query.setParameter("weight", 40f);
			query.setParameter("travellerName", "Sohita");
			query.setParameter("phno", 748307990);
			float result = query.executeUpdate();
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (et.isActive())
				et.rollback();
			em.close();
			emf.close();
		}

	}
}


