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
@WebServlet("/login")
public class Login extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");

		EmpCrud ecd = new EmpCrud();

		try {
			Emp emp = ecd.fetchByEmail(email);

			if (emp.getPassword().equals(pwd)) {
				List<Emp> li = ecd.fetchAll();
				req.setAttribute("empli", li);
				RequestDispatcher dispatch = req.getRequestDispatcher("display.jsp");
				dispatch.forward(req, res);
			} else {
				req.setAttribute("msg", "wrong password");
				RequestDispatcher dispatch = req.getRequestDispatcher("login.jsp");
				dispatch.include(req, res);
			}

		} catch (Exception e) {
			req.setAttribute("msg", "wrong email");
			RequestDispatcher dispatch = req.getRequestDispatcher("login.jsp");
			dispatch.include(req, res);
		}

	}

}
