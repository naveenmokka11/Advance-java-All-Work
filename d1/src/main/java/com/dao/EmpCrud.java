package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dto.Emp;

public class EmpCrud {

	EntityManager cem = Persistence.createEntityManagerFactory("true").createEntityManager();
	EntityTransaction gt = cem.getTransaction();

	

	public Emp InsertIntEmp(Emp emp) throws Exception {
	gt.begin();
	cem.persist(emp);
	gt.commit();
	return emp;
		
	}
	
	public Emp UpdateEmp(Emp emp) {
		Emp val = cem.find(Emp.class, emp.getId());
		if(val!=null) {
			gt.begin();
			cem.merge(emp);
			gt.commit();
			return emp;
			
		}
		else {
			return null;
		}
		
		
	}
	public Emp delete(int id) {
		Emp val = cem.find(Emp.class, id);
		if(val!=null) {
			gt.begin();
			cem.remove(val);
			gt.commit();
			return val;
		}
		else {
			return null;
		}
		
	}
	public Emp fetchById(int id) {
		Emp val = cem.find(Emp.class,id );
		if(val!=null) {
			return val;
			
		}
		else {
			return null;
		}
		
	}
	public Emp fetchByEmail(String email) throws Exception {
		Query qu = cem.createQuery("Select a from Emp a where a.email=?1");
		qu.setParameter(1, email);
		return (Emp) qu.getSingleResult();
		
	}
	public List<Emp> fetchAll() {
		Query que = cem.createQuery("select a from Emp a");
		List res = que.getResultList();
		return res;
	}
	
}
