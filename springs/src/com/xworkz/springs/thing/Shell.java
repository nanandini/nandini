package com.xworkz.springs.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springs.rule.Fuel;
import com.xworkz.springs.rule.PetrolBunk;

@Component
public class Shell implements PetrolBunk {
	@Autowired
	private Fuel fuel;

	@Override
	public void purchase() {
		System.out.println("declaring given implimentations....");
		fuel.consume();
	}

	
}
