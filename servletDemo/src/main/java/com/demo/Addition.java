package com.demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Addition extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int a=Integer.parseInt(req.getParameter("one"));
		int b=Integer.parseInt(req.getParameter("two"));
		int c=Integer.parseInt(req.getParameter("three"));
		int d=a+b+c;
		System.out.println(d);


	}

}
