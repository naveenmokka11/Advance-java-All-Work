package com.controllers;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.dao.UserCrud;
import com.dto.User;

@WebServlet("/delete")
public class DeleteUser extends GenericServlet  {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			int id = Integer.parseInt(req.getParameter("id"));
			UserCrud ucd=new UserCrud();
			User data = ucd.deleteUser(id);
			RequestDispatcher dispatch = req.getRequestDispatcher("login.jsp");	
			dispatch.forward(req, res);
	}

}
