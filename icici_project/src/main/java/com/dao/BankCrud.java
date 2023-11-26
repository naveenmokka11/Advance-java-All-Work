package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dto.Bank;

public class BankCrud {
	
	
	
	  private EntityManagerFactory emf = Persistence.createEntityManagerFactory("true");
	    private EntityManager em = emf.createEntityManager();
	    private EntityTransaction et = em.getTransaction();
	    
	    
	    public void InsertBank(Bank bank) {
	        et.begin();
	        em.persist(bank);
	        et.commit();
	    }

	    public Bank FetchById(int id) {
	    	Bank val = em.find(Bank.class, id);
	    	if(val!=null) {
	    		return val;
	    		
	    	}
	    	else {
	    		System.out.println("data not exist");
	    		return null;
	    	
	    	}
	        
	    }
	    
	    public Bank setBalance(int id,double bal) {
	    	Bank val = em.find(Bank.class, id);
	    	if(val!=null) {
	    	val.setBankBalance(bal);
	    	et.begin();
	    	em.merge(val);
	    	et.commit();
	    	return val;
	    		
	    	}
	    	else {
	    		System.out.println("data not exist");
	    		return null;
	    	
	    	}
	        
	    }

	   
	    public Bank checkBal(int id) {
	    	Bank val = em.find(Bank.class, id);
	    	if(val!=null) {
	    		   return val;
	    		
	    	}
	    	else {
	    		
	    		return null;
	    	
	    	}
	        
	    }

	    
	    
	    
	    
	    
	    public void updateBank(Bank bank) {
	        et.begin();
	        em.merge(bank);
	        et.commit();
	    }
	    public void deleteBank(Bank bank) {
	        et.begin();
	        em.remove(bank);
	        et.commit();
	    }
	    public List<Bank> findBanksByBranchName(String branchName) {
	        Query query = em.createQuery("SELECT b FROM Bank b WHERE b.branchName = :branchName");
	        query.setParameter("branchName", branchName);

	        return query.getResultList();
	    }

	    public List<Bank> findBanksWithBalanceGreaterThan(double amount) {
	        Query query = em.createQuery("SELECT b FROM Bank b WHERE b.bankBal > :amount");
	        query.setParameter("amount", amount);

	        return query.getResultList();
	    }
	
	

}
