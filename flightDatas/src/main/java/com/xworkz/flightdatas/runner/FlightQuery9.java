package com.xworkz.flightdatas.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FlightQuery9 {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			Query query = em.createNamedQuery("updateByEmailAndPhoneAndAge");
			query.setParameter("email", "riyak12@gmail.com");
			query.setParameter("phno", 987456322);
			query.setParameter("age", 43);
			int result = query.executeUpdate();
			if (result > 0) {
				System.out.println("updated");
			} else {
				System.out.println("not updated");
			}
			et.commit();
		} catch (Exception e) {
			if (et.isActive()) {
				et.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}

	}

}
	


