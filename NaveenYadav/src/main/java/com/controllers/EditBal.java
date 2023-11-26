package com.controllers;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.dao.BankCrud;
import com.dto.Bank;


@WebServlet("/balanceUpadte")
public class EditBal  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			int id = Integer.parseInt(req.getParameter("id"));
			long acc= Long.parseLong(req.getParameter("accno"));
			 double bal = Double.parseDouble(req.getParameter("bal"));
			 
			 
			 Bank b=new Bank();
			 b.setId(id);
			 b.setAccNo(acc);
			 b.setBalance(bal);
			 
			 BankCrud bcd=new BankCrud();
			 bcd.UpdateBank(b);
			 System.out.println("ok");
		
	}

}
