package com.xworkz.lombok.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.lombok.configuration;
import com.xworkz.lombok.DTO.MissileDTO;
import com.xworkz.lombok.service.MissileService;

public class MissileRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(configuration.class);
		MissileService service = container.getBean(MissileService.class);
		boolean value = service.validateAndSave(new MissileDTO());
		System.out.println(value);
	}

}
