package com.contoller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.dao.StudentCrud;
import com.dto.Student;
@WebServlet("/update")
public class StudentUpdate extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
				
		 StudentCrud scd=new StudentCrud();
		 Student stu = scd.fetchByid(id);
		 if(stu!=null) {
			 
			 req.setAttribute("upadte", stu);
			
			 RequestDispatcher dispatch = req.getRequestDispatcher("update.jsp");
			 dispatch.forward(req, res);
			 
		 }
		 else {
			 RequestDispatcher dispatch = req.getRequestDispatcher("login.html"); 
			 dispatch.forward(req, res);
			 

		 }
	}

}
