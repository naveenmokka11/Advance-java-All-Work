package com.jsp.workSpace.util;

import lombok.Data;

@Data
public class ResponseStructure <T>{
	
	
	private String massage;
	private int status;
	private T data;

}
