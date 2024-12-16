package com.xworkz.xworkz_admin_details.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "xworkzdata")
public class XworkzEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		@Column(name = "name")
		private String name;
		@Column(name = "age")
		private int age;
		@Column(name = "email")
		private String email;
		@Column(name = "password")
		private String password;
		@Column(name = "confirmPassword")
		private String confirmPassword;
		@Column(name = "phoneNo")
		private String phoneNo;
		public XworkzEntity() {
			super();
		}
		public XworkzEntity(String name, int age, String email, String password, String confirmPassword, String phoneNo) {
			super();
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
			return "XworkzEntity [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", password="
					+ password + ", confirmPassword=" + confirmPassword + ", phoneNo=" + phoneNo + "]";
		}
		
		
		
}
