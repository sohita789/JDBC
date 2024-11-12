package com.xworkz.monday;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.Statement;

public class MetroQueryRunner {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/metro";
		String userName="root";
		String password="xworkzodc";
		
		String selectQuery = "select name from metro_details where email='alice.johnson@example.com' and password='password123';";
		String selectQuery1 = "select destination from metro_details where name='Steve Hall' and phone_no='555-0119';";
		String selectQuery2 = "select email,password from metro_details where phone_no='555-0118';";
		String selectQuery3 = "select email,password from metro_details where phone_no='555-0105' and name='Eve Black';";
		String selectQuery4 = "select name from metro_details where id>10";

Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(url,userName,password);
			Statement statement1 =connection.createStatement();
			ResultSet resultset1 = statement1.executeQuery(selectQuery1);
			
			while(resultset1.next()) {
				System.out.println(resultset1.getString("Name"));
				System.out.println(resultset1.getString("phone no"));
				
			}
			System.out.println("----------------------");
			Statement statement2 =connection.createStatement();
			ResultSet resultset2 = statement2.executeQuery(selectQuery2);
			
			while(resultset2.next()) {
				System.out.println(resultset2.getString("Email"));
				System.out.println(resultset2.getString("destination"));
				
			}
			System.out.println("-----------------");
			Statement statement3 = connection.createStatement();
			ResultSet resultset3 = statement3.executeQuery(selectQuery3);
			
			while(resultset3.next()) {
				System.out.println(resultset3.getString("Email"));
				System.out.println(resultset3.getString("destination"));
			}
			System.out.println("-----------------");
			Statement statement4 = connection.createStatement();
			ResultSet resultset4 = statement4.executeQuery(selectQuery4);
			
			while(resultset4.next()) {
				System.out.println(resultset4.getString("Email"));
				System.out.println(resultset4.getString("destination"));
			}
			
			System.out.println("-----------------");
			Statement statement5 = connection.createStatement();
			ResultSet resultset5 = statement3.executeQuery(selectQuery);
			
			while(resultset4.next()) {
				System.out.println(resultset3.getString("Email"));
				System.out.println(resultset3.getString("destination"));
			}
		}
			
			catch(Exception e) {
				e.printStackTrace();
			}
			
			}
			
			
		

	




	}


