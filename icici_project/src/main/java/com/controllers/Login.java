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

@WebServlet("/login")
public class Login extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String userEmail = req.getParameter("userEmail");
		String password = req.getParameter("password");

		UserCrud ucd = new UserCrud();
		try {
			User dbemail = ucd.fetchByEmail(userEmail);
			if (dbemail.getUserPassword().equals(password)) {
				req.setAttribute("userdata",dbemail );
				RequestDispatcher dispatch = req.getRequestDispatcher("services.jsp");
				dispatch.forward(req, res);
				
			} else {
				req.setAttribute("invalidData", "wrong password");
				RequestDispatcher dispatch = req.getRequestDispatcher("login.jsp");
				dispatch.forward(req, res);

				
			}
		} catch (Exception e) {
			req.setAttribute("invalidData", "wrong Email");
			RequestDispatcher dispatch = req.getRequestDispatcher("login.jsp");
			dispatch.forward(req, res);


		}

	}

}
