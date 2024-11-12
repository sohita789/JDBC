package com.xworkz.infosys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InfosysRunner1 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/infosys";
	    String userName="root";
		String password="xworkzodc";
		
		String selectQuery ="select * from infosys where email='kousalya@gmail.com'";
		String selectQuery1="select company_details status from employee where name='renuka' and mobile_no='8088251187'";
		String selectQuery2="select company_details email,designation from infosys where mobile_no='9972997179' and name='vidya'";
		String selectQuery3="select company_details email, from infosys where mobile_no ='7892199805'";
		String selectQuery4="select company_details name from infosys where id>10";
		
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(url,userName,password);
			Statement statement1 =connection.createStatement();
			ResultSet resultset1 = statement1.executeQuery(selectQuery1);
			
			while(resultset1.next()) {
				System.out.println(resultset1.getString("Name"));
				System.out.println(resultset1.getString("mobile_no"));
				
			}
			System.out.println("----------------------");
			Statement statement2 =connection.createStatement();
			ResultSet resultset2 = statement2.executeQuery(selectQuery2);
			
			while(resultset2.next()) {
				System.out.println(resultset2.getString("Email"));
				System.out.println(resultset2.getString("designation"));
				
			}
			System.out.println("----------------------");
			Statement statement3 =connection.createStatement();
			ResultSet resultset3 = statement2.executeQuery(selectQuery3);
			
			while(resultset3.next()) {
				System.out.println(resultset3.getString("Email"));
				System.out.println(resultset3.getString("Password"));
				}
			
			System.out.println("----------------------");
			
			Statement statement4 =connection.createStatement();
			ResultSet resultset4 = statement4.executeQuery(selectQuery4);
			
			while(resultset4.next()) {
				System.out.println(resultset4.getString("Email"));
				System.out.println(resultset4.getString("Password"));
				}
		}
			
			catch(Exception e) {
				e.printStackTrace();
			}
			
			}

	}


