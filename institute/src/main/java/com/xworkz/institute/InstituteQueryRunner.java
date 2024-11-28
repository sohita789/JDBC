package com.xworkz.institute;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class InstituteQueryRunner {
	
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em .getTransaction();
		
		 List<InstituteEntity> list = em.createQuery("select cd from InstituteEntity cd",InstituteEntity .class)
				.getResultList();

		for (InstituteEntity entity : list) {
			System.out.println("Institute List = " + entity.getName() + ", " + entity.getEmail() + ", " + entity.getAge() + " ,"
					+entity.getPhoneNumber());
		}

		try {

			et.begin();

			int query = em
					.createQuery("UPDATE InstituteEntity c SET c.name = :myname, c.email = :myemail WHERE "
							+ "c.phoneNumber = :phoneNumber")
					.setParameter("myname", "Assadiq").setParameter("myemail", "assadiq@gmail.com")
					.setParameter("phoneNumber", Integer.valueOf("997299717")).executeUpdate();
					//here i given phoneNo data type as long so i use Integer.valueOf() method and it's change String to Integer

			if (query > 0) {
				System.out.println("Update Succesfully");
			} else {
				System.err.println("Not Update");
			}

			et.commit();

		} catch (Exception e) {
			if (et.isActive()) {
				et.rollback();
			}
		} finally {
      em.close();
			emf.close();
		}

	}

}


