package com.xworkz.event.readOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.eventEnum.RestuarantConst;

public class Selectquery2 {

		
	public static void main(String[] args) {


		Connection  connection=null;
		PreparedStatement prst=null;

		try {
			connection=DriverManager.getConnection(RestuarantConst.URL.getValue(), RestuarantConst.USERNAME.getValue(), RestuarantConst.PASSWORD.getValue());

			prst =connection.prepareStatement("select quantity, price from restuarant_table where specialDish='paneer'");
			ResultSet resultSet =prst.executeQuery();

			while(resultSet.next()) {

				System.out.println(resultSet.getString("quantity"));
				System.out.println(resultSet.getString("price"));
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	}
