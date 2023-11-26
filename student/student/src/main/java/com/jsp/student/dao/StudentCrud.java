package com.jsp.student.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.student.dto.Student;
import com.jsp.student.repo.StudentRepo;

@Repository
public class StudentCrud {
	
	@Autowired
	StudentRepo repo;

	public Student saveStudent(Student stu) {

		return repo.save(stu);

	}

	public Student UpdateStudent(Student stu) {
		Optional<Student> val = repo.findById(stu.getId());
		if (val.isPresent()) 
			return repo.save(stu);
		else 
			return null;
		

	}
	public Student delStudent(int id) {
		Optional<Student> val = repo.findById(id);
		if(val.isPresent()) {
			repo.delete(val.get());
			return val.get();
			
		}
		else {
			return null;
		}
		
	}
	public Student fetchById(int id) {
		
		Optional<Student> val = repo.findById(id);
		
		if(val.isEmpty()) 
			return val.get();
		else 
			return null;
		
		
		
	}
	public List<Student> fetchAll() {
		
		return repo.findAll();
		
	}

}
