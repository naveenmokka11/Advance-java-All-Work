package com.jsp.workSpace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.workSpace.dao.Managerdao;
import com.jsp.workSpace.dto.Manager;
import com.jsp.workSpace.util.ResponseStructure;

@Service
public class ManagerService {
	
	@Autowired
	private Managerdao Managerdao;
	
	public ResponseEntity<ResponseStructure<Manager>> saveManager(Manager manager){
		
		Manager val = Managerdao.saveManager(manager);
		
		ResponseStructure<Manager> rs=new ResponseStructure<>();
		
		rs.setMassage("data Saved successfully");
		rs.setStatus(HttpStatus.CREATED.value());
		rs.setData(val);
		
		return new ResponseEntity<ResponseStructure<Manager>>(rs,HttpStatus.CREATED); 
		
		
	}

}
