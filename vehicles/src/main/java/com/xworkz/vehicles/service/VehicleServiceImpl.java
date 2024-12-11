package com.xworkz.vehicles.service;

import java.util.List;

import com.xworkz.vehicles.entity.VehicleEntity;
import com.xworkz.vehicles.repository.VehicleRepoImpl;
import com.xworkz.vehicles.repository.VehicleRepository;

public class VehicleServiceImpl implements VehicleService{
	@Override
	public List<VehicleEntity> getAllById(int id) {
		VehicleRepository vehicleRepositoryImpl = new VehicleRepoImpl();
		List<VehicleEntity> ref = vehicleRepositoryImpl.getAllById(id);
		return ref;
	}


	@Override
	public String getVehicleNameBycost(String vehicleName, double cost) {
		
		VehicleRepository vehicleRepositoryImpl = new VehicleRepoImpl();
		String ref = vehicleRepositoryImpl.getVehicleNameByCost(vehicleName, cost);
		return ref;
		
	}

}

