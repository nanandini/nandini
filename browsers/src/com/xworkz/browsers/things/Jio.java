package com.xworkz.browsers.things;

import org.springframework.stereotype.Component;

import com.xworkz.browsers.ruleType.Provider;
@Component
public class Jio implements Provider {

	@Override
	public void connect() {
		System.out.println("calling connect nethod from Provider");
	}

}
