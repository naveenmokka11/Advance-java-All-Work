package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dto.Person;

public class PersonCrud {
	

	EntityManagerFactory cemf = Persistence.createEntityManagerFactory("true");
	
	EntityManager cem = cemf.createEntityManager();
	
	EntityTransaction gt = cem.getTransaction();
	
	public void insert(Person person) {
		
		gt.begin();
		
		cem.persist(person);
		
		gt.commit();
		
		
	}
	
	public void updatePhone(Person person) {
		
		Person val = cem.find(Person.class, person.getEmail());
		val.setPhone(person.getPhone());
		if(val!=null) {
			gt.begin();
			
			cem.merge(val);
			
			gt.commit();
			
		}
		else {
			System.out.println("pk not fond whivh you have enterted");
		}
		
	}
	public void fetchByEmail(String email) {
		Query qu = cem.createQuery("select a from Person a where a.email=?1");
		 qu.setParameter(1, email);
		Person res = (Person) qu.getSingleResult();
		System.out.println(res);
		
		
	}
	public void fetchByIdentifer(Person person) {
		Person val = cem.find(Person.class, person.getEmail());	
		if(val!=null) {
			System.out.println(val);			
		}
		else {
			System.out.println("data not pount with email");
		}
		
	}
	public void delete(Person person) {
		Person val = cem.find(Person.class, person.getEmail());
		if(val!=null) {
			gt.begin();
			cem.remove(val);
			gt.commit();
		}
		
	}
	
	
	}
