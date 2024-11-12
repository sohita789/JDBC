package com.xworkz.Restuarant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Restuarant {

	public static void main(String[] args) {
		
	
		        String url = "jdbc:mysql://localhost:3306/restuarant_name"; // Database URL
		        String user = "root"; // 
		        String password = "xworkzodc"; // Database password

		        Connection conn = null;
		        PreparedStatement pstmt = null;

		        try {
		            
		            conn = DriverManager.getConnection(url, user, password);

		            
		            String sql = "INSERT INTO restuarant_name  (1,'sohita','swapna','Masala Dosa') VALUES (2,'shanta','bhagya','puri' )";
		            pstmt = conn.prepareStatement(sql);

		            
		            pstmt.setString(1, "1,'soh','swapna','dosa'"); // Set the first parameter
		            pstmt.setInt(2, 2); // Set the second parameter (example with integer)

		            // Execute the INSERT query
		            int rowsAffected = pstmt.executeUpdate();
		            System.out.println(rowsAffected + " row(s) inserted.");

		        } catch (SQLException e) {
		            e.printStackTrace();
		        } finally {
		            // Close resources
		            try {
		                if (pstmt != null) pstmt.close();
		                if (conn != null) conn.close();
		            } catch (SQLException ex) {
		                ex.printStackTrace();
		            }
		        }
		    }
		

	}


