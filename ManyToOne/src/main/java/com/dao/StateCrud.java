package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.Country;
import com.dto.State;

public class StateCrud {
	
	EntityManager cem = Persistence.createEntityManagerFactory("true").createEntityManager();
	EntityTransaction gt = cem.getTransaction();
	
	
	public void insertIntoSate(State state,int cid) {
		
		Country val = cem.find(Country.class,cid);
		
		if(val!=null) {
		state.setCountry(val);
		gt.begin();
		cem.persist(state);
		gt.commit();
		}
		
		
	}
	public void upadteState(State state) {
		
		State val = cem.find(State.class, state.getId());
		
		if(val!=null) {
			
		val.setChiefMinister(state.getChiefMinister());
		
			gt.begin();
			cem.merge(val);
			gt.commit();
			
		}
		else {
			System.out.println("id not exist");
		}
		
	}
	
	public void deleteState(int id) {
		
		State val = cem.find(State.class, id);
		
		if(val!=null) {
			gt.begin();
			cem.remove(val);
			gt.commit();
			
		}
		else {
			System.out.println("id not exist");
		}
		
	}
	
	public void fetchState(int id) {
	State val = cem.find(State.class, id);
	if(val!=null) {
		System.out.println(val);
		
	}
	else {
		System.out.println("id not exist");
	}
		
	}

}
