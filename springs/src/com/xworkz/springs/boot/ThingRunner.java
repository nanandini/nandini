package com.xworkz.springs.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springs.configuration.ThingConfiguration;
import com.xworkz.springs.thing.Cycle;

public class ThingRunner {

	public static void main(String[] args) {

		ApplicationContext springs6 = new AnnotationConfigApplicationContext(Cycle.class);
		Cycle reff6 = springs6.getBean(Cycle.class);
		//ApplicationContext springs17 = new AnnotationConfigApplicationContext(ThingConfiguration.class);
		//System.err.println(springs17);
	}
}
