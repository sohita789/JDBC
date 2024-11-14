package com.xworkz.event.readOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.eventEnum.RestuarantConst;

public class SelectQuery6 {
	
	public static void main(String[] args) {

		Connection connection= null;
		PreparedStatement prst= null;

		try {
			connection=DriverManager.getConnection(RestuarantConst.URL.getValue(), RestuarantConst.USERNAME.getValue(), RestuarantConst.PASSWORD.getValue());
			prst=connection.prepareStatement("SELECT * FROM restuarant_table");
			ResultSet result = prst.executeQuery();

			while(result.next()) {
				System.out.println(result.getString("restuarant_name"));
				System.out.println(result.getString("restuarant_owner"));
				System.out.println(result.getString("restuarantLocation"));
				System.out.println(result.getString("noOfStaffs"));
				System.out.println(result.getString("specialDish"));
				System.out.println(result.getString("quantity"));
				System.out.println(result.getString("price"));
			
				
			}
		} catch (SQLException e) {


			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
