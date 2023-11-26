package mvc_project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import mvc_project.dto.User;
@Repository
public class UserCrud {
	EntityManager cem = Persistence.createEntityManagerFactory("true").createEntityManager();
	EntityTransaction gt = cem.getTransaction();
	
	
	public User Insert(User user) {
		gt.begin();
		cem.persist(user);
		gt.commit();
		return user;
		
	}
	public User Login(String email)  throws Exception{
	
		Query qu = cem.createQuery("select a from User a Where a.email=?1");
		qu.setParameter(1, email);
		User res = (User)qu.getSingleResult();
		return res;
		
		
	}
	
	public List<User> fetchAll(){
		Query qu = cem.createQuery("select a from User a");
		return qu.getResultList();
		
	}
	public User fetchById(int id) {
		User val = cem.find(User.class, id);
		if(val!=null) {
			return val;
		}
		else {
			return null;
		}
		
	}
	public User Update(User user) {
		User val = cem.find(User.class, user.getId());
		if(val!=null) {
			gt.begin();
			cem.merge(user);
			gt.commit();
			return user;
			
		}
		else {
			return null;
		}
		
	}
	public User Delete(int id) {
		User val = cem.find(User.class,id);
		if(val!=null) {
			gt.begin();
			cem.remove(val);
			gt.commit();
			return val;
			
		}
		else {
			return null;
		}
		
	}

}
