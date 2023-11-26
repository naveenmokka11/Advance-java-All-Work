package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.Student;
import com.dto.StudentHackerRank;

public class StudentCrud {
	EntityManager cem = Persistence.createEntityManagerFactory("true").createEntityManager();
	EntityTransaction gt = cem.getTransaction();

	public void insertStudent(Student student, int id) {
		StudentHackerRank val = cem.find(StudentHackerRank.class, id);
		if (val != null) {
			student.setStuHackRank(val);
			gt.begin();
			cem.persist(student);
			gt.commit();
		}

	}

	public void fetch(int id) {
		Student val = cem.find(Student.class, id);
		if (val != null) {
			System.out.println(val);

		} else {
			System.out.println("Data not found");
		}

	}

}
