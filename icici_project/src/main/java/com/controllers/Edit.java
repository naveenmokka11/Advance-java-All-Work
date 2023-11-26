package com.controllers;

import java.io.IOException;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.dao.UserCrud;
import com.dto.User;
@WebServlet("/edit")
public class Edit  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pwd = req.getParameter("password");
		long ph = Long.parseLong(req.getParameter("phno"));
		long proof = Long.parseLong(req.getParameter("proof"));
		
		User u1=new User();
		
		
		u1.setId(id);
		u1.setUserName(name);
		u1.setUserEmail(email);
		u1.setUserPassword(pwd);
		u1.setAadharNo(proof);
		u1.setUserPhone(ph);
		
		UserCrud ucd=new UserCrud();
		ucd.updateUser(u1);
		RequestDispatcher dispatch = req.getRequestDispatcher("login.jsp");
		dispatch.forward(req, res);
		
		
	}

}
