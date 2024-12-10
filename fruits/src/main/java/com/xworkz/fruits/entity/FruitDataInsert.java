package com.xworkz.fruits.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class FruitDataInsert {
	
	 public static void main(String[] args) {

	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction et = em.getTransaction();

	        try {

	            List<FruitEntity> list = new ArrayList<FruitEntity>();
	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	            list.add(new FruitEntity("orange",4,"ashirwad",9972997179L,100.0,true));
	             list.add(new FruitEntity("pineapple",1,"fruitCenter",9972997177L,60.0,false ));
	            list.add(new FruitEntity("kiwi",2,"fruitCenter",8088251187L,80.0,true));
	            list.add(new FruitEntity("guava",6,"fruitCenter",9088251187L,55.0,true));
	            list.add(new FruitEntity("Mango",4,"zeptoCafe",7898251187L,65.0,true));
	            list.add(new FruitEntity("grapes",100,"zeptoCafe",7898251167L,125.0,false));
	            list.add(new FruitEntity("dragon",1,"fruitCenter",9948251187L,75.0,true));
	            
	            et.begin();
	            for (FruitEntity entity : list) {
	                em.persist(entity);
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



