package com.jsp.workZone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.workZone.dto.Admin;
import com.jsp.workZone.service.AdminService;
import com.jsp.workZone.util.ResponseStracture;

@RestController
public class AdminController {
	
	@Autowired
	AdminService Adminservice;
	
	@PostMapping("/saveAdmin")
	public  ResponseEntity<ResponseStracture<Admin>> saveAdmin(@RequestBody Admin admin) {
		
		return Adminservice.SaveAdmin(admin);
	}

}
