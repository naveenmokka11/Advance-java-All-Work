package com.dto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherMain {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("constructor.xml");
		
		Teacher t = context.getBean(Teacher.class);
		System.out.println(t);
			}

}
