package com.xworkz.fruits.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "fruitsData")


  @NamedQuery(name = "getPhNoById", query = "select pd.phNo from FruitEntity pd where pd.id= :setid")

  @NamedQuery(name = "getNameByQuantity", query = "select pd.name from FruitEntity pd where pd.quantity= :setQuantity")

  @NamedQuery(name = "getCostByphno", query = "select pd.cost from FruitEntity pd where pd.phone_no = :phno")

  @NamedQuery(name = "getMartName&Name", query = "select pd.martName from FruitEntity pd where pd.id=:setid and pd.name=:setname")

public class FruitEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "fruitName")
	private String fruitName;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "martName")
	private String martName;
	@Column(name = "phNo")
	private long phNo;
	@Column(name = "cost")
	private Double cost;
	@Column(name = "isitGood")
	private boolean isitGood;
	public FruitEntity(String fruitName, int quantity, String martName, long phNo, Double cost, boolean isitGood) {
		super();
		this.fruitName = fruitName;
		this.quantity = quantity;
		this.martName = martName;
		this.phNo = phNo;
		this.cost = cost;
		this.isitGood = isitGood;
	}
	public FruitEntity() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getMartName() {
		return martName;
	}
	public void setMartName(String martName) {
		this.martName = martName;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public boolean isIsitGood() {
		return isitGood;
	}
	public void setIsitGood(boolean isitGood) {
		this.isitGood = isitGood;
	}
	@Override
	public String toString() {
		return "FruitEntity [id=" + id + ", fruitName=" + fruitName + ", quantity=" + quantity + ", martName="
				+ martName + ", phNo=" + phNo + ", cost=" + cost + ", isitGood=" + isitGood + ", getId()=" + getId()
				+ ", getFruitName()=" + getFruitName() + ", getQuantity()=" + getQuantity() + ", getMartName()="
				+ getMartName() + ", getPhNo()=" + getPhNo() + ", getCost()=" + getCost() + ", isIsitGood()="
				+ isIsitGood() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}}
	
