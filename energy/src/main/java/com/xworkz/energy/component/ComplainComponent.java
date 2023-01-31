package com.xworkz.energy.component;

import org.springframework.stereotype.Component;

@Component
public class ComplainComponent {
	public ComplainComponent() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

}
