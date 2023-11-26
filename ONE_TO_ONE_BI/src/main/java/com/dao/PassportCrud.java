package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.Passport;
import com.dto.Person;

public class PassportCrud {
	EntityManager cem = Persistence.createEntityManagerFactory("true").createEntityManager();
	EntityTransaction gt = cem.getTransaction();

	public void insertIntoPassport(Passport passport, int id) {
		Person val = cem.find(Person.class, id);
		if (val != null) {
			val.setPassport(passport);
			gt.begin();
			cem.persist(passport);
			gt.commit();
		}
	}

	public void fetchPassport(int id) {
		Passport p = cem.find(Passport.class, id);
		if (p != null) {
			System.out.println(p.getPerson().getId() + "," + p.getPerson().getName() + "," + p.getPerson().getEmail()
					+ "," + p.getPerson().getGender() + "," + p.getPerson().getPhone() + "," + p.getPass_no()
					+ p.getName() + p.getAddress() + p.getPhone());

		} else {
			System.out.println("id not exist");
		}

	}

}
