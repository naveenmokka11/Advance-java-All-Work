package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.Bank;

public class BankCrud {
	
	
	EntityManager cem = Persistence.createEntityManagerFactory("true").createEntityManager();
	EntityTransaction gt = cem.getTransaction();

	public Bank InsertBank(Bank Bank) {
		gt.begin();
		cem.persist(Bank);
		gt.commit();
		return Bank;

	}

	public Bank UpdateBank(Bank bank) {
		Bank val = cem.find(Bank.class, bank.getId());
		
		if (val != null) {
			
			val.setBalance(bank.getBalance());
			gt.begin();
			cem.merge(val);
			gt.commit();
			return val;

		} else {
			return null;
		}

	}

	public Bank deleteBank(int id) {
		Bank val = cem.find(Bank.class, id);
		if (val != null) {
			gt.begin();
			cem.remove(val);
			gt.commit();
			return val;

		} else {
			return null;
		}

	}

	public Bank fetchBank(int id) {
		Bank val = cem.find(Bank.class, id);
		if (val != null) {
			return val;

		} else {
			return null;
		}

	}

}
