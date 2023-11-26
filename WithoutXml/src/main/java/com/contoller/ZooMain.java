package com.contoller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ZooMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

			
			ApplicationContext context=new AnnotationConfigApplicationContext(TeacherConfig.class);	
			 Zoo zoo = context.getBean(Zoo.class);
			 
			 zoo.animal.eats();
			
			

		

}
}
