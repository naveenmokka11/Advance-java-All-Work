package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.Farmer;
import com.dto.FertilizersStore;

public class FertilizerCrud {
	EntityManagerFactory cemf = Persistence.createEntityManagerFactory("true");
	EntityManager cem = cemf.createEntityManager();
	EntityTransaction gt = cem.getTransaction();

	public void insertIntoFertilizer(FertilizersStore fertilizersStore) {
		gt.begin();
		cem.persist(fertilizersStore);
		gt.commit();

	}
	public void updateStorAdress(FertilizersStore fertilizersStore) {
		FertilizersStore val = cem.find(FertilizersStore.class, fertilizersStore.getStoreNumber());
		val.setAdresss(val.getAdresss());
		if(val!=null) {
			gt.begin();
			cem.persist(val);
			gt.commit();
			
		}
		
	}
	public void deleteStore(long id,int famerid) {
		//
		FertilizersStore fartistore = cem.find(FertilizersStore.class, id);
		Farmer farmer = cem.find(Farmer.class,famerid);
		if(farmer!=null) {
			farmer.setFertilizer(null);
			gt.begin();
			cem.remove(fartistore);
			gt.commit();
			
		}
		
		
		
	}

}
