package com.jsp.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.student.dto.Student;

public interface StudentRepo  extends JpaRepository<Student, Integer>{

}
