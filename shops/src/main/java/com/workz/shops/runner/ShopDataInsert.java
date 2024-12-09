package com.workz.shops.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.workz.shops.dto.ShopEntity;

public class ShopDataInsert {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<ShopEntity> dto = new ArrayList<ShopEntity>();
		dto.add(new ShopEntity("Bhagyashree", "bhagya@gmail.com", 9874563214L, 22, "Bangalore"));
		dto.add(new ShopEntity("Shanta", "shanta@gmail.com", 8749586214L, 23, "Mysore"));
		dto.add(new ShopEntity("Sohita", "sohita@gmail.com", 9857595214L, 24, "RajajiNagar"));
		dto.add(new ShopEntity("Nikita", "nikita@gmail.com", 9874595486L, 17, "Kalburagi"));
		dto.add(new ShopEntity("Niriksha", "niriksha@gmail.com", 8745963578L, 15, "Mangaluru"));
		dto.add(new ShopEntity("Aarav", "aarav@gmail.com", 9876543210L, 20, "Chennai"));
		dto.add(new ShopEntity("Ananya", "ananya@gmail.com", 8765432109L, 14, "Hassan"));
		dto.add(new ShopEntity("Varun", "varun@gmail.com", 7654321098L, 13, "Belagavi"));
		dto.add(new ShopEntity("Meera", "meera@gmail.com", 6543210987L, 12, "Tumkur"));
		dto.add(new ShopEntity("Rohan", "rohan@gmail.com", 4321098765L, 15, "Chitradurga"));

		for (ShopEntity empDTO : dto) {
			ShopEntity emp = new ShopEntity();
			emp.setName(empDTO.getName());
			emp.setEmail(empDTO.getEmail());
			emp.setPhoneNo(empDTO.getPhoneNo());
			emp.setAge(empDTO.getAge());
			emp.setAddress(empDTO.getAddress());

			em.persist(emp);
		}

		try {
			et.begin();
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