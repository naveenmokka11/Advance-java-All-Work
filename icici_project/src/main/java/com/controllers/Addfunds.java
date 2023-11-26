package com.controllers;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.dao.BankCrud;
import com.dto.Bank;

@WebServlet("/addfunds")
public class Addfunds  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("id");
		String bal = req.getParameter("funds");
		
		
		int bankid = Integer.parseInt(id);
		double fund=Double.parseDouble(bal);
		BankCrud bcd=new BankCrud();
		
		
		
		
		bcd.setBalance(bankid,fund);
				
		
	}
	

}
