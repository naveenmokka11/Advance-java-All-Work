package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.Passport;
import com.dto.Person;

public class PassportCrud {
	
	
	EntityManagerFactory cemf = Persistence.createEntityManagerFactory("true");
	EntityManager cem = cemf.createEntityManager();
	EntityTransaction gt = cem.getTransaction();
	
	public void insertIntoPassport(Passport passport) {
		gt.begin();
		cem.persist(passport);
		gt.commit();
	
	}
	
	
	
	public void savePassPort(Passport passport, int person_id) {
		Person person=cem.find(Person.class, person_id);
		if(person!=null) {
			person.setPassport(passport);
			
			gt.begin();
			cem.merge(person);
			gt.commit();
		}
		
		
		
	}
	public void deleteFromPassport(int id,int personid2) {
		Person person = cem.find(Person.class, personid2);
		if(person!=null) {
			System.out.println(person);
			person.setPassport(null);
			gt.begin();
			cem.merge(person);
			gt.commit();
			System.out.println(person);
			Passport res = cem.find(Passport.class, id);
			gt.begin();
			cem.remove(res);
			gt.commit();
			
		}
		
		
		
		
		//(or)
//		Passport val = cem.find(Passport.class, id);
//		Person val2 = cem.find(Person.class, id2);
//	
//		val2.setPassport(null);
//		if(val!=null) {
//			gt.begin();
//			cem.remove(val);
//			gt.commit();
//			
//		}
//		else {
//			System.out.println("data not found with that PK");
//		}
		
	}
	public void updatePhone(Passport passport) {
		Passport val = cem.find(Passport.class,passport.getPass_no());
		
		if(val!=null) {
			val.setPhone(passport.getPhone());
			gt.begin();
			cem.merge(val);
			gt.commit();
		}
		else {
			System.out.println("Pk is not found that id");
		}
			
	}
	public void fetch(int id) {
		Passport val = cem.find(Passport.class, id);
		if(val!=null) {
			System.out.println(val);			
		}
		else {
			System.out.println("Data not found with that id");
		}
		
	}
	
}

