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

@WebServlet("/Update")
public class Upadte extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			int id=Integer.parseInt(req.getParameter("id"));
			CustomerCrud c1=new CustomerCrud();
			
			Customer cust = c1.fetchCust(id);
			
			BankCrud bcd=new BankCrud();
			
			Bank b1 = bcd.fetchBank(id);
			if(cust!=null) {
				req.setAttribute("c1", cust);
				req.setAttribute("b1", b1);
				RequestDispatcher dispatch = req.getRequestDispatcher("Update.jsp");
				dispatch.forward(req, res);
				
			}
	}

}
