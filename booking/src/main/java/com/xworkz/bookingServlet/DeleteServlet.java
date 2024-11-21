package com.xworkz.bookingServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.bookingService.BookingServiceImpl;

@WebServlet("/delete")
	public class DeleteServlet extends HttpServlet {

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String id=req.getParameter("id");
			int id1=Integer.valueOf(id);
			
			BookingServiceImpl registrationService = new BookingServiceImpl();
	        int ref = registrationService.deleteById(id1);
	        
	        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/delete.jsp");
	        requestDispatcher.forward(req, resp);
		}

	}

