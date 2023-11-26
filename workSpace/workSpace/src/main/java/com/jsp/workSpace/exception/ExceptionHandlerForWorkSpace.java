package com.jsp.workSpace.exception;

import java.sql.SQLIntegrityConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.workSpace.util.ResponseStructure;

@RestControllerAdvice
public class ExceptionHandlerForWorkSpace {
	
	@ExceptionHandler(SQLIntegrityConstraintViolationException.class)
	public ResponseEntity<ResponseStructure<String>> exceptionHandler(SQLIntegrityConstraintViolationException e){
		
		ResponseStructure<String> st=new ResponseStructure<>();
		st.setData(e.getMessage());
		st.setMassage("you can't perfrom this operation");
		st.setStatus(HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<ResponseStructure<String>>(st,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(AdminNotFound.class)
	public ResponseEntity<ResponseStructure<String>> adminNotFound(AdminNotFound adminNotFound) {

		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setData(adminNotFound.getMsg());
		structure.setMsg("admin does not exist in the database.");
		structure.setStatus(HttpStatus.NOT_FOUND.value());

		return new ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(BuildingNotfound.class)
	public ResponseEntity<ResponseStructure<String>> buildingNotFound(BuildingNotfound buildingNotfound) {

		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setData(buildingNotfound.getMsg());
		structure.setMsg("Building not found!");
		structure.setStatus(HttpStatus.NOT_FOUND.value());

		return new ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ManagerNotfound.class)
	public ResponseEntity<ResponseStructure<String>> managerNotfound(ManagerNotfound managerNotfound){
		
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setData(managerNotfound.getMsg());
		structure.set("Manager not found!");
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	
		
	
	

}
