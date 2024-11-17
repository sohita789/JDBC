package com.xworkz.scholarshipServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.scholarshipDTO.ScholarshipDTO;
import com.xworkz.scholarshipService.ScholarshipServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/fill")

public class ScholarshipServlet  extends HttpServlet {

	  public ScholarshipServlet() {
	System.out.println("no args constructor");
				}
			@Override
		    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
				
				String id=req.getParameter("Id");
				String studentName=req.getParameter("StudentName");
				String course=req.getParameter("Course");
				String email=req.getParameter("Email");
			


			ScholarshipDTO DTO = new ScholarshipDTO(id,studentName,course,email);
			
			ScholarshipServiceImpl  scholarshipService=new ScholarshipServiceImpl() ;
			scholarshipService.save(DTO);
			boolean saved= scholarshipService.save(DTO);
		
			RequestDispatcher dispatcher = req.getRequestDispatcher("ScholarshipForm.jsp");
			dispatcher.forward(req, resp);
			}
	}
			
			

