package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dto.ScShip;
import com.dto.Student;

public class ScShipCrud {
	EntityManager cem = Persistence.createEntityManagerFactory("true").createEntityManager();
	EntityTransaction gt = cem.getTransaction();

	public void scShipInsert(ScShip ship) {
		gt.begin();
		cem.persist(ship);
		gt.commit();
	}

	// scShip
	public void scShipUpadte(ScShip ship) {
		ScShip val = cem.find(ScShip.class, ship.getScship_no());
		if (val != null) {
			val.setPhone(ship.getPhone());
			gt.begin();
			cem.merge(val);
			gt.commit();

		} else {
			System.out.println("id not exist");
		}

	}

	public void scShipDelete(int id, int sid) {
		ScShip val = cem.find(ScShip.class, id);
		Student stu = cem.find(Student.class, sid);
		if (val != null) {
			stu.setScShip(null);
			gt.begin();
			cem.remove(val);
			gt.commit();

		} else {
			System.out.println("id not exist");
		}

	}

	public void scShipfetch(int id) {
		ScShip val = cem.find(ScShip.class, id);
		if (val != null) {
			System.out.println(val);

		} else {
			System.out.println("id not exist");
		}

	}

}
