package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dto.Person;
import com.dto.Products;

public class ProductsCrud {
	EntityManagerFactory cemf = Persistence.createEntityManagerFactory("true");
	EntityManager cem = cemf.createEntityManager();
	EntityTransaction gt = cem.getTransaction();

	public void insertProduct(Products product) {
		gt.begin();
		cem.persist(product);
		gt.commit();

	}

	public void updateProductPrice(Products product) {

		Products val = cem.find(Products.class, product.getId());
		if (val != null) {
			val.setPrice(product.getPrice());
			gt.begin();
			cem.merge(val);
			gt.commit();

		} else {
			System.out.println("id does not exist so we cant change price");
		}

	}

	public List<Person> fetchAllperson() {
		Query query = cem.createQuery("Select a from Person a");
		return query.getResultList();

	}

	public void deleteProduct(int id) {
		Products db = cem.find(Products.class, id);

		List<Person> personli = fetchAllperson();

		List<Products> pli = new ArrayList<>();

		if (db != null) {
			if (personli != null) {
				for (Person person : personli) {
					List<Products> productlist = person.getProducts();

					for (Products item : productlist) {
						if (item != null) {
							if (item.equals(db)) {
								person.setProducts(null);

							} else {
								pli.add(item);
							}

						}

					}

					gt.begin();
					person.setProducts(pli);
					cem.merge(person);
					cem.remove(db);
					gt.commit();

				}

			}
		}

	}

	public void fetchProduct(int id) {
		Products val = cem.find(Products.class, id);
		if (val != null) {
			System.out.println(val);
		} else {
			System.out.println("id doesn't exist");
		}

	}

}
