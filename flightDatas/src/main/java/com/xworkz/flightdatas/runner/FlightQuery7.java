package com.xworkz.flightdatas.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FlightQuery7 {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			Query query = em.createNamedQuery("update");
			query.setParameter("email", "kriti@gmail.com");
			query.setParameter("phno", 748307991);
			query.setParameter("is_smoker", false);
			int result = query.executeUpdate();
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



