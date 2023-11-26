package com.jsp.workZone.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.workZone.dto.Building;
import com.jsp.workZone.repo.BuildingRepo;

@Repository
public class BuildingDao {
	
	
	@Autowired
	private BuildingRepo buildingRepo;
	
	public  Building saveBuilding(Building building) {
		
		return buildingRepo.save(building);
		
	}
	public Building fetchBuildingById(int id) {
		
		Optional<Building> val = buildingRepo.findById(id);
		if(val.isPresent()) {
			
			return val.get();
			
				} 
			else {
				return null;
			}
			

	}

}
