package com.contoller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;



@WebServlet("/cycle")
public class JspLifeCycle  extends GenericServlet{
	public JspLifeCycle() {
		super();
	System.out.println("constructor");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("instatiation");	
		}

		
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service method");
		
	}
	
	
	@Override
	public void destroy() {
		System.out.println("destory");
		}
	
	
	}
	