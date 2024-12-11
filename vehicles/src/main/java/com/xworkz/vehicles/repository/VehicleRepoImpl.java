package com.xworkz.vehicles.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.vehicles.entity.VehicleEntity;

public class VehicleRepoImpl implements VehicleRepository{
	

	@Override
	public List<VehicleEntity> getAllById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<VehicleEntity> list = em.createNamedQuery("getAll").setParameter("setId", id).getResultList();

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

	@Override
	public String getVehicleNameByCost(String vehicleName, double cost) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Object object = em.createNamedQuery("getvehicleNameBycost").setParameter("setvehicleName", vehicleName)
				.setParameter("setCost", vehicleName).getSingleResult();
		String string = (String) object;
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

		return string;
	}

}

