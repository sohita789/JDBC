package com.xworkz.Ecommerce.Runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ecommerce{

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/software_company";
	    String userName="root";
		String password="xworkzodc";
		String insertQuery="insert into company_name values(1,'Amith','amith@gmail.com')";
		
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
	}}