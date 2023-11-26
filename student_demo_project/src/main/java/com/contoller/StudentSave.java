package com.contoller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.dao.StudentCrud;
import com.dto.Student;

@WebServlet("/register")
public class StudentSave extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		long phone = Long.parseLong(req.getParameter("phone"));
		String addres = req.getParameter("address");

		Student s = new Student();
		s.setName(name);
		s.setEmail(email);
		s.setPassword(pwd);
		s.setPhone(phone);
		s.setAddress(addres);

		StudentCrud scd = new StudentCrud();
		try {
			scd.SaveStudent(s);
			RequestDispatcher dispatch = req.getRequestDispatcher("login.html");
			dispatch.forward(req, res);
		} catch (Exception e) {
			RequestDispatcher dispatch = req.getRequestDispatcher("register.html");
			dispatch.include(req, res);
		}

	}

}
