package bulb;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "state_details")
public class StateEntity {
@Id

private int id;
private String name;
private String chiefMinister;
private String educationMinister;
private double population;
private int noofdistricts;
private double area;
private String capitalcity;
private String famoussweet;
private double forestarea;

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
public String getChiefMinister() {
	return chiefMinister;
}
public void setChiefMinister(String chiefMinister) {
	this.chiefMinister = chiefMinister;
}
public String getEducationMinister() {
	return educationMinister;
}
public void setEducationMinister(String educationMinister) {
	this.educationMinister = educationMinister;
}
public double getPopulation() {
	return population;
}
public void setPopulation(double population) {
	this.population = population;
}
public int getNoofdistricts() {
	return noofdistricts;
}
public void setNoofdistricts(int noofdistricts) {
	this.noofdistricts = noofdistricts;
}
public double getArea() {
	return area;
}
public void setArea(double area) {
	this.area = area;
}
public String getCapitalcity() {
	return capitalcity;
}
public void setCapitalcity(String capitalcity) {
	this.capitalcity = capitalcity;
}
public String getFamoussweet() {
	return famoussweet;
}
public void setFamoussweet(String famoussweet) {
	this.famoussweet = famoussweet;
}
public double getForestarea() {
	return forestarea;
}
public void setForestarea(double forestarea) {
	this.forestarea = forestarea;
}



}
