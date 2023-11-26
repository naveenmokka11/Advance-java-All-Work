package com.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hibernate.dto.Employee;
import com.hibernate.dto.Student;

public class EmpCrud {
	EntityManagerFactory cemf = Persistence.createEntityManagerFactory("true");
	EntityManager cem = cemf.createEntityManager();
	EntityTransaction gt = cem.getTransaction();

	public void inset(Employee emp) {
		gt.begin();
		cem.persist(emp);
		gt.commit();

	}

	public void fetch(int id) {
		Employee res = cem.find(Employee.class, id);
		if (res != null) {
			System.out.println(res);
		} else {
			System.out.println("data is not exist with that number");
		}

	}

		public void delete(int id) {
		Employee res = cem.find(Employee.class, id);
		if (res != null) {
			gt.begin();
			cem.remove(res);
			gt.commit();
		} else {
			System.out.println("sorry data is not presnt with that id");
		}
	}
		
		public void updateName(Employee emp) {
			Employee val = cem.find(Employee.class, emp.getId());
			val.setName(emp.getName());
			if (val != null) {
				gt.begin();
				cem.merge(val);
				gt.commit();
			} else {
				System.out.println("dat is not present with that id");
			}

		}


	public void updatePassword(Employee emp) {
		Employee val = cem.find(Employee.class, emp.getId());
		val.setPassword(emp.getPassword());
		if (val != null) {
			gt.begin();
			cem.merge(val);
			gt.commit();

		} else {
			System.out.println("data is not exist with that id");
		}

	}

	public void updatePhone(Employee emp) {
		Employee val = cem.find(Employee.class, emp.getId());
		val.setPhone(emp.getPhone());
		if (val != null) {
			gt.begin();
			cem.merge(val);
			gt.commit();
		} else {
			System.out.println("data not found with that id");
		}

	}

	public void updatejob(Employee emp) {
		Employee val = cem.find(Employee.class, emp.getId());
		val.setJob(emp.getJob());
		if (val != null) {
			gt.begin();
			cem.merge(val);
			gt.commit();
		}

	}
	public void getRecordByName(String name) throws Exception{
		Query qu = cem.createQuery("select a from Employee a Where a.name=?1");
			qu.setParameter(1, name);
			Employee li = (Employee) qu.getSingleResult();
			System.out.println(li);
			
		
	}
	public void getRecordByJob(String job) throws Throwable{
		Query qu = cem.createQuery("select a from Employee a where a.job=?1 ");
		qu.setParameter(1, job);
		Employee li = (Employee) qu.getSingleResult();
		System.out.println(li);
		
	}
	public void getRecordByPhone(long phone)throws Throwable {
		Query qu = cem.createQuery("select a from Employee a where a.phone=?1");
		qu.setParameter(1, phone);
		Employee li = (Employee) qu.getSingleResult();
		System.out.println(li);
		
	}
	public void getRecordByPassword(String password)throws Throwable {
		Query qu = cem.createQuery("Select a from Employee a where a.password=?1");
		qu.setParameter(1, password);
		Employee li = (Employee) qu.getSingleResult();
		System.out.println(li);
		
	}

}
