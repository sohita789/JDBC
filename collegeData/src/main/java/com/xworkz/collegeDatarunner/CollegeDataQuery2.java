package com.xworkz.collegeDatarunner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.collegedata.CollegeDataEntity;

public class CollegeDataQuery2 {
	
	public static void main(String[] args) {

		EntityManagerFactory emF = Persistence.createEntityManagerFactory("xyz");
		EntityManager eM = emF.createEntityManager();
		EntityTransaction eTrans = eM.getTransaction();

		// Getting a All Data
		Query query = eM.createNamedQuery("findAll");
		List<CollegeDataEntity> list = query.getResultList();
		list.forEach(ref -> System.out.println(ref));

		try {
			eTrans.begin();
			eTrans.commit();

		} catch (Exception e) {
			if (eTrans.isActive()) {
				eTrans.rollback();
			}
		} finally {
			eM.close();
			emF.close();
		}

	}

}
