package com.jsp.workSpace.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.workSpace.dto.Manager;
import com.jsp.workSpace.repo.ManagerRepo;

@Repository
public class Managerdao {

	@Autowired
	ManagerRepo managerRepo;
	
	public  Manager saveManager(Manager manager) {
	
		return managerRepo.save(manager);
		
	}
	public Manager fetchById(int id) {
		Optional<Manager> val = managerRepo.findById(id);
		if(val.isPresent()) {
			return val.get();
			
		}
		else {
			return null;
		}
		
	}
}
