package com.xworkz.InstituteRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.ElectronicsRunner.ElectronicConst;

public class InstituteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            
            conn = DriverManager.getConnection(InstituteConst.URL.getValue(),InstituteConst.USERNAME.getValue(),InstituteConst.PASSWORD.getValue());

            pstmt = conn.prepareStatement("insert into institue_details values(?,?,?)");
            
            pstmt.setInt(1,101);
            pstmt.setString(2, "MTEMS");
            pstmt.setString(3, "20000");
            
            
           pstmt.setInt(1,102);
            pstmt.setString(2, "Kayaka Foundation");
           pstmt.setString(3, "40000");
           
            
            pstmt.setInt(1,103);
           pstmt.setString(2, "GodutaiClg");
            pstmt.setString(3, "45000");
           
            
            pstmt.setInt(1,104);
            pstmt.setString(2, "Muktambika");
            pstmt.setString(3, "35000");
            
            
           pstmt.setInt(1,105);
            pstmt.setString(2, "SB College");
            pstmt.setString(3, "75000");
      
            
            pstmt.setInt(1,106);
            pstmt.setString(2, "NV College");
            pstmt.setString(3, "15000");
           
            
           pstmt.setInt(1,107);
            pstmt.setString(2, "Sarvajnya");
            pstmt.setString(3, "65000");
            
            
            pstmt.setInt(1,108);
            pstmt.setString(2, "ShriGuru");
            pstmt.setString(3, "70000");
           
            
           pstmt.setInt(1,109);
            pstmt.setString(2, "dishaClg");
            pstmt.setString(3, "80000");
            
            
            pstmt.setInt(1,110);
            pstmt.setString(2, "Alvas University");
            pstmt.setString(3, "200000");
            
            
            pstmt.setInt(1,111);
            pstmt.setString(2, "Reva University");
            pstmt.setString(3, "250000");
            
            
            pstmt.setInt(1,112);
            pstmt.setString(2, "Acharya");
            pstmt.setString(3, "180000");
           
            
            pstmt.setInt(1,113);
            pstmt.setString(2, "BangaloreUniversity");
            pstmt.setString(3, "90000");
            
            
           pstmt.setInt(1,114);
            pstmt.setString(2, "SRN Mehta");
            pstmt.setString(3, "50000");
           
            
            pstmt.setInt(1,115);
            pstmt.setString(2, "SJR College");
            pstmt.setString(3, "120000");
            
            
            
            
            
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


