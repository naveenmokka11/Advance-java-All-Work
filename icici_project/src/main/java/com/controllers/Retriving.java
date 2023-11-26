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
@WebServlet("/fetching")
public class Retriving  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		UserCrud ucd=new UserCrud();
		User dbdata = ucd.fetchById(id);
		if(dbdata!=null) {
		
		
		req.setAttribute("fetch", dbdata);
		RequestDispatcher dispatch = req.getRequestDispatcher("fetch.jsp");
		dispatch.forward(req, res);
		}
			
	
	}

}
