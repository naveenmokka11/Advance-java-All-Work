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
@WebServlet("/Updation")
public class Update  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	int id = Integer.parseInt(req.getParameter("id"));
	UserCrud ucd=new UserCrud();
	User dbdata = ucd.fetchById(id);
	if(dbdata!=null) {
		req.setAttribute("updateop", dbdata);
		RequestDispatcher dispatcher =req.getRequestDispatcher("update.jsp");
		dispatcher.forward(req, res);
		
	}
	
		
	}

}
