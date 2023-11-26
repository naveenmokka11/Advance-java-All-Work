package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dto.Bank;
import com.dto.User;

public class UserCrud {

	EntityManager em = Persistence.createEntityManagerFactory("true").createEntityManager();
	EntityTransaction et = em.getTransaction();

	public User InsertUser(User user,Bank bank) {
			user.setBank(bank);
			et.begin();
			em.persist(user);
			et.commit();
			return user;
	
	}

	public User updateUser(User user) {
		User val = em.find(User.class, user.getId());
		if (val != null) {
			et.begin();
			em.merge(user);
			et.commit();
			return user;

		} else {
			return null;
		}

	}

	public User deleteUser(int id) {
		User user = em.find(User.class, id);
		if (user != null) {
			et.begin();
			em.remove(user);
			et.commit();
			return user;
		} else
			return null;
	}

	public User fetchById(int id) {
		User u = em.find(User.class, id);
		if (u != null) {
			return u;
		}
		else {
			return null;
		}
	}

	public User fetchByEmail(String email) throws Exception{
		Query q = em.createQuery("Select a from User a where a.userEmail=?1");
		q.setParameter(1, email);
		User res = (User) q.getSingleResult();
		return res;
		

	}

	public List<User> fetchAll() {
		Query qu = em.createQuery("Select a from User a ");
		return qu.getResultList();

	}

}
