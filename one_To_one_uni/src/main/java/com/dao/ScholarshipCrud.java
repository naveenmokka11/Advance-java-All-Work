package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.Scholarship;
import com.dto.Student;

public class ScholarshipCrud {
	EntityManagerFactory cemf = Persistence.createEntityManagerFactory("true");
	EntityManager cem = cemf.createEntityManager();
	EntityTransaction gt = cem.getTransaction();


	public void InsetScholerShip(Scholarship sh) {
		gt.begin();
		cem.persist(sh);
		gt.commit();
	}
	public void UpdateScholarship(Scholarship sh) {
		Scholarship val = cem.find(Scholarship.class, sh.getId());
		if(val!=null) {
			gt.begin();
			val.setYear(sh.getYear());
			gt.commit();
			
		}
		else {
			System.out.println("id is not matched with any value");
		}
		
	}
	public void deleteScholerShip(int id,int stuid) {
		Scholarship val = cem.find(Scholarship.class,id);
		Student val2 = cem.find(Student.class, stuid);
		
		if(val!=null) {
			val2.setScholarship(null);
			gt.begin();
			cem.remove(val);
			gt.commit();
			
		}
		else {
			System.out.println("id is not matched ");
		}
		
	}
	public void fetchScholership(int id) {
		Scholarship val = cem.find(Scholarship.class,id);
		if(val!=null) {
			System.out.println(val);
			
		}
		else {
			System.out.println("id not matched");
		}
		
		
	}
		

}
