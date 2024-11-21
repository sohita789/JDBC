package com.xworkz.bookingDTO;

public class BookingDTO {
	
private int id;
private String name;
private long phoneNo;
private String email;
private String password;
private String address;
private String city;

public BookingDTO(int id, String name, long phoneNo, String email, String password, String address, String city) {
	super();
	this.name = name;
	this.id = id;
	this.phoneNo = phoneNo;
	this.email = email;
	this.password = password;
	this.address = address;
	this.city = city;
}

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

public long getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "BookingDTO [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + ", password="
			+ password + ", address=" + address + ", city=" + city + "]";
}




}