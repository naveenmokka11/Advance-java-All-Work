package com.controllers;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
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




@WebServlet("/registration")
public class Registration extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String FName = req.getParameter("FName");
		String LName = req.getParameter("LName");
		String email = req.getParameter("Email");
		String pwd = req.getParameter("Pwd");
		long phone = Long.parseLong(req.getParameter("Phone"));
		int age = Integer.parseInt(req.getParameter("age"));
		String gender = req.getParameter("gender");
		String addres = req.getParameter("address");

		String bName = req.getParameter("branchname");
		long bphone = Long.parseLong(req.getParameter("bphone"));
		String accType = req.getParameter("accType");
		double balance = Double.parseDouble(req.getParameter("balance"));
		String idproof = req.getParameter("idproof");

		Bank bank = new Bank();
		int accno = (int) (Math.random() * 100000);
		bank.setAccNo(accno);
		bank.setAccountType(accType);
		bank.setPhone(bphone);
		bank.setProof(idproof);
		bank.setBalance(balance);
		bank.setBranchName(bName);

		BankCrud bcd = new BankCrud();
		


		Customer c1 = new Customer();

		c1.setCFirstName(FName);
		c1.setCLastName(LName);
		c1.setCEmail(email);
		c1.setCPassword(pwd);
		c1.setPhone(bphone);
		c1.setAge(age);
		c1.setGender(gender);
		c1.setAddress(addres);
		

		CustomerCrud ccd = new CustomerCrud();

		
		 Customer existEmail;
		try {
			existEmail = ccd.fetchByEmail(email);

			req.setAttribute("msg", "dear "+FName+"Already another Account Exist with this"+email+"try again");
			RequestDispatcher dispatch = req.getRequestDispatcher("Register.jsp");
			dispatch.include(req, res);
			
		} catch (Exception e) {
			Bank bnk = bcd.InsertBank(bank);
			Customer cust = ccd.InsertCust(c1, bank);
			req.setAttribute("login", "regstration is sucess");
			RequestDispatcher dispatch = req.getRequestDispatcher("Login.jsp");
			dispatch.forward(req, res);

		}
		

	}

}
