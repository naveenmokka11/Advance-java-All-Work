package com.dto;

import org.springframework.stereotype.Component;

@Component
public class Student {
	int id;
	String name;
	String email;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	

}
