package com.controllers;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.dao.CustomerCrud;
import com.dto.Customer;

@WebServlet("/login")
public class Login extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");

		CustomerCrud ccd = new CustomerCrud();

		try {
			Customer db = ccd.fetchByEmail(email);
			if (db.getCPassword().equals(pwd)) {
				req.setAttribute("data", db);
				RequestDispatcher dispatch = req.getRequestDispatcher("Services.jsp");
				dispatch.forward(req, res);
			} else {
				req.setAttribute("wrongPwd","wrong Password");
				RequestDispatcher dispatch = req.getRequestDispatcher("Login.jsp");
				dispatch.include(req, res);
			}

		} catch (Exception e) {
			req.setAttribute("wrongEmail","wrong Email");
			RequestDispatcher dispatch = req.getRequestDispatcher("Login.jsp");
			dispatch.include(req, res);

		}

	}

}
