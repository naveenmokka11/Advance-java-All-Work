package com.contoller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cow implements Animal {

	@Override
	public void eats() {

		System.out.println(" cow eats grass");

	}

}
