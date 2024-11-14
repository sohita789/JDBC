package com.xworkz.eventRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.eventDTO.RestuarantDTO;
import com.xworkz.eventEnum.RestuarantConst;



public class RestuarantRunner {

	public static void main(String[] args) {
		
		 RestuarantDTO restuarantDTO1 = new RestuarantDTO(101,"venkatgiri","ramesh","JewargiRoad",25,"paneer",2,250,"veg",12,60);
	        RestuarantDTO restuarantDTO2 = new RestuarantDTO(102,"TheGourmet","chef Gordon Ramsay","123 CulinaryStreet",25,"chocolateSoufee",3,800,"veg",10,60);
	        RestuarantDTO restuarantDTO3 = new RestuarantDTO(103,"SpiceParadise","chef Anjali Kapoor","RedRoad",25,"GulabJamun",2,150,"indian",12,50);
	        RestuarantDTO restuarantDTO4 = new RestuarantDTO(104,"OceansDelight","mahesh","Bangalore",35,"paneer",4,350,"veg",10,90);
	        RestuarantDTO restuarantDTO5 = new RestuarantDTO(105,"UrbanBistro","hazi","magadiRoad",55,"IceCream",5,850,"veg",22,70);
	        RestuarantDTO restuarantDTO6 = new RestuarantDTO(106,"TheGreenLeaf","omkar","Rajajinagar",45,"gobi65",3,650,"veg",20,80);
	        RestuarantDTO restuarantDTO7 = new RestuarantDTO(107,"RusticHaven","maheshwari","hyderabad",65,"Biryani",1,670,"indian",9,20); 
	        RestuarantDTO restuarantDTO8 = new RestuarantDTO(108,"FireAndIceGrill","rakshitha","Karnataka",75,"IceCreamJamun",10,550,"snacks",6,30);
	        RestuarantDTO restuarantDTO9 = new RestuarantDTO(109,"BellaItalia","bhagya","churchRoad",15,"chocolate",7,950,"desserts",8,90);
	        RestuarantDTO restuarantDTO10 = new RestuarantDTO(110,"The DessertDen","mamatha","pune",35,"ColdCakes",5,550,"soup",4,60);
		
		
     try {
        	
        	Connection conn = null;
            PreparedStatement pstmt = null;
            
            
            conn = DriverManager.getConnection(RestuarantConst.URL.getValue(),RestuarantConst.USERNAME.getValue(),RestuarantConst.PASSWORD.getValue());
           String sql="insert into restuarant_table  values(?,?,?,?,?,?,?,?,?,?,?)";
           pstmt = conn.prepareStatement(sql);
           // pstmt = conn.prepareStatement("insert into restuarant_table  values(?,?,?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1, "restuarantDTO.getRestuarantId()");
            pstmt.setString(2, "restuarantDTO.getRestuarantName()");
            pstmt.setString(3, "restuarantDTO.getRestuarantOwner()");
            pstmt.setString(4, "restuarantDTO.getRestuarantLocation()"); 
            pstmt.setString(5, "restuarantDTO.getNoOfStaffs()"); 
            pstmt.setString(6, "restuarantDTO.getSpecialDish()"); 
            pstmt.setString(7, "restuarantDTO.getQuantity()");
            pstmt.setString(8, "restuarantDTO.getPrice()"); 
            pstmt.setString(9, "restuarantDTO.getRestuarantType()");
            pstmt.setString(10, "restuarantDTO.getOpeningHours()");
            pstmt.setString(11, "restuarantDTO.getnoOfTables()");
            
            ///////////////
            pstmt.setString(1, "restuarantDTO1.getRestuarantId()");
            pstmt.setString(2, "restuarantDTO1.getRestuarantName()");
            pstmt.setString(3, "restuarantDTO1.getRestuarantOwner()");
            pstmt.setString(4, "restuarantDTO1.getRestuarantLocation()"); 
            pstmt.setString(5, "restuarantDTO1.getNoOfStaffs()"); 
            pstmt.setString(6, "restuarantDTO1.getSpecialDish()"); 
            pstmt.setString(7, "restuarantDTO1.getQuantity()");
            pstmt.setString(8, "restuarantDTO1.getPrice()"); 
            pstmt.setString(9, "restuarantDTO1.getRestuarantType()");
            pstmt.setString(10, "restuarantDTO1.getOpeningHours()");
            pstmt.setString(11, "restuarantDTO1.getnoOfTables()");
            
            pstmt.setString(1, "restuarantDTO2.getRestuarantId()");
            pstmt.setString(2, "restuarantDTO2.getRestuarantName()");
            pstmt.setString(3, "restuarantDTO2.getRestuarantOwner()");
            pstmt.setString(4, "restuarantDTO2.getRestuarantLocation()"); 
            pstmt.setString(5, "restuarantDTO2.getNoOfStaffs()"); 
            pstmt.setString(6, "restuarantDTO2.getSpecialDish()"); 
            pstmt.setString(7, "restuarantDTO2.getQuantity()");
            pstmt.setString(8, "restuarantDTO2.getPrice()"); 
            pstmt.setString(9, "restuarantDTO2.getRestuarantType()");
            pstmt.setString(10, "restuarantDTO2.getOpeningHours()");
            pstmt.setString(11, "restuarantDTO2.getnoOfTables()");
            
            pstmt.setString(1, "restuarantDTO3.getRestuarantId()");
            pstmt.setString(2, "restuarantDTO3.getRestuarantName()");
            pstmt.setString(3, "restuarantDTO3.getRestuarantOwner()");
            pstmt.setString(4, "restuarantDTO3.getRestuarantLocation()"); 
            pstmt.setString(5, "restuarantDTO3.getNoOfStaffs()"); 
            pstmt.setString(6, "restuarantDTO3.getSpecialDish()"); 
            pstmt.setString(7, "restuarantDTO3.getQuantity()");
            pstmt.setString(8, "restuarantDTO3.getPrice()"); 
            pstmt.setString(9, "restuarantDTO3.getRestuarantType()");
            pstmt.setString(10, "restuarantDTO3.getOpeningHours()");
            pstmt.setString(11, "restuarantDTO3.getnoOfTables()");
            
            pstmt.setString(1, "restuarantDTO4.getRestuarantId()");
            pstmt.setString(2, "restuarantDTO4.getRestuarantName()");
            pstmt.setString(3, "restuarantDTO4.getRestuarantOwner()");
            pstmt.setString(4, "restuarantDTO4.getRestuarantLocation()"); 
            pstmt.setString(5, "restuarantDTO4.getNoOfStaffs()"); 
            pstmt.setString(6, "restuarantDTO4.getSpecialDish()"); 
            pstmt.setString(7, "restuarantDTO4.getQuantity()");
            pstmt.setString(8, "restuarantDTO4.getPrice()"); 
            pstmt.setString(9, "restuarantDTO4.getRestuarantType()");
            pstmt.setString(10, "restuarantDTO4.getOpeningHours()");
            pstmt.setString(11, "restuarantDTO4.getnoOfTables()");
            
            pstmt.setString(1, "restuarantDTO5.getRestuarantId()");
            pstmt.setString(2, "restuarantDTO5.getRestuarantName()");
            pstmt.setString(3, "restuarantDTO5.getRestuarantOwner()");
            pstmt.setString(4, "restuarantDTO5.getRestuarantLocation()"); 
            pstmt.setString(5, "restuarantDTO5.getNoOfStaffs()"); 
            pstmt.setString(6, "restuarantDTO5.getSpecialDish()"); 
            pstmt.setString(7, "restuarantDTO5.getQuantity()");
            pstmt.setString(8, "restuarantDTO5.getPrice()"); 
            pstmt.setString(9, "restuarantDTO5.getRestuarantType()");
            pstmt.setString(10, "restuarantDTO5.getOpeningHours()");
            pstmt.setString(11, "restuarantDTO5.getnoOfTables()");
            
            pstmt.setString(1, "restuarantDTO6.getRestuarantId()");
            pstmt.setString(2, "restuarantDTO6.getRestuarantName()");
            pstmt.setString(3, "restuarantDTO6.getRestuarantOwner()");
            pstmt.setString(4, "restuarantDTO6.getRestuarantLocation()"); 
            pstmt.setString(5, "restuarantDTO6.getNoOfStaffs()"); 
            pstmt.setString(6, "restuarantDTO6.getSpecialDish()"); 
            pstmt.setString(7, "restuarantDTO6.getQuantity()");
            pstmt.setString(8, "restuarantDTO6.getPrice()"); 
            pstmt.setString(9, "restuarantDTO6.getRestuarantType()");
            pstmt.setString(10, "restuarantDTO6.getOpeningHours()");
            pstmt.setString(11, "restuarantDTO6.getnoOfTables()");
            
            pstmt.setString(1, "restuarantDTO7.getRestuarantId()");
            pstmt.setString(2, "restuarantDTO7.getRestuarantName()");
            pstmt.setString(3, "restuarantDTO7.getRestuarantOwner()");
            pstmt.setString(4, "restuarantDTO7.getRestuarantLocation()"); 
            pstmt.setString(5, "restuarantDTO7.getNoOfStaffs()"); 
            pstmt.setString(6, "restuarantDTO7.getSpecialDish()"); 
            pstmt.setString(7, "restuarantDTO7.getQuantity()");
            pstmt.setString(8, "restuarantDTO7.getPrice()"); 
            pstmt.setString(9, "restuarantDTO7.getRestuarantType()");
            pstmt.setString(10, "restuarantDTO7.getOpeningHours()");
            pstmt.setString(11, "restuarantDTO7.getnoOfTables()");
            
            pstmt.setString(1, "restuarantDTO8.getRestuarantId()");
            pstmt.setString(2, "restuarantDTO8.getRestuarantName()");
            pstmt.setString(3, "restuarantDTO8.getRestuarantOwner()");
            pstmt.setString(4, "restuarantDTO8.getRestuarantLocation()"); 
            pstmt.setString(5, "restuarantDTO8.getNoOfStaffs()"); 
            pstmt.setString(6, "restuarantDTO8.getSpecialDish()"); 
            pstmt.setString(7, "restuarantDTO8.getQuantity()");
            pstmt.setString(8, "restuarantDTO8.getPrice()"); 
            pstmt.setString(9, "restuarantDTO8.getRestuarantType()");
            pstmt.setString(10, "restuarantDTO8.getOpeningHours()");
            pstmt.setString(11, "restuarantDTO8.getnoOfTables()");
            
            pstmt.setString(1, "restuarantDTO9.getRestuarantId()");
            pstmt.setString(2, "restuarantDTO9.getRestuarantName()");
            pstmt.setString(3, "restuarantDTO9.getRestuarantOwner()");
            pstmt.setString(4, "restuarantDTO9.getRestuarantLocation()"); 
            pstmt.setString(5, "restuarantDTO9.getNoOfStaffs()"); 
            pstmt.setString(6, "restuarantDTO9.getSpecialDish()"); 
            pstmt.setString(7, "restuarantDTO9.getQuantity()");
            pstmt.setString(8, "restuarantDTO9.getPrice()"); 
            pstmt.setString(9, "restuarantDTO9.getRestuarantType()");
            pstmt.setString(10, "restuarantDTO9.getOpeningHours()");
            pstmt.setString(11, "restuarantDTO9.getnoOfTables()");
            
            pstmt.setString(1, "restuarantDTO10.getRestuarantId()");
            pstmt.setString(2, "restuarantDTO10.getRestuarantName()");
            pstmt.setString(3, "restuarantDTO10.getRestuarantOwner()");
            pstmt.setString(4, "restuarantDTO10.getRestuarantLocation()"); 
            pstmt.setString(5, "restuarantDTO10.getNoOfStaffs()"); 
            pstmt.setString(6, "restuarantDTO10.getSpecialDish()"); 
            pstmt.setString(7, "restuarantDTO10.getQuantity()");
            pstmt.setString(8, "restuarantDTO10.getPrice()"); 
            pstmt.setString(9, "restuarantDTO10.getRestuarantType()");
            pstmt.setString(10, "restuarantDTO10.getOpeningHours()");
            pstmt.setString(11, "restuarantDTO10.getnoOfTables()");
            
           
            
            
            
         
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



