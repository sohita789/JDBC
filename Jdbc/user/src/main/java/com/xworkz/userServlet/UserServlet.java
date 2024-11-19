package com.xworkz.userServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.userDTO.UserDTO;
import com.xworkz.userService.UserService;
import com.xworkz.userService.UserServiceImpl;
@WebServlet(loadOnStartup = 1, urlPatterns = "/register")

public class UserServlet extends HttpServlet{
	   
	    
	    private UserService userService;

	    public UserServlet() {
	        this.userService = new UserServiceImpl();
	    }

       @Override
	    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        String name = req.getParameter("Name");
	        String phoneNumber = req.getParameter("PhoneNumber");
	        String email = req.getParameter("Email");
	        int age = Integer.parseInt(req.getParameter("Age"));

	        UserDTO userDTO = new UserDTO(name, phoneNumber, email, age);
	        boolean validUserDTO = userService.validateAndSave(userDTO);

	        if (validUserDTO) {
	            System.out.println("Data is valid");
	            RequestDispatcher dispatcher = req.getRequestDispatcher("/Success.jsp");
	            req.setAttribute("name", userDTO.getName());
	            dispatcher.forward(req, resp);
	        } else {
	            System.err.println("Data is invalid");
	            RequestDispatcher dispatcher = req.getRequestDispatcher("/error.jsp");
	            dispatcher.forward(req, resp);
	        }
	        System.out.println("UserDTO :" + userDTO);
	        
	        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
	        req.setAttribute("name", userDTO.getName());
	        req.setAttribute("phoneNumber", userDTO.getPhoneNumber());
	        req.setAttribute("email", userDTO.getEmail());
	        req.setAttribute("age", userDTO.getAge());
			
	    }
	}

