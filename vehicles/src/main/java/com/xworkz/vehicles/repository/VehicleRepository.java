package com.xworkz.vehicles.repository;

import java.util.List;

import com.xworkz.vehicles.entity.VehicleEntity;

public interface VehicleRepository {
	
List<VehicleEntity> getAllById(int id);
	
	String getVehicleNameByCost(String vehicleName,double cost);
}

