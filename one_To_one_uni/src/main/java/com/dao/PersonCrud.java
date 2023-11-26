package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dto.Passport;
import com.dto.Person;

public class PersonCrud {
	
	EntityManagerFactory cemf = Persistence.createEntityManagerFactory("true");
	EntityManager cem = cemf.createEntityManager();
	EntityTransaction gt = cem.getTransaction();
	
	
	public void insertPersondata(Person person,int id) {
		Passport pass = cem.find(Passport.class,id);
		if(pass!=null) {
		person.setPassport(pass);
		gt.begin();
		cem.persist(person);
		gt.commit();
		}
		
	}
	
	
	
	public void savePerson(Person person) {
		gt.begin();
		cem.persist(person);
		gt.commit();
	}
	
	public void updatePersonPhone(Person person) {
		
		Person val = cem.find(Person.class, person.getId());
		val.setPhone(person.getPhone());
		if(val!=null) {
			gt.begin();
			cem.merge(val);
			gt.commit();
			
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
	
	public void fetchPersonById(int id) {
		Person val = cem.find(Person.class, id);
		if(val!=null) {
			System.out.println(val);
			
		}
		
	}
	public void fetchPersonByName(String name) {
		Query qu = cem.createQuery("Select a from Person a where a.name=?1");
		qu.setParameter(1, name);
		 Person res = (Person)qu.getSingleResult();
		 System.out.println(res);
		 
		
	}
	public void fetchPersonByemail(String email) {
		Query qu = cem.createQuery("Select a from Person a where a.email=?1");
		qu.setParameter(1,email);
		Person val = (Person)qu.getSingleResult();
		System.out.println(val);
				
	
	}
	public void fetchPersonPhone(long phone) {
		Query qu = cem.createQuery("Select a from Person a where a.phone=?1");
		qu.setParameter(1, phone);
		Person val = (Person)qu.getSingleResult();
		System.out.println(val);
		
	}
	public void fetchPersongender(String gender) {
		Query qu = cem.createQuery("Select a from Person a where a.gender=?1");
		qu.setParameter(1, gender);
		List list = qu.getResultList();
		System.out.println(list);
		
	}
	
	
	
	

	
}


