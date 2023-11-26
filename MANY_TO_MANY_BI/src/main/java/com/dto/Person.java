package com.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity

public class Person {
	@Id
	private int id;
	private String name;
	private String email;
	private long phone;
	@ManyToMany(mappedBy = "persons")
	private List<Products> products;

}
