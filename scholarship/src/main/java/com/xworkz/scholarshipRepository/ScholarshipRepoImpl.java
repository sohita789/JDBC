package com.xworkz.scholarshipRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.scholarshipConstant.ScholarshipConst;
import com.xworkz.scholarshipDTO.ScholarshipDTO;

public class ScholarshipRepoImpl implements ScholarshipRepository {

	public boolean save(ScholarshipDTO dTO) {
		
		
		boolean ifSaved=false;
			 try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	        }
	        catch(ClassNotFoundException e) {
	        	e.printStackTrace();
	        }
	        
	        try {
	        	Connection connection=null;
	        connection = DriverManager.getConnection(ScholarshipConst.URL.getValue(), ScholarshipConst.USER.getValue(), ScholarshipConst.PASSWORD.getValue());
	        PreparedStatement prepare=null; 
	           connection.prepareStatement( "INSERT INTO scholarship_details values(id,studentName,course,email) VALUES (?, ?, ?, ?)");
	          
	            prepare.setString(1, dTO.getId());
	             prepare.setString(2, dTO.getStudentName());
	            prepare.setString(3, dTO.getCourse());
	            prepare.setString(4, dTO.getEmail());

	            int values = prepare.executeUpdate();
	            if(values>0) {
	            	System.out.println("data is saved");
	            	ifSaved=true;
	            }
	            else {
	            	System.out.println("data is not saved");
	            	ifSaved=false;
	            }
	             } catch (SQLException e) {
	            e.printStackTrace();
	        }
	            return ifSaved;
	        }
	    }


