package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.Passport;
import com.dto.Person;

public class PersonCrud {

	EntityManagerFactory cemf = Persistence.createEntityManagerFactory("true");
	EntityManager cem = cemf.createEntityManager();
	EntityTransaction gt = cem.getTransaction();

	public void InsertPerson(Person person, int id) {
		Passport pass = cem.find(Passport.class, id);
	if (pass != null) {
			person.setPassport(pass);
			gt.begin();
			cem.persist(person);
			gt.commit();
		}

	}
	public void retrive(int id) {
		Person val= cem.find(Person.class, id);
		if(val!=null) {
			System.out.println(val);
			
		}
		else {
			System.out.println("data is not present with that id");
		}
		
		
	}
	public void deletePerson(int id) {
		Person val = cem.find(Person.class, id);
		if(val!=null) {
			gt.begin();
			cem.remove(val);
			gt.commit();
			
		}
		
	}

	

}
