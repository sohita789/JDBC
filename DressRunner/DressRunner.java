package com.xworkz.DressRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DressRunner {

	public static void main(String[] args) {
	
		Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            
            conn = DriverManager.getConnection(DressConst.URL.getValue(),DressConst.USERNAME.getValue(),DressConst.PASSWORD.getValue());

            pstmt = conn.prepareStatement("insert into dress_type  values(?,?,?,?)");
            
            pstmt.setInt(1,1);
            pstmt.setString(2, "orionMall");
            pstmt.setString(3, "Jeans");
            pstmt.setString(4, "1299");
            
            pstmt.setInt(1,2);
            pstmt.setString(2, "orchidMall");
            pstmt.setString(3, "skirts");
            pstmt.setString(4, "2299");
            
            pstmt.setInt(1,3);
            pstmt.setString(2, "luluMall");
            pstmt.setString(3, "baggyJeans");
            pstmt.setString(4, "1399");
            
            pstmt.setInt(1,4);
            pstmt.setString(2, "AsianMall");
           pstmt.setString(3, "Straightjeans");
           pstmt.setString(4, "999");
            
            pstmt.setInt(1,5);
            pstmt.setString(2, "MaxMall");
            pstmt.setString(3, "SweatShirts");
            pstmt.setString(4, "1799");
            
            pstmt.setInt(1,6);
            pstmt.setString(2, "VishalMall");
            pstmt.setString(3, "kidsJeans");
            pstmt.setString(4, "799");
            
           pstmt.setInt(1,7);
            pstmt.setString(2, "showoff");
            pstmt.setString(3, "gowns");
            pstmt.setString(4, "2299");
            
           pstmt.setInt(1,8);
            pstmt.setString(2, "Calcutta");
            pstmt.setString(3, "KurtiSet");
            pstmt.setString(4, "2499");
            
            pstmt.setInt(1,9);
            pstmt.setString(2, "pheonix");
            pstmt.setString(3, "T-shirt");
            pstmt.setString(4, "1249");
            
           pstmt.setInt(1,10);
            pstmt.setString(2, "Kancheevaram");
            pstmt.setString(3, "Sarees");
            pstmt.setString(4, "4500");
            
            pstmt.setInt(1,11);
            pstmt.setString(2, "Urban");
            pstmt.setString(3, "longTops");
            pstmt.setString(4, "1299");
            
           pstmt.setInt(1,12);
            pstmt.setString(2, "D-Mart");
           pstmt.setString(3, "shortKurtis");
            pstmt.setString(4, "499");
            
            pstmt.setInt(1,13);
            pstmt.setString(2, "vijaylaxmi");
            pstmt.setString(3, "halfSarees");
            pstmt.setString(4, "6799");
            
            pstmt.setInt(1,14);
            pstmt.setString(2, "mantriMall");
            pstmt.setString(3, "Jackets");
            pstmt.setString(4, "3299");
            
           pstmt.setInt(1,15);
            pstmt.setString(2, "MallOFAsia");
            pstmt.setString(3, "ShortSkirts");
           pstmt.setString(4, "5000");
            
            
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


