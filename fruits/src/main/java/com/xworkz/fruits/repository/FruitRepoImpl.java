package com.xworkz.fruits.repository;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public  class FruitRepoImpl implements FruitRepository {

     @Override
	public long getPhNoById(int id) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Object object = em.createNamedQuery("getPhNoById").setParameter("setid", id).getSingleResult();
		Long long1 = (Long) object;

		try {
			et.begin();

			et.commit();

		} catch (Exception e) {
			if (et.isActive())
				et.rollback();
		} finally {
			em.close();
			emf.close();
		}
		return long1;
	}

  @Override

	public List<String> getNameByQuantity(int quantity) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<String> list = em.createNamedQuery("getNameByQuantity").setParameter("setQuantity", 2).getResultList();

		try {
			et.begin();

			et.commit();

		} catch (Exception e) {
			if (et.isActive())
				et.rollback();
		} finally {
			em.close();
			emf.close();
		}

		return list;
	}

	public Double getCostByphNo(long phNo) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Object object = em.createNamedQuery("getCostByphNo").setParameter("phno", phNo).getSingleResult();
		double cost = (Double) object;
		try {
			et.begin();

			et.commit();

		} catch (Exception e) {
			if (et.isActive())
				et.rollback();
		} finally {
			em.close();
			emf.close();
		}
		return cost;
	}

	@Override
	public String getMartNameandName(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getCostByphno(long phNo) {
		// TODO Auto-generated method stub
		return null;
	}


	
	

	

	
}