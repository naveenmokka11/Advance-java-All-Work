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

@WebServlet("/checkbal")
public class ViewBalance  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	BankCrud bcd=new BankCrud();
	Bank bankbal = bcd.checkBal(id);
	double bal = bankbal.getBankBalance();
	System.out.println(bal);
	req.setAttribute("bal",bankbal);
	RequestDispatcher dispatch = req.getRequestDispatcher("checkBalance.jsp");
	dispatch.forward(req, res);
		
	}

}
