package com.xworkz.ShowRoomRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowRoomRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/showroom";
		String userName="root";
		String password="xworkzodc";
		String insertQuery="INSERT INTO showroom_table VALUES (1, 'Luxury Auto Showroom', 'Sports Cars'),"+
				"(2, 'Eco-Friendly Showroom', 'Electric Vehicles'),"+
				"(3, 'Family Car Showroom', 'SUVs and Minivans'),"+
				"(4, 'Vintage Car Showroom', 'Classic Cars'),"+
				"(5, 'Motorbike Showroom', 'Motorcycles'),"+
				"(6, 'Budget Car Showroom', 'Affordable Sedans'),"+
				"(7, 'Luxury SUV Showroom', 'High-End SUVs'),"+
				"(8, 'Convertible Showroom', 'Cabriolets'),"+
				"(9, 'Off-Road Showroom', '4x4 Vehicles'),"+
				"(10, 'Performance Showroom', 'Racing Cars'),"+
				"(11, 'Commercial Vehicle Showroom', 'Vans and Trucks'),"+
				"(12, 'Crossover Showroom', 'Compact SUVs'),"+
				"(13, 'Hybrid Showroom', 'Hybrid Vehicles'),"+
				"(14, 'Showroom of the Future', 'Autonomous Vehicles'),"+
				"(15, 'Design Studio Showroom', 'Custom Builds'),"+
				"(16, 'Family SUV Showroom', 'Spacious SUVs'),"+
				"(17, 'Sports Bike Showroom', 'High-Performance Bikes'),"+
				"(18, 'Luxury Electric Showroom', 'Premium EVs'),"+
				"(19, 'City Car Showroom', 'Compact Cars'),"+
				"(20, 'Luxury Custom Showroom', 'Bespoke Vehicles')";

		
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url, userName, password);
			Statement statement=connection.createStatement();
			int value=statement.executeUpdate(insertQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}


