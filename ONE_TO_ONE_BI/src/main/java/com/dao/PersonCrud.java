package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.Person;

public class PersonCrud {
	
	EntityManager cem = Persistence.createEntityManagerFactory("true").createEntityManager();
	EntityTransaction gt = cem.getTransaction();
	public void insertintoPerson(Person person) {
		gt.begin();
		cem.persist(person);
		gt.commit();
		
	}

}
