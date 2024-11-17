package com.xworkz.consultancies.Runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.consultancies.ConsultancyConst.Consultancy;

public class ConsultancyRunner {

public static void main(String[] args) {
		
		Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            
            conn = DriverManager.getConnection(Consultancy.URL.getValue(),Consultancy.USER.getValue(),Consultancy.PASSWORD.getValue());

            pstmt = conn.prepareStatement("insert into consultancy_table  values(?,?,?,?)");
            
            pstmt.setInt(1,1);
            pstmt.setString(2, "harisha");
            pstmt.setString(3, "bnbnsdbsv");
            pstmt.setString(4, "sohita@gmail.com");
            
            
 int value = pstmt.executeUpdate();
            
            if(value>0) {
            	System.out.println(" Dress data is saved");
            }
            else {
            	System.out.println("data not saved");
            }
        }
        catch(SQLException e) {
        	e.printStackTrace();
        }
        }


	}

