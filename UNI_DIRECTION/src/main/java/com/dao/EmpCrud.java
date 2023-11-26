package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.Employee;

public class EmpCrud {
	EntityManager cem = Persistence.createEntityManagerFactory("true").createEntityManager();
	EntityTransaction gt = cem.getTransaction();

	public void InsertIntoEmp(Employee emp) {
		gt.begin();
		cem.persist(emp);
		gt.commit();

	}
}
