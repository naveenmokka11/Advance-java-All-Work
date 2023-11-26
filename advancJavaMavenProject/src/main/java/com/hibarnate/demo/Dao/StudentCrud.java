package com.hibarnate.demo.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hibarnate.demo.dto.Student;

public class StudentCrud {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("true");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	//inserting  the data
	public void saveStudent(Student student) {
		et.begin();
		em.persist(student);
		et.commit();

	}
	
	//retriving the data
	public void fatchStudent(int id) {
			 Student res = em.find(Student.class ,id);
			 System.out.println(res);
		
		
	}
	//updaing the data
	public void updateStudent(Student student) {
		Student res = em.find(Student.class, student.getId());
		res.setName(student.getName() );
		if(res!=null) {
		et.begin();
		Student stu = em.merge(res);
		et.commit();
		}
		
		else {
			System.out.println("data is not exist so iam inserting data");


		}
	
	
		}
	//deleting the data
	public void removeStudent(int id) {
		Student res = em.find(Student.class,id);
		if(res!=null) {
			et.begin();
			em.remove(res);
			et.commit();
		}
		else {
			System.out.println("sorry data is not exist");
		}
		
	}
	public void getAllRecord() {
		 
		Query res = em.createQuery("Select a from Student a");
		List<Student> list = res.getResultList();
		System.out.println(list);
	
	
}
	public void getRecordByEmail(String email) throws Exception {
		 
		Query res = em.createQuery("Select a from Student a where a.email=?1");
			res.setParameter(1, email);
		List<Student> list = res.getResultList();
			//Student student = (Student)res.getSingleResult();
		//System.out.println(student);
		System.out.println(list);
	
	}
	public void getRecordByName(String name) {
		Query qu = em.createQuery("Select a from Student a where a.name=?1");
		qu.setParameter(1, name);
		List li = qu.getResultList();
		System.out.println(li);
		
	}
	


}
