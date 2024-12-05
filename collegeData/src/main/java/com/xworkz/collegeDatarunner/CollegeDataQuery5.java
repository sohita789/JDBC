package com.xworkz.collegeDatarunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CollegeDataQuery5 {
	
public static void main(String[] args) {
		
		EntityManagerFactory emF = Persistence.createEntityManagerFactory("xyz");
		EntityManager eM = emF.createEntityManager();
		EntityTransaction eTrans = eM.getTransaction();
		// find officeNo By Name
		Query query=eM.createNamedQuery("findOfficeNoByName");
		query.setParameter("setName", "Keerthi");
		Object obj= query.getSingleResult();
	    Double ref= (Double)obj;
		System.out.println("Value of the OfficeNo :"+ref);

	}

}


