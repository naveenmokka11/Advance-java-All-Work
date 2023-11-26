package com.jsp.workZone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.workZone.dao.ManagerDao;
import com.jsp.workZone.dto.Manager;
import com.jsp.workZone.util.ResponseStracture;

@Service
public class ManagerService {
	
	@Autowired
	private ManagerDao managerdao;
	
	public ResponseEntity<ResponseStracture<Manager>> saveManager(Manager manager){
		
		Manager dbdata = managerdao.saveManager(manager);
		
		ResponseStracture<Manager> stracture=new ResponseStracture<>();
		stracture.setMsg("manager Data Saved");
		stracture.setStatus(HttpStatus.CREATED.value());
		
		stracture.setData(dbdata);
		
		return new ResponseEntity<ResponseStracture<Manager>>(stracture,HttpStatus.CREATED);
	}

}
