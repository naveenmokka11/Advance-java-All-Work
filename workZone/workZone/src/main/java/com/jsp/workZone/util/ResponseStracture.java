package com.jsp.workZone.util;

import lombok.Data;

@Data
public class ResponseStracture<T> {
	private String msg;
	private int status;
	private T data;

}
