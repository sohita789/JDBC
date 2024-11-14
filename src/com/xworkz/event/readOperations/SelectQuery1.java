package com.xworkz.event.readOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.eventEnum.RestuarantConst;

public class SelectQuery1 {

	public static void main(String[] args) {

		Connection  connection=null;
		PreparedStatement prst=null;

		try {
			connection=DriverManager.getConnection(RestuarantConst.URL.getValue(), RestuarantConst.USERNAME.getValue(), RestuarantConst.PASSWORD.getValue());

			prst =connection.prepareStatement("select restuarantLocation from restuarant_table where restuarant_name='venkatgiri' and restuarant_owner='ramesh'");
			ResultSet resultSet =prst.executeQuery();

			while(resultSet.next()) {
				System.out.println(resultSet.getString("restuarantLocation"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}

	
