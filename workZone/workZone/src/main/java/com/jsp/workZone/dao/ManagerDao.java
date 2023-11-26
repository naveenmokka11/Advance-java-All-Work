package com.jsp.workZone.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.workZone.dto.Admin;
import com.jsp.workZone.dto.Manager;
import com.jsp.workZone.repo.ManagerRepo;

@Repository
public class ManagerDao {
	
	
	@Autowired
	private ManagerRepo managerRepo;
	
	
	public Manager saveManager(Manager manager) {
		
		return managerRepo.save(manager);
		
	}
	
	public Manager finManagerBYId(int id) {
		Optional<Manager> val = managerRepo.findById(id);
		if(val.isPresent()) {
			
		return val.get();
		
			} 
		else {
			return null;
		}
		
	}


}
