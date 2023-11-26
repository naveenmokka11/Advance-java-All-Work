package com.dao;

import com.dto.Person;
import com.dto.Products;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonCrud {

	EntityManagerFactory cemf = Persistence.createEntityManagerFactory("true");
	EntityManager cem = cemf.createEntityManager();
	EntityTransaction gt = cem.getTransaction();

	public void insertPerson(Person person) {
		gt.begin();
		cem.persist(person);
		gt.commit();

	}

	public void buyProduct(int id, List<Integer> productids) {
		Person person = cem.find(Person.class, id);
		List<Products> li = new ArrayList<>();

		if (person != null) {
			for (Integer proid : productids) {
				Products val = cem.find(Products.class, proid);
				if (val != null) {
					li.add(val);

				} 
				else {
					System.out.println("with that id product is not exist");
				}

			}
			li.addAll(person.getProducts());
			person.setProducts(li);
			gt.begin();
			cem.merge(person);
			gt.commit();

		}

	}
	public void updatePerson(Person person) {
		Person val = cem.find(Person.class, person.getId());
		if(val!=null) {
			val.setPhone(person.getPhone());
			gt.begin();
			cem.merge(val);
			gt.commit();
			
		}
		else {
			System.out.println("id  not exist");
		}
		
		
	}
	public void deletePerson(int id) {
		Person val = cem.find(Person.class, id);
		if(val!=null) {
			gt.begin();
			cem.remove(val);
			gt.commit();
			
		}
		else {
			System.out.println("person id not exist");
		}
		
	}
	public void fetchPerson(int id) {
		Person val = cem.find(Person.class, id);
		if(val!=null) {
			System.out.println(val);
			
		}
		else {
			System.out.println("id not exist");
		}
		
	}

}
