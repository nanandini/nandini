package com.xworkz.springs.thing;

import org.springframework.stereotype.Component;

import com.xworkz.springs.rule.Fuel;

@Component
public class Petrol implements Fuel {

	@Override
	public void consume() {
		System.out.println("Declaring and Implementing .....");
	}

}
