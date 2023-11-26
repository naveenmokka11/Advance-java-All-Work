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

@WebServlet("/Edit")
public class Edit  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		int cid = Integer.parseInt(req.getParameter("cid"));
		String FName = req.getParameter("FName");
		String LName = req.getParameter("LName");
		String email = req.getParameter("Email");
		String pwd = req.getParameter("Pwd");
		
		long phone = Long.parseLong(req.getParameter("Phone"));
		int age = Integer.parseInt(req.getParameter("age"));
		String gender = req.getParameter("gender");
		String addres = req.getParameter("address");
		
		
		
		int bid = Integer.parseInt(req.getParameter("bid"));
		String bName = req.getParameter("branchname");
		long bphone = Long.parseLong(req.getParameter("bphone"));
		String accType = req.getParameter("accType");
		double balance = Double.parseDouble(req.getParameter("balnce"));
		String idproof = req.getParameter("idproof");
		 long accno = Long.parseLong(req.getParameter("accno"));
		
		
		

		Bank bank = new Bank();
		bank.setId(bid);
		bank.setAccNo(accno);
		bank.setAccountType(accType);
		bank.setPhone(bphone);
		bank.setProof(idproof);
		bank.setBalance(balance);
		bank.setBranchName(bName);

		BankCrud bcd = new BankCrud();
		bcd.UpdateBank(bank);
		
		//bcd.UpdateBank(accno, bank);	

		Customer c1 = new Customer();
		
		c1.setId(cid);
		c1.setCFirstName(FName);
		c1.setCLastName(LName);
		c1.setCEmail(email);
		c1.setCPassword(pwd);
		c1.setPhone(phone);
		c1.setAge(age);
		c1.setGender(gender);
		c1.setAddress(addres);
		
		CustomerCrud ccd=new CustomerCrud();
		ccd.UpdateCust(c1);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("Login.jsp");
		dispatcher.forward(req, res);
		

		
	}

}
