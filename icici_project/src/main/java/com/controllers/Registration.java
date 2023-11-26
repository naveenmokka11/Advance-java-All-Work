package com.controllers;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.dao.BankCrud;
import com.dao.UserCrud;
import com.dto.Bank;
import com.dto.User;

@WebServlet("/registration")
public class Registration extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		long phone = Long.parseLong(req.getParameter("phone"));
		long proof = Long.parseLong(req.getParameter("proof"));

		int accno = (int) (Math.random() * 100000);
		Bank b1 = new Bank();
		b1.setAccountNumber(accno);
		b1.setBankBalance(0);
		b1.setBranchLocation(null);
		b1.setBankPhone(phone);
		b1.setBranchName(null);

		BankCrud bcd = new BankCrud();

		User u1 = new User();

		u1.setUserName(name);
		u1.setUserEmail(email);
		u1.setUserPassword(password);
		u1.setUserPhone(phone);
		u1.setAadharNo(proof);
		UserCrud ucd = new UserCrud();

		User existEmail;
		try {
			existEmail = ucd.fetchByEmail(email);

			req.setAttribute("duplicateEmail",
					"dear " + name + " Already Another Account is exist with this " + email + " Try again");
			RequestDispatcher dispatch = req.getRequestDispatcher("register.jsp");
			dispatch.include(req, res);

		} catch (Exception e) {
			bcd.InsertBank(b1);
			User r = ucd.InsertUser(u1, b1);
			req.setAttribute("login", "regstration is sucess");
			RequestDispatcher dispatch = req.getRequestDispatcher("login.jsp");
			dispatch.forward(req, res);

		}

	}

}
