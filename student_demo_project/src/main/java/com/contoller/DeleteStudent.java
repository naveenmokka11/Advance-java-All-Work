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
@WebServlet("/delete")
public class DeleteStudent  extends  GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		StudentCrud scd=new StudentCrud();
		Student stu = scd.deleteStudent(id);
		if(stu!=null) {
			List<Student> li = scd.fetchAll();
			req.setAttribute("li", li);
			RequestDispatcher dispatch = req.getRequestDispatcher("printAlldbData.jsp");
			dispatch.forward(req, res);
		}
		else {
			RequestDispatcher dispatch = req.getRequestDispatcher("login.html");
			dispatch.include(req, res);
		}
		
	}

}
