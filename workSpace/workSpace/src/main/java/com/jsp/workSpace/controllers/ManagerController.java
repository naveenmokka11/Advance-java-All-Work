package com.jsp.workSpace.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.workSpace.dto.Manager;
import com.jsp.workSpace.service.ManagerService;
import com.jsp.workSpace.util.ResponseStructure;

@RestController
public class ManagerController {
	
	@Autowired
	private ManagerService managerService;
	
	@PostMapping("/saveManager")
	public ResponseEntity<ResponseStructure<Manager>> saveManager(@RequestBody Manager manager) {
		return managerService.saveManager(manager);
	}
	
	
	

}
