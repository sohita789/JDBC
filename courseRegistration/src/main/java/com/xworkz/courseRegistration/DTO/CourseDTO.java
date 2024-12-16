package com.xworkz.courseRegistration.DTO;

public class CourseDTO {

	private int id;
	private String name;
	private int age;
	private String email;
	private String password;
	private String confirmPassword;
	private String phoneNo;
	public CourseDTO() {
		super();
	}
	public CourseDTO(int id, String name, int age, String email, String password, String confirmPassword,
			String phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.phoneNo = phoneNo;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "CourseDTO [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + ", phoneNo=" + phoneNo + "]";
	}
	
	
}
