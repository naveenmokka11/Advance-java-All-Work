package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.FamilyMember;
import com.dto.RationCard;

public class RationCrud {
	EntityManager cem = Persistence.createEntityManagerFactory("true").createEntityManager();
	EntityTransaction gt = cem.getTransaction();
	
	
	public void insertintorationCard(RationCard rcard) {
		gt.begin();
		cem.persist(rcard);
		gt.commit();
	}
	public void updateRationcardPhone(RationCard rcard) {
		RationCard ration = cem.find(RationCard.class, rcard.getId());
		if(ration!=null) {
			gt.begin();
			ration.setPhone(rcard.getPhone());
			cem.merge(ration);
			gt.commit();
			
		}
		else {
			System.out.println("id not exist");
		}
		
	}
	public void deleteRationcard(int id) {
		RationCard ration = cem.find(RationCard.class, id);
		if(ration !=null) {
			gt.begin();
			cem.remove(ration);
			gt.commit();
			
		}
		else {
			System.out.println("id not exist");
		}
		
	}
	public void fetchRationCard(int id) {
		RationCard ration = cem.find(RationCard.class,id);
		if(ration!=null) {
			System.out.println(ration);
			
		}
		else {
			System.out.println("id not exist");
		}
		
	}

	
		

}
