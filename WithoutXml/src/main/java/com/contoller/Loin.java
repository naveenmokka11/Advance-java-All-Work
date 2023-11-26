package com.contoller;

import org.springframework.stereotype.Component;

@Component
public class Loin  implements Animal{

	@Override
	public void eats() {
		System.out.println("Lion eats meat");
		
	}

}
