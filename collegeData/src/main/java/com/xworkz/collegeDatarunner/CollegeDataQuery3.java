package com.xworkz.collegeDatarunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CollegeDataQuery3 {
	
	public static void main(String[] args) {

		EntityManagerFactory emF = Persistence.createEntityManagerFactory("xyz");
		EntityManager eM = emF.createEntityManager();
		EntityTransaction eTrans = eM.getTransaction();
		// find name by Email

		Query query = eM.createNamedQuery("findNameByEmail");
		query.setParameter("getEmail", "anjali29@gmail.com");
		Object obj = query.getSingleResult();
		String str = (String) obj;
		System.out.println("Values : " + str);

	}

}

