package com.demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Substraction extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int a=Integer.parseInt(req.getParameter("val1"));
		int b=Integer.parseInt(req.getParameter("val2"));
		int c=a-b;
		System.out.println("substraction "+c);
		
	}

}
