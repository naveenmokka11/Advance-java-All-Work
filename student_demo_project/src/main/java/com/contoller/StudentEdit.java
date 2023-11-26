package com.contoller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.dao.StudentCrud;
import com.dto.Student;
@WebServlet("/edit")
public class StudentEdit extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		long phone = Long.parseLong(req.getParameter("phone"));
		String addres = req.getParameter("address");

		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setEmail(email);
		s.setPassword(pwd);
		s.setPhone(phone);
		s.setAddress(addres);
		
		System.out.println(id);
		
		System.out.println("hello");
		StudentCrud scd = new StudentCrud();
		Student stu = scd.UpadteStudent(s);
		
		if(stu!=null) {
			
		List<Student> li = scd.fetchAll();
			req.setAttribute("li",li );
				RequestDispatcher dispatch = req.getRequestDispatcher("printAlldbData.jsp");
				dispatch.forward(req, res);
		}
		else {
			RequestDispatcher dispatch = req.getRequestDispatcher("login.html"); 
			 dispatch.forward(req, res);
			 

		}
		
	}

}
