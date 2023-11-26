package com.jsp.workZone.expections;

import java.sql.SQLIntegrityConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.workZone.util.ResponseStracture;



@RestControllerAdvice
public class ExceptionHandlerForWorkZone {
	
	@ExceptionHandler(SQLIntegrityConstraintViolationException.class)
	public ResponseEntity<ResponseStracture<String>> exceptionHandler(SQLIntegrityConstraintViolationException e){
		
		ResponseStracture<String> st=new ResponseStracture<String>();
		st.setData(e.getMessage());
		st.setMsg("you can't perfrom this operation");
		st.setStatus(HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<ResponseStracture<String>>(st,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(AdminNotFound.class)
	public ResponseEntity<ResponseStracture<String>> adminNotFound(AdminNotFound adminNotFound) {

		ResponseStracture<String> structure = new ResponseStracture<>();
		structure.setData(adminNotFound.getMsg());
		structure.setMsg("admin does not exist in the database.");
		structure.setStatus(HttpStatus.NOT_FOUND.value());

		return new ResponseEntity<ResponseStracture<String>>(structure, HttpStatus.NOT_FOUND);
	}
	
	

	@ExceptionHandler(BuildingNotfound.class)
	public ResponseEntity<ResponseStracture<String>> buildingNotFound(BuildingNotfound buildingNotfound) {

		ResponseStracture<String> structure = new ResponseStracture<>();
		structure.setData(buildingNotfound.getMsg());
		structure.setMsg("Building not found!");
		structure.setStatus(HttpStatus.NOT_FOUND.value());

		return new ResponseEntity<ResponseStracture<String>>(structure, HttpStatus.NOT_FOUND);
	}
	
	
	
	@ExceptionHandler(ManagerNotfound.class)
	public ResponseEntity<ResponseStracture<String>> managerNotfound(ManagerNotfound managerNotfound){
		
		ResponseStracture<String> structure = new ResponseStracture<>();
		structure.setData(managerNotfound.getMsg());
		structure.setMsg("Manager not found!");
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		
		return new ResponseEntity<ResponseStracture<String>>(structure, HttpStatus.NOT_FOUND);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@ExceptionHandler(ImageNotFound.class)
//	public ResponseEntity<ResponseStructure<String>> imageNotFound(ImageNotFound imageNotFound){
//		
//		ResponseStructure<String> structure = new ResponseStructure<>();
//		structure.setData(imageNotFound.getMsg());
//		structure.setMsg("Image not saved!");
//		structure.setStatus(HttpStatus.NOT_FOUND.value());
//		
//		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
//	}

}
