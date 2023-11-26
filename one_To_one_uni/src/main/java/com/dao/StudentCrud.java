package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.Scholarship;
import com.dto.Student;

public class StudentCrud {
	EntityManagerFactory cemf = Persistence.createEntityManagerFactory("true");
	EntityManager cem = cemf.createEntityManager();
	EntityTransaction gt = cem.getTransaction();

	public void insertIntoStudent(Student student,int id) {
		Scholarship ship = cem.find(Scholarship.class,id);
		if(ship!=null) {
		student.setScholarship(ship);
		gt.begin();
		cem.persist(student);
		gt.commit();
		}
				
	}
	public void updateStudent(Student student) {
		Student val = cem.find(Student.class,student.getId());
		if(val!=null) {
			val.setClas(student.getClas());
			gt.begin();
			cem.merge(val);
			gt.commit();
			
		}
		else {
			System.out.println("id not matched we cant perform update operation");
		}
		
	}
	public void deleteStudent(int id) {
		Student val = cem.find(Student.class,id);
		if(val!=null) {
			gt.begin();
			cem.remove(val);
			gt.commit();
		}
		else {
			System.out.println("sorry  Primary key not matched");
			
		}
		
		
	}
	public void fetch(int id) {
		Student val = cem.find(Student.class, id);
	if(val!=null) {
		System.out.println(val);
		
	}
	else {
		System.out.println("id not matched");
	}
		
	}
	
	
	
}
