package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.Passport;

public class PassportCrud {
	EntityManagerFactory cemf = Persistence.createEntityManagerFactory("true");
	EntityManager cem = cemf.createEntityManager();
	EntityTransaction gt = cem.getTransaction();

	public void insertPassport(Passport passport) {
		gt.begin();
		cem.persist(passport);
		gt.commit();
	}

	public void deletePassport(int id) {
		Passport val = cem.find(Passport.class, id);
		if (val != null) {
			gt.begin();
			cem.remove(val);
			gt.commit();

		}

	}

}
