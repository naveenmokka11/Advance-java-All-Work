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

@WebServlet("/Upadte")
public class Update extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		
		EmpCrud ecd=new EmpCrud();
		Emp em = ecd.fetchById(id);
		if(em!=null) {
			req.setAttribute("empdate", em);
			RequestDispatcher dispatcher =req.getRequestDispatcher("update.jsp");
			dispatcher.forward(req, res);
		}
		else {
			
			RequestDispatcher dispatcher =req.getRequestDispatcher("update.jsp");
			dispatcher.include(req, res);
		

			
			
		}
		
		
	
	}

}
