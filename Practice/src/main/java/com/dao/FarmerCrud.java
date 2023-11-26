package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.Farmer;
import com.dto.FertilizersStore;

public class FarmerCrud {
	EntityManagerFactory cemf = Persistence.createEntityManagerFactory("true");
	EntityManager cem = cemf.createEntityManager();
	EntityTransaction gt = cem.getTransaction();

	public void insertIntoFarmer(Farmer farmer, long id) {
		FertilizersStore val = cem.find(FertilizersStore.class, id);
		if (val != null) {
			farmer.setFertilizer(val);
			gt.begin();
			cem.persist(farmer);
			gt.commit();
		}

	}

}
