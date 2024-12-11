package com.xworkz.vehicles.service;

import java.util.List;

import com.xworkz.vehicles.entity.VehicleEntity;

public interface VehicleService {

	List<VehicleEntity> getAllById(int id);
	
	String getVehicleNameBycost(String vehicleName,double cost);

}


