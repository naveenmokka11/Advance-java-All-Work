package com.contoller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.dao.StudentCrud;
import com.dto.Student;

@WebServlet("/login")
public class StudentLogin extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");

		Student s = new Student();

		StudentCrud scd = new StudentCrud();

		PrintWriter out = res.getWriter();
		
		
	try {
		Student student = scd.fetchByEmail(email);
		
			if(student.getPassword().equals(pwd)) {
				
			List<Student> li = scd.fetchAll();
				req.setAttribute("li",li );
			
				RequestDispatcher dispatch = req.getRequestDispatcher("printAlldbData.jsp");
				dispatch.forward(req, res);
				}
			else {
				 req.setAttribute("msg","wrong password........");
				RequestDispatcher dispatch = req.getRequestDispatcher("practice.jsp");
				dispatch.include(req, res);
			}
			
		
			
	} catch (Exception e) {
		 req.setAttribute("msg","wrong email........");
		RequestDispatcher dispatch = req.getRequestDispatcher("practice.jsp");
		dispatch.include(req, res);
	}

		
	}
}
