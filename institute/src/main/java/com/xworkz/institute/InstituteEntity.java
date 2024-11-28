package com.xworkz.institute;

	
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;

	import org.hibernate.annotations.GenericGenerator;

	@Entity
		@Table(name = "institute_table")
		public class InstituteEntity {
			

				@Id
				@GenericGenerator(name = "sohita", strategy = "increment")
				@GeneratedValue(generator = "sohita")

				private int id;
				@Column(name = "name")
				private String name;
				@Column(name = "trainerName")
				private String trainerName;
				@Column(name = "email")
				private String email;
				@Column(name = "age")
				private int age;
				@Column(name = "phoneNumber")
				private int phoneNumber;
				
				
				public InstituteEntity() {
					super();
				}


				public InstituteEntity(String name, String trainerName, String email, int age,int phoneNumber) {
					super();
					this.name = name;
					this.trainerName = trainerName;
					this.email = email;
					this.age = age;
					this.phoneNumber = phoneNumber;
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


				public String getTrainerName() {
					return trainerName;
				}


				public void setTrainerName(String trainerName) {
					this.trainerName = trainerName;
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


				public int getPhoneNumber() {
					return phoneNumber;
				}


				public void setPhoneNumber(int phoneNumber) {
					this.phoneNumber = phoneNumber;
				}


				public void setAge(int age) {
					this.age = age;
				}
				
}
