package com.xworkz.vehicles.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.vehicles.entity.VehicleEntity;
import com.xworkz.vehicles.service.VehicleServiceImpl;

public class VehicleDataInsert {
	 public static void main(String[] args) {

	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction et = em.getTransaction();

	        try {

	            List<VehicleEntity> list = new ArrayList<VehicleEntity>();
	           
	            list.add(new VehicleEntity("car","fourWheeler","mahindra",600000,"sohita@gmail.com"));
	            list.add(new VehicleEntity("Bike","TwoWheeler","RoyalEnfield",120000,"swapna@gmail.com"));
	            list.add(new VehicleEntity("scooter","TwoWheeler","Activa",90000,"sachin@gmail.com"));
	            list.add(new VehicleEntity("cycle","twowheels","xyz",15000,"shanta@gmail.com"));
	            
	            et.begin();
	            for (VehicleEntity entity : list) {
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
	        VehicleServiceImpl vehicleServiceImpl = new VehicleServiceImpl();
			
			List<VehicleEntity> ref = vehicleServiceImpl.getAllById(2);
			for (VehicleEntity vehicleEntity : ref) {
				System.out.println(vehicleEntity);
			}

			String ref1 = vehicleServiceImpl.getVehicleNameBycost("car",600000 ) ;
			System.out.println(ref1);
		}
	    }
	






