package com.xworkz.springs.thing;

import com.xworkz.springs.rule.Fuel;

public class Diesel implements Fuel {

	@Override
	public void consume() {
		System.out.println("calling consume method from fuel");
	}

}
