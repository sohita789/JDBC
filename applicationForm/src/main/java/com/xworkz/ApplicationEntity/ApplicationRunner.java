package com.xworkz.ApplicationEntity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ApplicationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("app");
		EntityManager eManager=emFactory.createEntityManager();
		EntityTransaction eTrans=eManager.getTransaction();
		
		List<ApplicationEntity> list=new ArrayList<ApplicationEntity>();
		list.add(new ApplicationEntity(20115, "parachute oil", 213, "HairCare"));
		list.add(new ApplicationEntity(28012, "Wellcore-Creatine", 600, "Supplements"));
		list.add(new ApplicationEntity(30012, "Jockey-InnerWear", 400, "Undergarments"));
		list.add(new ApplicationEntity(40518, "Nothing 2A +", 21999, "Mobiles"));
		list.add(new ApplicationEntity(10316, "Milton-Flask", 999, "Kitchenware"));
		list.add(new ApplicationEntity(70518, "CakeTins", 249, "Kitchenware"));
		list.add(new ApplicationEntity(00510, "Drone E88 Pro", 2640, "Cameras"));
		list.add(new ApplicationEntity(80745, "HDMI Cable", 499, "Accessories"));
		list.add(new ApplicationEntity(10505, "Vim liquid", 470, "Kitchenware"));
		list.add(new ApplicationEntity(19087, "U-shape Neck Pillow", 210, "Home Accessories"));
		list.add(new ApplicationEntity(10102, "Hamaam Soap", 100, "Bath&Body"));
		list.add(new ApplicationEntity(34560, "DSLR Camera", 52999, "Electronics"));
		list.add(new ApplicationEntity(10135, "Fitness Tracker", 1000, "Sports"));
		list.add(new ApplicationEntity(19084, "Desk Lamp", 699, "Furniture"));
		list.add(new ApplicationEntity(67686, "Running Shoes", 1499, "Footwear"));
		
for (ApplicationEntity appEntity : list) {
			
		    eManager.persist(appEntity);
		}
		
		try {
			eTrans.begin();
			eTrans.commit();
			
		} catch (Exception e) {
			if(eTrans.isActive()) {
				eTrans.rollback();
			}
		}finally {
			eManager.close();
			emFactory.close();
		}

	}

}
