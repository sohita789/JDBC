package com.xworkz.collegeDatarunner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.collegedata.CollegeDataEntity;

public class CollegeDataQuery1 {

	public static void main(String[] args) {

		EntityManagerFactory emF = Persistence.createEntityManagerFactory("xyz");
		EntityManager eM = emF.createEntityManager();
		EntityTransaction eTrans = eM.getTransaction();

		// Data Finding by ProfessorId
		Query query1 = eM.createNamedQuery("findByProfessorId");
		query1.setParameter("profId", 202520);

		Object obj = query1.getSingleResult();
		CollegeDataEntity inst = (CollegeDataEntity) obj;
		System.out.println("Value of the Professor Id :" + inst);
  

		}


		}
		
	
