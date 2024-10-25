package com.xworkz.River.Runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class River {
	public static void main(String[]args) {
	String url="jdbc:mysql://localhost:3306/hospital_name";
    String userName="root";
	String password="xworkzodc";
	String insertQuery="insert into doctor_name values(210,'Amulya','Dengue')";
			
	
	Connection connection = null;
	
	
	try {
		connection=DriverManager.getConnection(url,userName,password);
		Statement statement = connection.createStatement();
		int value = statement.executeUpdate(insertQuery);
		
		if(value>0) {
			System.out.println("this is saved");
			
			}
		else {
			System.out.println("this is not saved");
		}
	if(connection!=null) {
		System.out.println("this is connected");
	}
	else {
		System.out.println("not connected");
		                                                                           
	}}
	
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
	
	
