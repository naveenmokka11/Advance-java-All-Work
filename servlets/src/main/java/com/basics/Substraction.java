package com.basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/sub")


public class Substraction  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int n1 = Integer.parseInt(req.getParameter("v1"));
		int n2 = Integer.parseInt(req.getParameter("v2"));
		//int n3 = Integer.parseInt(req.getParameter("v3"));
		int n=n1-n2;
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<html>"+ "<body>"+"<h1>"+"<marquee>"+n+"</marquee>"+"</h1>"+"</body>"+ "</html>");
		
		
	}

}
