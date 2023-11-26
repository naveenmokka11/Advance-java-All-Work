package com.jsp.workZone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.workZone.dto.Building;
import com.jsp.workZone.service.BuildingService;
import com.jsp.workZone.util.ResponseStracture;

@RestController
public class BuildingController {
	@Autowired
	private BuildingService buildingService;
	
	@PostMapping("/saveBuilding")
	public ResponseEntity<ResponseStracture<Building>> saveBuilding(@RequestBody Building building , @RequestParam int Adminid){
		
		return buildingService.saveBuilding(building,Adminid );
	}

}
