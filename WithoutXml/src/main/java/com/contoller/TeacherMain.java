package com.contoller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TeacherMain {

	public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(TeacherConfig.class);	
	Teacher t = context.getBean(Teacher.class);
	System.out.println(t);
	}

}
