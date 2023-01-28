package com.xworkz.springs.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springs.configuration.FuelConfiguration;
import com.xworkz.springs.thing.Shell;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(FuelConfiguration.class);
		
		Shell shell = context.getBean(Shell.class);
		
		System.out.println(shell);
	}

}
