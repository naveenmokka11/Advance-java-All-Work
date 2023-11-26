package com.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity

public class Products {
	@Id
	private int  id;
	private String name;
	private String type;
	@ManyToMany
	@JoinColumn
	private List<Person> persons;
	

}
