package com.jsp.workSpace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.workSpace.dao.Admindao;
import com.jsp.workSpace.dto.Admin;
import com.jsp.workSpace.util.ResponseStructure;
@Service
public class AdminService {
@Autowired
	private Admindao admindao;
	
	public ResponseEntity<ResponseStructure<Admin>> saveAdmin(Admin admin){
		Admin db = admindao.saveAdmin(admin);
		ResponseStructure<Admin> st=new ResponseStructure<>();
		st.setMassage("admin save Sucessfully");
		st.setStatus(HttpStatus.CREATED.value());
		st.setData(db);
		
		return new ResponseEntity<ResponseStructure<Admin>>(st,HttpStatus.CREATED);
	}
}
