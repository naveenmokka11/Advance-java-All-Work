package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.StudentHackerRank;

public class StudentHackerCrud {
	
	EntityManager cem = Persistence.createEntityManagerFactory("true").createEntityManager();
	EntityTransaction gt = cem.getTransaction();

	
	
	public void insertHackerRankDeatils(StudentHackerRank strank) {
		gt.begin();
		cem.persist(strank);
		gt.commit();
				
	}
	public void fetchdataFrom(int id) {
		StudentHackerRank val = cem.find(StudentHackerRank.class, id);
		if(val!=null) {
			System.out.println(val);
			
		}
		else {
			System.out.println("Data not found");
		}
		
	}

}
