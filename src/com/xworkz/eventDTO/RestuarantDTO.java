package com.xworkz.eventDTO;

import java.util.Objects;

public class RestuarantDTO {
	
	private int restuarantId;
	private String restuarantName;
	private String restuarantOwner;
	private String restuarantLocation;
	private int noOfStaffs;
	private String specialDish;
	private int quantity;
	private double price;
	private String restuarantType;
	private int openingHours;
	private int noOfTables;
	
	public RestuarantDTO() {
		super();
		
	}

	public RestuarantDTO(int restuarantId,String restuarantName, String restuarantOwner, String restuarantLocation, int noOfStaffs,
			String specialDish, int quantity, double price, String restuarantType, int openingHours,int noOfTables) {
		super();
		this.restuarantId = restuarantId;
		this.restuarantName = restuarantName;
		this.restuarantOwner = restuarantOwner;
		this.restuarantLocation = restuarantLocation;
		this.noOfStaffs = noOfStaffs;
		this.specialDish = specialDish;
		this.quantity = quantity;
		this.price = price;
		this.restuarantType = restuarantType;
		this.openingHours = openingHours;
		this.noOfTables = noOfTables;
	}

	@Override
	public String toString() {
		return "RestuarantDTO [restuarantId=" + restuarantId + ", restuarantName=" + restuarantName
				+ ", restuarantOwner=" + restuarantOwner + ", restuarantLocation=" + restuarantLocation
				+ ", noOfStaffs=" + noOfStaffs + ", specialDish=" + specialDish + ", quantity=" + quantity + ", price="
				+ price + ", restuarantType=" + restuarantType + ", openingHours=" + openingHours + ", noOfTables="
				+ noOfTables + "]";
	}

	public int getRestuarantId() {
		return restuarantId;
	}

	public void setRestuarantId(int restuarantId) {
		this.restuarantId = restuarantId;
	}

	public String getRestuarantName() {
		return restuarantName;
	}

	public void setRestuarantName(String restuarantName) {
		this.restuarantName = restuarantName;
	}

	public String getRestuarantOwner() {
		return restuarantOwner;
	}

	public void setRestuarantOwner(String restuarantOwner) {
		this.restuarantOwner = restuarantOwner;
	}

	public String getRestuarantLocation() {
		return restuarantLocation;
	}

	public void setRestuarantLocation(String restuarantLocation) {
		this.restuarantLocation = restuarantLocation;
	}

	public int getNoOfStaffs() {
		return noOfStaffs;
	}

	public void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}

	public String getSpecialDish() {
		return specialDish;
	}

	public void setSpecialDish(String specialDish) {
		this.specialDish = specialDish;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRestuarantType() {
		return restuarantType;
	}

	public void setRestuarantType(String restuarantType) {
		this.restuarantType = restuarantType;
	}

	public int getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(int openingHours) {
		this.openingHours = openingHours;
	}

	public int getNoOfTables() {
		return noOfTables;
	}

	public void setNoOfTables(int noOfTables) {
		this.noOfTables = noOfTables;
	}

	@Override
	public int hashCode() {
		return Objects.hash(noOfStaffs, noOfTables, openingHours, price, quantity, restuarantId, restuarantLocation,
				restuarantName, restuarantOwner, restuarantType, specialDish);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RestuarantDTO other = (RestuarantDTO) obj;
		return noOfStaffs == other.noOfStaffs && noOfTables == other.noOfTables && openingHours == other.openingHours
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity
				&& restuarantId == other.restuarantId && Objects.equals(restuarantLocation, other.restuarantLocation)
				&& Objects.equals(restuarantName, other.restuarantName)
				&& Objects.equals(restuarantOwner, other.restuarantOwner)
				&& Objects.equals(restuarantType, other.restuarantType)
				&& Objects.equals(specialDish, other.specialDish);
	}
	
	
	

}
