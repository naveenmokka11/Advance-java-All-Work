package com.dto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionMain {

	public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("setter.xml");
	School sc = context.getBean(School.class);
	System.out.println(sc);
		
	}
}
