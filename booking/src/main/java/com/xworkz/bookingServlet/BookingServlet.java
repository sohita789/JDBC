package com.xworkz.bookingServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.bookingDTO.BookingDTO;
import com.xworkz.bookingService.BookingServiceImpl;

@WebServlet("/fill")
public class BookingServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id=req.getParameter("id");
		int convertedId=Integer.valueOf(id);
		
		String name=req.getParameter("name");
		String phoneNo=req.getParameter("phoneNo");
		long convertedPhone=Long.valueOf(phoneNo);
		String address=req.getParameter("address");
		String password=req.getParameter("password");
		String email=req.getParameter("email");
		String city=req.getParameter("city");
		
		BookingDTO dto = new BookingDTO(convertedId,name,convertedPhone,address, password,email,city);
		
		BookingServiceImpl registrationService = new BookingServiceImpl();
        registrationService.save(dto);
        
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(req, resp);
	}

	}
	


