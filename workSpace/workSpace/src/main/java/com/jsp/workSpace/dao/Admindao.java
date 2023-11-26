package com.jsp.workSpace.dao;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.workSpace.dto.Admin;
import com.jsp.workSpace.repo.AdminRepo;

@Repository
public class Admindao {
	
	@Autowired
	AdminRepo repo;
	
	public Admin saveAdmin(Admin admin) {
		
		return 	repo.save(admin);	
	}
	public Admin fetchAdmin(int id) {
		
		Optional<Admin> val = repo.findById(id);
		if(val.isPresent()) {
			return val.get();
			
		}
		else {
			return null;
		}
		
		
	}
	
	

}
