package com.xworkz.consultancies.ConsultancyServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.consultancies.ConsultancyDTO.ConsultancyDTO;
import com.xworkz.consultancies.service.ConsultancyServiceImpl;
@WebServlet(loadOnStartup = 1, urlPatterns = "/register")

public class ConsultancyServlet extends HttpServlet{
	
	
	      public ConsultancyServlet() {
			System.out.println("no args constructor");
			}
		@Override
	    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
			
			String consultancyName=req.getParameter("ConsultancyName");
			String consultantName=req.getParameter("ConsultantName");
			String primaryContact=req.getParameter("PrimaryContact");
			String email=req.getParameter("Email");
		


		ConsultancyDTO DTO = new ConsultancyDTO(consultancyName,consultantName,primaryContact,email);
		
		ConsultancyServiceImpl  consultancyService=new ConsultancyServiceImpl() ;
		consultancyService.save(DTO);
		boolean saved= consultancyService.save(DTO);
	
		RequestDispatcher dispatcher = req.getRequestDispatcher("ConsultationForm.html");
		dispatcher.forward(req, resp);
		}
}
		
		
	
		