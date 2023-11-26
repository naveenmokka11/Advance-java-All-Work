package com.frontController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Student;

@Controller
public class StudentController {
	
	@RequestMapping("/test")
	public ModelAndView demo() {
		ModelAndView view=new ModelAndView("msg.jsp");
		view.addObject("msg", "hello welcome");
		return view;
		
	}

	
	@RequestMapping("/student")
	public ModelAndView student() {
		Student s1=new Student();
		
		
		s1.setId(1);
		s1.setName("naveen");
		s1.setEmail("n@gmail.com");
		
		
		ModelAndView view=new ModelAndView("Student.jsp");
		view.addObject("data", s1);
		return view;
		
	}

	
	
	
	
	
	
}
