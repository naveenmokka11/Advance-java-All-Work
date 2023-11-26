package com.controllers;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.dao.BankCrud;
import com.dto.Bank;

@WebServlet("/CheckBalance")
public class CheckBalance  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		int id = Integer.parseInt(req.getParameter("id"));
		BankCrud bcd=new BankCrud();
		
		Bank bankdata = bcd.fetchBank(id);
		req.setAttribute("b1", bankdata);
		RequestDispatcher dispatcher = req.getRequestDispatcher("CheckBalance.jsp");
		dispatcher.forward(req, res);
		
	}

}
