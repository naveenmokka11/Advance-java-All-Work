package com.controllers;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.dao.BankCrud;
import com.dao.CustomerCrud;
import com.dto.Bank;
import com.dto.Customer;

@WebServlet("/Fetch")
public class Fetch extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		
		CustomerCrud ccd=new CustomerCrud();
		
		Customer c1 = ccd.fetchCust(id);
		BankCrud bcd=new BankCrud();
		Bank b1 = bcd.fetchBank(id);
		if(c1!=null) {
			req.setAttribute("c1", c1);
			req.setAttribute("b1", b1);
			RequestDispatcher dispatch = req.getRequestDispatcher("Fetch.jsp");
			dispatch.forward(req, res);
		}
		else {
			RequestDispatcher dispatch = req.getRequestDispatcher("Notfound.jsp");
			dispatch.forward(req, res);

		}
	}

}
