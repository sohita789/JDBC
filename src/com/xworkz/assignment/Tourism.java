package com.xworkz.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Tourism {

	     static String url = "jdbc:mysql://localhost:3306/tourism";
	     static String user = "root";
	     static String password = "xworkzodc";

	    public static void main(String[] args) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;

	        try {
	          
	            connection = DriverManager.getConnection(url, user, password);

	           
	            String sql = "INSERT INTO Users "
	            		+"(1,'dandeli','sohita')"
	            		+"(2,'ghats','swapna')";
	            preparedStatement = connection.prepareStatement(sql);

	       
	            preparedStatement.setString(1, "John Doe");
	            preparedStatement.setString(2, "john.doe@example.com");

	       
	            int rowsAffected = preparedStatement.executeUpdate();
	            System.out.println("Rows affected: " + rowsAffected);

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            // Close resources
	            try {
	                if (preparedStatement != null) preparedStatement.close();
	                if (connection != null) connection.close();
	            } catch (SQLException ex) {
	                ex.printStackTrace();
	            }
	        }
	    }
	}


