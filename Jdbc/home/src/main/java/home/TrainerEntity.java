package home;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;



@Entity
@Table(name = "trainerdetails")
public class TrainerEntity {
@Id	

private int id;
private String name;
private String email;
private int age;
private String branch;
private String company;
private String designation;
private double salary;
private int experience;
private String city;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}

