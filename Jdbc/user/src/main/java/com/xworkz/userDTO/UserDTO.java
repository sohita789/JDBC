package com.xworkz.userDTO;

public class UserDTO {

        private int id;
	    private String name;
	    private String phoneNumber;
	    private String email;
	    private int age;

	    // Constructors, Getters, and Setters
	    public UserDTO(String name, String phoneNumber, String email, int age) {
	        this.name = name;
	        this.phoneNumber = phoneNumber;
	        this.email = email;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
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

	    @Override
	    public String toString() {
	        return "UserDTO{" +
	                "name='" + name + '\'' +
	                ", phoneNumber='" + phoneNumber + '\'' +
	                ", email='" + email + '\'' +
	                ", age=" + age +
	                '}';
	    }
	}

