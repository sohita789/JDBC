package com.xworkz.collegeDatarunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CollegeDataQuery4 {
	public static void main(String[] args) {
		
		EntityManagerFactory emF = Persistence.createEntityManagerFactory("xyz");
		EntityManager eM = emF.createEntityManager();
		EntityTransaction eTrans = eM.getTransaction();
		// finding salary by Id
		Query query = eM.createNamedQuery("findSalaryById");
		query.setParameter("setId", 12);
		Object obj = query.getSingleResult();
		Double ref = (Double) obj;
		System.out.println("Salary :" + ref);

	}

}
	


