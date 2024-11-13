package com.xworkz.ElectronicsRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ElectronicsRunner {

	public static void main(String[] args) {
		

		Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            
            conn = DriverManager.getConnection(ElectronicConst.URL.getValue(),ElectronicConst.USERNAME.getValue(),ElectronicConst.PASSWORD.getValue());

            pstmt = conn.prepareStatement("insert into electronics_table  values(?,?,?)");
            
            pstmt.setInt(1,1);
            pstmt.setString(2, "grinder");
            pstmt.setString(3, "Pigeon");
            pstmt.setString(4, "5000");
            
            pstmt.setInt(1,2);
            pstmt.setString(2, "washingMachine");
            pstmt.setString(3, "Samsung");
            pstmt.setString(4, "25000");
            
            pstmt.setInt(1,3);
            pstmt.setString(2, "AirCooler");
            pstmt.setString(3, "LG");
            pstmt.setString(4, "10000");
            
            pstmt.setInt(1,4);
            pstmt.setString(2, "HairStraightner");
            pstmt.setString(3, "Philips");
            pstmt.setString(4, "2000");
            
            pstmt.setInt(1,5);
            pstmt.setString(2, "HairDryer");
            pstmt.setString(3, "Philips");
            pstmt.setString(4, "1200");
            
            pstmt.setInt(1,6);
            pstmt.setString(2, "WaterHeater");
            pstmt.setString(3, "LG");
            pstmt.setString(4, "500");
            
            pstmt.setInt(1,7);
            pstmt.setString(2, "airpods");
            pstmt.setString(3, "onePlus");
            pstmt.setString(4, "3000");
            
            pstmt.setInt(1,8);
            pstmt.setString(2, "earPhones");
            pstmt.setString(3, "boat");
            pstmt.setString(4, "600");
            
            pstmt.setInt(1,9);
            pstmt.setString(2, "smartWatch");
            pstmt.setString(3, "Fastrack");
            pstmt.setString(4, "2500");
            
            pstmt.setInt(1,10);
            pstmt.setString(2, "phone");
            pstmt.setString(3, "Realme12");
            pstmt.setString(4, "25000");
            
           pstmt.setInt(1,11);
            pstmt.setString(2, "ElectricKettle");
            pstmt.setString(3, "Kent");
            pstmt.setString(4, "1300");
            
            pstmt.setInt(1,12);
            pstmt.setString(2, "keyboard");
            pstmt.setString(3, "dell");
            pstmt.setString(4, "1200");
            
            pstmt.setInt(1,13);
            pstmt.setString(2, "watch");
            pstmt.setString(3, "sonata");
            pstmt.setString(4, "1100");
            
            pstmt.setInt(1,14);
            pstmt.setString(2, "tab");
            pstmt.setString(3, "redmi");
            pstmt.setString(4, "19000");
            
            pstmt.setInt(1,15);
            pstmt.setString(2, "speakers");
            pstmt.setString(3, "JBL");
            pstmt.setString(4, "1699");
            
            
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
        }}

