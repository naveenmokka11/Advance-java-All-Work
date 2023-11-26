package com.jsp.workSpace.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.jsp.workSpace.dto.Admin;
import com.jsp.workSpace.service.AdminService;
import com.jsp.workSpace.util.ResponseStructure;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/admin")
	
	public ResponseEntity<ResponseStructure<Admin>> Admin (@RequestBody Admin admin) {
		return adminService.saveAdmin(admin);
		
	}
	
	
}
