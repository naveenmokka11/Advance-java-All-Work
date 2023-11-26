package com.jsp.workZone.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.workZone.dto.Admin;
import com.jsp.workZone.repo.AdminRepo;
@Repository
public class AdminDao {
	
	@Autowired
	private AdminRepo adminRepo;
	
	
	public Admin saveAdmin(Admin admin) {
		return adminRepo.save(admin);
		
	}
	
	public Admin findAdminById(int id) {
		Optional<Admin> val = adminRepo.findById(id);
		if(val.isPresent()) {
			
		return val.get();
		
			} 
		else {
			return null;
		}
		
	}

}
