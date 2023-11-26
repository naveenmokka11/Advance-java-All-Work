package com.jsp.workZone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.workZone.dao.AdminDao;
import com.jsp.workZone.dto.Admin;
import com.jsp.workZone.util.ResponseStracture;

@Service
public class AdminService {
	
	
	@Autowired
	private AdminDao adminDao;

	public ResponseEntity<ResponseStracture<Admin>> SaveAdmin(Admin admin) {
		Admin dbadmin = adminDao.saveAdmin(admin);
		ResponseStracture<Admin> stracture = new ResponseStracture<>();
		stracture.setMsg("Admin data Saved ");
		stracture.setStatus(HttpStatus.CREATED.value());
		stracture.setData(dbadmin);
	return new ResponseEntity<ResponseStracture<Admin>>(stracture, HttpStatus.CREATED);
	
	
	}

}
