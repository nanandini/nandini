package com.xworkz.lombok.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.lombok.configuration;
import com.xworkz.lombok.DTO.FirstAidDTO;
import com.xworkz.lombok.service.FirstAidService;

public class FirstAidRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(configuration.class);
		FirstAidService service = container.getBean(FirstAidService.class);
		boolean value = service.validateAndSave(new FirstAidDTO());
		System.out.println(value);
	}

}
