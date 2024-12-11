package com.xworkz.vehicles.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "vehicledata")

  @NamedQuery(name = "getAll",query = "select a from VehicleEntity a where a.id=:setId")
  @NamedQuery(name = "getVehicleNameByCost" ,query = "select a.vehicleName from VehicleEntity a where a.vehicleName=:setvehicleName and a.cost=:setCost")


public class VehicleEntity {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public String vehicleName;
	public String vehicleType;
	public String brand;
	public double cost;
	public String email;
	
	@Override
	public String toString() {
		return "VehicleEntity [id=" + id + ", vehicleName=" + vehicleName + ", vehicleType=" + vehicleType + ", brand="
				+ brand + ", cost=" + cost + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public VehicleEntity() {
		super();
	}

	public VehicleEntity(String vehicleName, String vehicleType, String brand, double cost,String email) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
		this.brand = brand;
		this.cost = cost;
		this.email=email;
	}
	
	}
