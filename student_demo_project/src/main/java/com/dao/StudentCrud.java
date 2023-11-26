package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dto.Student;

public class StudentCrud {

	EntityManager cem = Persistence.createEntityManagerFactory("true").createEntityManager();
	EntityTransaction gt = cem.getTransaction();

	public Student SaveStudent(Student student) throws Exception {
		gt.begin();
		cem.persist(student);
		gt.commit();
		return student;

	}

	public Student UpadteStudent(Student student) {
		Student val = cem.find(Student.class, student.getId());
		if (val != null) {
			gt.begin();
			cem.merge(student);
			gt.commit();
			return val;

		} else {
			return null;
		}
		

	}

	public Student deleteStudent(int id) {
		Student val = cem.find(Student.class, id);
		if (val != null) {
			gt.begin();
			cem.remove(val);
			gt.commit();
			return val;

		} else {
			return null;
		}

	}

	public Student fetchByid(int id) {
		Student val = cem.find(Student.class, id);
		return val;
	
			}

	public Student fetchByEmail(String email)throws Exception {
		Query qu = cem.createQuery("Select a from Student a where a.email=?1");
		qu.setParameter(1, email);
		Student res = (Student) qu.getSingleResult();
		return res;

	}

	public List<Student> fetchAll() {
		Query qu = cem.createQuery("Select a from Student a");
		return qu.getResultList();

			}

	public Student logIn(String email, String password) {

		Query qu = cem.createQuery("Select a from Student a where a.email=?1 and a.password=?2");
		qu.setParameter(1, email);
		qu.setParameter(2, password);
		Student res = (Student) qu.getSingleResult();
		return res;
	}

}
