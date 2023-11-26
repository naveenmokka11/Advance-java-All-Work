package com.jsp.student.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.student.dao.StudentCrud;
import com.jsp.student.dto.Student;

@RestController
public class Contoller {
	
	@Autowired
	StudentCrud crud;
	
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody  Student stu) {
		return crud.saveStudent(stu);
		
	}
	
	@PutMapping("/student")
	public Student UpdateStudent(@RequestBody Student stu) {
		return crud.UpdateStudent(stu);
	}
	@DeleteMapping("/student")
	public Student delStudent (@RequestParam int id) {
		return crud.delStudent(id);
		
	}
	@GetMapping("/student/{id}")
	public Student fetchBy(@PathVariable int  id) {
		return crud.fetchById(id);
		
	}
	@GetMapping("/studentall")
	public List<Student>  FetchAll() {
		
		return crud.fetchAll();
	}
	 

}
