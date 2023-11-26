package com.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.dao.EmpCrud;
import com.dto.Emp;



@WebServlet("/regis")
public class Register extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String role=req.getParameter("role");
		long phone = Long.parseLong(req.getParameter("phone"));
		String address = req.getParameter("address");
		
		Emp e1=new Emp();
		
		
		e1.setName(name);
		e1.setEmail(email);
		e1.setPassword(password);
		e1.setPhone(phone);
		e1.setAddress(address);
		e1.setRole(role);
		EmpCrud ecd=new EmpCrud();
		try {
			ecd.InsertIntEmp(e1);
			RequestDispatcher dispatch = req.getRequestDispatcher("login.jsp");
			dispatch.forward(req, res);
			
		} catch (Exception e) {
			req.setAttribute("redircet", "Email is already Exist try with other email");
			RequestDispatcher dispatch = req.getRequestDispatcher("Register.jsp");
			dispatch.include(req, res);
		}
		
		
	}

}
