package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dto.Bank;
import com.dto.Customer;


public class CustomerCrud {
	
	
	
	
	EntityManager cem = Persistence.createEntityManagerFactory("true").createEntityManager();
	EntityTransaction gt = cem.getTransaction();
	
	public Customer InsertCust( Customer cust,Bank bank) {
		cust.setBank(bank);
		gt.begin(); 
		cem.persist(cust);
		gt.commit();
		return cust;
	}
	
	public Customer UpdateCust(Customer cust) {
		Customer val = cem.find(Customer.class, cust.getId());
		if(val!=null) {
		gt.begin();
		cem.merge(cust);
		gt.commit();
		return cust;
		}
		else {
			return null;
		}
		
	}
	public Customer delete(int id) {
		Customer val = cem.find(Customer.class, id);
		if(val!=null) {
			gt.begin();
			cem.refresh(val);
			gt.commit();
			return val;
			
		}
		else {
			return null;
		}
		
	}
	public Customer fetchCust( int id) {
		Customer val = cem.find(Customer.class, id);
		if(val!=null) {
			return val;
			
		}
		else {
			return null;
		}
		
	}
	
	
	public Customer fetchByEmail( String email)  throws Exception{
		
		Query qu = cem.createQuery("Select a from Customer a where a.CEmail=?1");
		qu.setParameter(1, email);
		return (Customer) qu.getSingleResult();
		
	}
	
	public List<Customer> fetchAll() {
		Query qu = cem.createQuery("Select a from Customer a ");
		return qu.getResultList();

	}

	
//	public Customer fundTrasCustomer (long acc1,long acc2) {
//		
//		
//	}

	
	
	

}
