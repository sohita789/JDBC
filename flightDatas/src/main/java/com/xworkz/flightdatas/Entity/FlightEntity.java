package com.xworkz.flightdatas.Entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

        @Entity
	    @Table(name = "flightdata")
        @NamedQuery(name = "getAll", query = "select hc from FlightEntity hc")
        @NamedQuery(name = "getById", query = "select hc.travellername, hc.email from FlightEntity hc where hc.id= :id")
        @NamedQuery(name = "getCountByAge", query = "select count(hc) from  FlightEntity hc where hc.age> :age")

        @NamedQuery(name = "getSingleAll", query = "select hc from FlightEntity hc where hc.id= :id")

        @NamedQuery(name = "getAllbyName&Email", query = "select hc from FlightEntity hc where hc.travellername= :name and hc.email= :email")

        @NamedQuery(name = "deleteByByName&Age", query = "delete from FlightEntity hc where hc.travellername= :name and hc.age= :age")

        @NamedQuery(name = "update", query = "update  FlightEntity hc set hc.is_smoker = :is_smoker where hc.email= :email and hc.phno= :phno")

        @NamedQuery(name="updateByName&Email", query = "update FlightEntity  hc set hc.weight= :weight where hc.travellername= :name and hc.phno= :phno")
        
		public class FlightEntity {
	     @Id
			
	     @GeneratedValue(strategy = GenerationType.IDENTITY)
			
	        private  int id;
			
		    private String travellerName;
			private String email;
			private int age;
			private double blood_pressure;
			private float travellerweight;
			private LocalDateTime date_time;
			private int ticketprice;
			private int phno;
			private boolean is_smoker;
			

			public FlightEntity() {
				super();
			}


			public FlightEntity( String travellerName, String email, int age, double blood_pressure,
					float travellerweight, LocalDateTime date_time, int ticketprice, int phno, boolean is_smoker) {
				super();
				
				this.travellerName = travellerName;
				this.email = email;
				this.age = age;
				this.blood_pressure = blood_pressure;
				this.travellerweight = travellerweight;
				this.date_time = date_time;
				this.ticketprice = ticketprice;
				this.phno = phno;
				this.is_smoker = is_smoker;
			}
			
			
			
			public int getId() {
				return id;
			}


			public void setId(int id) {
				this.id = id;
			}


			public String getTravellerName() {
				return travellerName;
			}


			public void setTravellerName(String travellerName) {
				this.travellerName = travellerName;
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


			public double getBlood_pressure() {
				return blood_pressure;
			}


			public void setBlood_pressure(double blood_pressure) {
				this.blood_pressure = blood_pressure;
			}


			public float getTravellerweight() {
				return travellerweight;
			}


			public void setTravellerweight(float travellerweight) {
				this.travellerweight = travellerweight;
			}


			public LocalDateTime getDate_time() {
				return date_time;
			}


			public void setDate_time(LocalDateTime date_time) {
				this.date_time = date_time;
			}


			public int getTicketprice() {
				return ticketprice;
			}


			public void setTicketprice(int ticketprice) {
				this.ticketprice = ticketprice;
			}


			public int getPhno() {
				return phno;
			}


			public void setPhno(int phno) {
				this.phno = phno;
			}


			public boolean isIs_smoker() {
				return is_smoker;
			}


			public void setIs_smoker(boolean is_smoker) {
				this.is_smoker = is_smoker;
			}


			@Override
			public String toString() {
				return "FlightEntity [id=" + id + ", travellerName=" + travellerName + ", email=" + email + ", age="
						+ age + ", blood_pressure=" + blood_pressure + ", travellerweight=" + travellerweight
						+ ", date_time=" + date_time + ", ticketprice=" + ticketprice + ", phno=" + phno
						+ ", is_smoker=" + is_smoker + "]";
			}


			
			
}
