package com.jsp.workZone.expections;

import lombok.Data;

@Data
public class BuildingNotfound extends RuntimeException {
	private String msg = "Admin not found please try with different one.";

	public BuildingNotfound(String msg) {
		super();
		this.msg = msg;
	}
	public BuildingNotfound() {
		super();
	}
	
	

	
}
