package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.dao.EmpCrud;
import com.dto.Emp;
@WebServlet("/delete")
public class Delete  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		EmpCrud ecd=new EmpCrud();
		Emp emp = ecd.delete(id);
		if(emp!=null) {
			List<Emp> li = ecd.fetchAll();
			req.setAttribute("empli", li);
			RequestDispatcher dispatch = req.getRequestDispatcher("display.jsp");
			dispatch.include(req, res);
			
		}
		else {
			req.setAttribute("msg","id not exist");
			RequestDispatcher dispatch = req.getRequestDispatcher("login.jsp");
			dispatch.forward(req, res);


		}
	}

}
