package com.xworkz.consultancies.ConsultancyRepoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.consultancies.ConsultancyConst.Consultancy;
import com.xworkz.consultancies.ConsultancyDTO.ConsultancyDTO;
import com.xworkz.consultancies.ConsultancyRepo.ConsultancyRepo;

public class ConsultancyRepoImpl implements ConsultancyRepo {
	@Override
	public boolean save(ConsultancyDTO DTO) {
		
		boolean ifSaved=false;
			 try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	        }
	        catch(ClassNotFoundException e) {
	        	e.printStackTrace();
	        }
	        
	        try {
	        	Connection connection=null;
	        	
	        
	        	
	        connection = DriverManager.getConnection(Consultancy.URL.getValue(), Consultancy.USER.getValue(), Consultancy.PASSWORD.getValue());
	        PreparedStatement prepare=null; 
	           connection.prepareStatement( "INSERT INTO consultancy_table VALUES (?, ?, ?, ?)");
	          
	            prepare.setString(1, DTO.getConsultancyName());
	           
	            prepare.setString(2, DTO.getConsultantName());
	            prepare.setString(3, DTO.getPrimaryContact());
	            prepare.setString(4, DTO.getEmail());

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

		
		
