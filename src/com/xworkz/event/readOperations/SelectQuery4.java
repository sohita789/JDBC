package com.xworkz.event.readOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.eventEnum.RestuarantConst;

public class SelectQuery4 {
	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement prst = null;

		try {
			connection = DriverManager.getConnection(RestuarantConst.URL.getValue(), RestuarantConst.USERNAME.getValue(),
					RestuarantConst.PASSWORD.getValue());

			prst =connection.prepareStatement("select specialDish from restuarant_table where id >5");
			ResultSet resultSet =prst.executeQuery();

			while(resultSet.next()) {
				System.out.println("ID : "+resultSet.getString("specialDish"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
