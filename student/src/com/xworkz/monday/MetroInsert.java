package com.xworkz.monday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MetroInsert {
	
	public static void main(String[] args) {
	
		String url="jdbc:mysql://localhost:3306/metro";
		String userName="root";
		String password="xworkzodc";
		
		String insertSQL = "INSERT INTO metro  VALUES "
	  + "(1, 'sohita','sohita@gmail.com', '@sohita123',9353239507,'KBS' ,'Yelahanka', 20, 400, 245),"
				
      +" (2, 'shanta','shanta@gmail.com','shanta@123',6328463787,'yashwantapur','hebbal',30,15,456),"
      +" (3, 'bhagya','bhgya@gmail.com','bhagya@123',3652416255,'Hyderabad','metroStation',24,54,978),"
      +" (4, 'kalpana','kalpana@gmail.com','kalpana@123',978634735,'hebbal','malleshwaram',23,76,877),"
      +" (5, 'renuka','renuka@gmail.com','renuka@123',8088470191,'yadgir','bangalore',43,54,677),"
      +" (6, 'swapna','swapna@gmail.com','swapna@123',9972997179,'kalaburagi','bangalore',23,34,877),"
      +" (7, 'shrriii','shri@gmail.com','shri@123',8088251187,'mysore','metroStation',34,76,877),"
      +" (8, 'supriya','supriya@gmail.com','supriya@123',990099480,'chikkaballapur','doddballapur',36,78,899),"
      +" (9, 'maheshwari','maheshwari@gmail.com','mahi@123',636462478,'mysore','lalbagh',34,76,877),"
      +" (10, 'praveen','tengli@gmail.com','praveen@123',8088856591,'hyderabad','telangana',34,76,877),"
      +"(11, 'bablu','bablu@gmail.com','babli@123',7892199805,'shahpur','karnataka',67,98,232),"
      +"(12, 'kavya','kavaya@gmail.com','kvya@123',870945231,'shahabad','kalabuaragi',45,32,21),"
      +"(13,'bhavya','bhaya@gmail.com','bhavya@123',780945231,'chikkpete','vijaynagara',86,54,332),"
      +"(14 ,'nanditha','nanaditha@gmail.com','nandu@123',678921436,'vijaypura','vijaywada',87,98,090),"
      +"(15,'niveditha','nimi@gmail.com','nivi@123',890956431,'shivamoaga','udupi',67,09,89),"
      +"(16, 'divya','divya@gmail.com','divi@123',890956437,'kodaguu','kodekanal',67,89,09),"
      +"(17, 'kaveri','ka@gmail.com','ka@1234',9972997179,'hassan','hubbali',89,65,87),"
      +"(18, 'keerthi','keeeee@gmail.com','keerti@12',908756343,'aland','afzalpur',43,87,90),"
      +"(19, 'pallavi','palli@gmail.com','pallavi@123,990099480,'mumbai','pune',78,09,23),"
      +"(20,'kusum','kusum@gmail.com','kusum@123',987654321,'pune','maharashtra',67,45,32)";

	}}