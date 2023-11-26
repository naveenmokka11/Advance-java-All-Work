package com.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		System.out.println(e1);
		
		Resource resource =new ClassPathResource("employee.xml");
		 BeanFactory factory=new XmlBeanFactory(resource);
		 // Employee em = (Employee)factory.getBean("empbean");
		Employee em = factory.getBean(Employee.class);
		  System.out.println(em);
		  System.out.println(em);
		  System.out.println(em);
		  
	
	}

}
