package com.xworkz.loanServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.loanConst.LoanDTO;
import com.xworkz.loanService.LoanService;
import com.xworkz.loanService.LoanServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/verify")

public class LoanServlet extends HttpServlet {

	public LoanServlet() {
		System.out.println("No-Args constructor of EmployeeServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id= req.getParameter("id");
		String userName=req.getParameter("userName");
		String phone=req.getParameter("phone");
		String email=req.getParameter("email");
		String exp=req.getParameter("exp");
		String dep=req.getParameter("dep");
		String age=req.getParameter("age");


		int convertedExp= Integer.valueOf(exp);
		int convertedAge= Integer.valueOf(age);

		LoanDTO dto= new LoanDTO(id, userName, phone, email, convertedExp, dep, convertedAge);

		LoanServiceImpl impl= new LoanServiceImpl();
		boolean check=impl.save(dto);

	}
}