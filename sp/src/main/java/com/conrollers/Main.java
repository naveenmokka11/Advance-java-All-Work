package com.conrollers;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		
		
		
		Resource r=new ClassPathResource("bean.xml");	
		BeanFactory factory=new XmlBeanFactory(r);
		Student res = factory.getBean(Student.class);
		System.out.println(res);
		System.out.println(res);
	}

}
