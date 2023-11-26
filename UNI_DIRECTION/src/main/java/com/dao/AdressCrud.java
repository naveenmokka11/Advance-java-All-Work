package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.Adress;
import com.dto.Employee;

public class AdressCrud {
	EntityManager cem = Persistence.createEntityManagerFactory("true").createEntityManager();
	EntityTransaction gt = cem.getTransaction();
	public void insertAdress(Adress adress,int id) {
		Employee emp = cem.find(Employee.class, id);
		List<Adress> li=new ArrayList<>();
		if(emp!=null) {
			li.add(adress);
			li.addAll(emp.getAdress());
			emp.setAdress(li);
			gt.begin();
			cem.persist(adress);
			gt.commit();
			
		}
		
		
	}

	
}
