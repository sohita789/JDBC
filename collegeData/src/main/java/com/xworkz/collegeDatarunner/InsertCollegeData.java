package com.xworkz.collegeDatarunner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.collegedata.CollegeDataEntity;

public class InsertCollegeData {


public static void main(String[] args) {

	EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xyz");
	EntityManager eManager = emFactory.createEntityManager();
	EntityTransaction eTrans = eManager.getTransaction();

	List<CollegeDataEntity> list = new ArrayList<CollegeDataEntity>();
	list.add(new CollegeDataEntity(202423, "Karthi", "karthi23@gmail.com", "Commerce", 9922176290L, 25000));
	list.add(new CollegeDataEntity(202321, "Keerthi", "keerthi21@gmail.com", "Science", 807791254L, 26000));
	list.add(new CollegeDataEntity(202222, "Kamal", "kamal22@gmail.com", "Computer", 6757801023L, 21000));
	list.add(new CollegeDataEntity(202520, "Arul Kumar", "karthi23@gmail.com", "Maths", 7445102945L, 19000));
	list.add(new CollegeDataEntity(202424, "Saravanan", "saravanan24@gmail.com", "Physics", 9845371023L, 22000));
	list.add(new CollegeDataEntity(202325, "Vikram", "vikram25@gmail.com", "History", 8976543210L, 23000));
	list.add(new CollegeDataEntity(202226, "Priya", "priya26@gmail.com", "Biology", 9781234567L, 24000));
	list.add(new CollegeDataEntity(202527, "Manoj", "manoj27@gmail.com", "Geography", 9327654321L, 21000));
	list.add(new CollegeDataEntity(202426, "Sanjay", "sanjay28@gmail.com", "Economics", 9123456789L, 26000));
	list.add(new CollegeDataEntity(202328, "Anjali", "anjali29@gmail.com", "Political Science", 7894561230L, 25000));
	list.add(new CollegeDataEntity(202229, "Nirmal", "nirmal30@gmail.com", "Psychology", 8234567890L, 24000));
	list.add(new CollegeDataEntity(202530, "Meena", "meena31@gmail.com", "Sociology", 8765432109L, 23500));
	list.add(new CollegeDataEntity(202423, "Ravi", "ravi32@gmail.com", "Mathematics", 9678901234L, 22000));
	list.add(new CollegeDataEntity(202520, "Divya", "divya33@gmail.com", "Computer Science", 7986234591L, 21500));
	list.add(new CollegeDataEntity(202321, "Ajay", "ajay34@gmail.com", "Engineering", 9123456789L, 30000));
	list.add(new CollegeDataEntity(202222, "Sreeja", "sreeja35@gmail.com", "Statistics", 9154309876L, 23000));
	
	for(CollegeDataEntity entity : list) {
		
		eManager.persist(entity);
	}
	
	try {
		
		eTrans.begin();
		eTrans.commit();
		
	} catch (Exception e) {
		
		if(eTrans.isActive()) {
			eTrans.rollback();
		}
		e.printStackTrace();
	}finally {
		emFactory.close();
		eManager.close();
	}

}}
