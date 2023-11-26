package com.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	
	@Value("1")
	private int id;
	@Value("ravi")
	private String name;
	@Value("r@gmail.com")
	private String email;
	@Value("maths")
	private String subject;
	@Value("11111")
	private long phone;
	
	@Autowired
	private Student student;
	
	
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", email=" + email + ", subject=" + subject + ", phone=" + phone
				+ ", student=" + student + "]";
	}
	

	
	

}
