package com.xworkz.MobileRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class MobileRunner {

	public static void main(String[] args) {
		
		Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            
            conn = DriverManager.getConnection(MobileConst.URL.getValue(),MobileConst.USERNAME.getValue(),MobileConst.PASSWORD.getValue());

            pstmt = conn.prepareStatement("insert into mobile_info  values(?,?,?,?)");
            
            pstmt.setInt(1,1);
            pstmt.setString(2, "SamsungGalaxyA31");
            pstmt.setString(3, "29000");
            pstmt.setString(4, "16GB");
            
            pstmt.setInt(1,2);
            pstmt.setString(2, "Google pixel9 pro");
            pstmt.setString(3, "69000");
            pstmt.setString(4, "16GB");
            
            pstmt.setInt(1,3);
            pstmt.setString(2, "iphone15Plus");
            pstmt.setString(3, "67000");
            pstmt.setString(4, "16GB");
            
           pstmt.setInt(1,4);
            pstmt.setString(2, "Redmi125G");
            pstmt.setString(3, "14999");
            pstmt.setString(4, "4GB");
            
            pstmt.setInt(1,5);
            pstmt.setString(2, "OppoPlus");
            pstmt.setString(3, "39000");
            pstmt.setString(4, "4GB");
            
            pstmt.setInt(1,6);
            pstmt.setString(2, "Galaxy Z flip6");
            pstmt.setString(3, "29000");
            pstmt.setString(4, "16GB");
            
            
            
            
            
            
            
            int value = pstmt.executeUpdate();
            
            if(value>0) {
            	System.out.println("saved");
            }
            else {
            	System.out.println("not saved");
            }
        }
        catch(SQLException e) {
        	e.printStackTrace();
        }
        }


	}


