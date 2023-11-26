package com.jsp.workZone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jsp.workZone.dto.Manager;
import com.jsp.workZone.service.ManagerService;
import com.jsp.workZone.util.ResponseStracture;

@RestController
public class ManagerController {

	@Autowired
	private ManagerService managerService;
	
	@PostMapping("/saveManager")
	public ResponseEntity<ResponseStracture<Manager>> saveManager(@RequestBody Manager manager) {

		return managerService.saveManager(manager);

	}

}
