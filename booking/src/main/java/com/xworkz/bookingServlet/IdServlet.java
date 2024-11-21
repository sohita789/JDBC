package com.xworkz.bookingServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.bookingService.BookingServiceImpl;

@WebServlet("/search")
	public class IdServlet extends HttpServlet {

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String id=req.getParameter("id");
			int id1=Integer.valueOf(id);
			BookingServiceImpl registrationServiceimpl=new BookingServiceImpl();
			String valid=registrationServiceimpl.getlistById(id1);
		    
		     if(valid!=null) {
		    	 req.setAttribute("id", valid);
		     }

			 	RequestDispatcher requestDispatcher = req.getRequestDispatcher("/search.jsp");
				requestDispatcher.forward(req, resp);
		}

	}

