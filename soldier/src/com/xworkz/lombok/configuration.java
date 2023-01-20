package com.xworkz.lombok;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.lombok")
public class configuration {
	public configuration() {
		System.out.println("Running Configuration...");

	}

	@Bean
	public Validator validator() {
		ValidatorFactory value = Validation.buildDefaultValidatorFactory();
		Validator valide = value.getValidator();
		return valide;

	}

}
