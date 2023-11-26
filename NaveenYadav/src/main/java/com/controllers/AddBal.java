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



@WebServlet("/AddBalance")
public class AddBal extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		CustomerCrud c1=new CustomerCrud();
		
		
		
		BankCrud bcd=new BankCrud();
		
		Bank b1 = bcd.fetchBank(id);
		if(b1!=null) {
		
			req.setAttribute("b1", b1);
			RequestDispatcher dispatch = req.getRequestDispatcher("AddBalance.jsp");
			dispatch.forward(req, res);
			
		}

		
	}

}
