package com.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.dto.Country;
import com.dto.State;

public class CountryCrud {
	EntityManager cem = Persistence.createEntityManagerFactory("true").createEntityManager();
	EntityTransaction gt = cem.getTransaction();

	public void insertCountry(Country country) {

		gt.begin();
		cem.persist(country);
		gt.commit();

	}

	public void updateCountry(Country country) {
		Country val = cem.find(Country.class, country.getId());
		if (val != null) {

			val.setPrimeMinister(country.getPrimeMinister());
			gt.begin();
			cem.merge(val);
			gt.commit();
		} else {
			System.out.println("country not no exist");
		}

	}

	public List<State> fetchAll() {

		Query qu = cem.createQuery("select a From State a ");

		return qu.getResultList();
	}

	public void deleteCountry(int id) {

		Country db = cem.find(Country.class, id);

		List<State> list = fetchAll();
		if (db != null) {
			if (list != null) {
				for (State state : list) {
					if (state.getCountry() != null) {
						if (state.getCountry().equals(db)) {
							System.out.println(state);
							state.setCountry(null);
							System.out.println(state);
							
						}
					}

				}
				gt.begin();
				cem.remove(db);
				gt.commit();


			}
		}
		else {
			System.out.println("country id not found");
		}

	}

	public void fetchCountry(int id) {
		Country val = cem.find(Country.class, id);
		if (val != null) {
			System.out.println(val);

		} else {
			System.out.println("id not exist");
		}

	}

}
