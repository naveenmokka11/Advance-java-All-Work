package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.ScShip;
import com.dto.Student;

public class StudentCrud {
	EntityManager cem = Persistence.createEntityManagerFactory("true").createEntityManager();
	EntityTransaction gt = cem.getTransaction();

	public void insetStudent(Student student, int id) {
		ScShip val = cem.find(ScShip.class, id);

		if (val != null) {
			student.setScShip(val);
			gt.begin();
			cem.persist(student);
			gt.commit();
		} else {
			System.out.println("Schoolers Ship not Exist");
		}

	}

	public void upadteStudent(Student student) {
		Student val = cem.find(Student.class, student.getId());
		if (val != null) {
			val.setPhone(student.getPhone());
			gt.begin();
			cem.merge(val);
			gt.commit();

		} else {
			System.out.println("id doesnot exist");
		}

	}

	public void deleteStudent(int id) {
		Student val = cem.find(Student.class, id);
		if (val != null) {
			gt.begin();
			cem.remove(val);
			gt.commit();

		} else {
			System.out.println("id not exist");
		}

	}

	public void fetchStudent(int id) {
		Student val = cem.find(Student.class, id);
		if (val != null) {
			System.out.println(val);

		} else {
			System.out.println("id not exist");
		}

	}

}
