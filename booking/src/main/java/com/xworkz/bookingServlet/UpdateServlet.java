package com.xworkz.bookingServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.bookingConst.BookingConst;
import com.xworkz.bookingService.BookingServiceImpl;

@WebServlet("/update")

public class UpdateServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String address=req.getParameter("address");
		String email=req.getParameter("email");
		
		BookingServiceImpl registrationService = new BookingServiceImpl();
        String ref = registrationService.updatedByemail(name,address,email);
        
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/update.jsp");
        requestDispatcher.forward(req, resp);
	}



	public String updatedByemail(String name,String address,String email) {
		String valid=null;
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				
				e1.printStackTrace();
			}
	    
	    try {
	    	connection = DriverManager.getConnection(BookingConst.URL.getValue(),BookingConst.USER.getValue(),BookingConst.PASSWORD.getValue());
	   
	       preparedStatement = connection.prepareStatement("Update booking_details set name=?, address=?  WHERE email = ?");
	       preparedStatement.setString(1,name);
	       preparedStatement.setString(2,address);
	       preparedStatement.setString(3,email);
	        
	        int update = preparedStatement.executeUpdate();
	        if (update > 0) {
	            System.out.println( " update successfully");
	        } else {
	            System.out.println("update is false");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return valid;
	}
}