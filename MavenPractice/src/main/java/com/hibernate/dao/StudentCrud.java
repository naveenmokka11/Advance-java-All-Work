package com.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.dto.Student;

public class StudentCrud {
	
	EntityManagerFactory cemf = Persistence.createEntityManagerFactory("true");
	EntityManager cem = cemf.createEntityManager();
	EntityTransaction gt = cem.getTransaction();
	
	

	//inserting data
	public void insert(Student student) {
		//we need transaction here
		gt.begin();
		cem.persist(student);
		gt.commit();
				
	}
	
	public void update(Student student) {
		Student res = cem.find(Student.class, student.getId());
		if(res!=null) {
		gt.begin();
		 cem.merge(student);
		gt.commit();
		}
		else {
			System.out.println("that id is not exist ");
		}
		
	}
	
	public void fetch(int id) {
		Student res = cem.find(Student.class,id);
		System.out.println(res);
	}
	
	public void delete(int id) {
		Student res = cem.find(Student.class,id);
		if(res!=null) {		
		gt.begin();
		cem.remove(res);
		gt.commit();
		}
		else {
			System.out.println("data is not Exist with that id");
		}
		
	}
	
		
	

}
