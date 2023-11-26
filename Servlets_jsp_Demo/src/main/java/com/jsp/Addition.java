package com.jsp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/add")
public class Addition extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int a=Integer.parseInt(req.getParameter("v1"));
		int b=Integer.parseInt(req.getParameter("v2"));
		int c=a+b;
		System.out.println("Addition is :"+c);
	}

}
