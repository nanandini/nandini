package com.xworkz.lombok.boot;

import java.awt.Container;

import org.hibernate.validator.internal.metadata.aggregated.ContainerCascadingMetaData;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.lombok.configuration;
import com.xworkz.lombok.DTO.ResortDTO;
import com.xworkz.lombok.service.ResortService;

public class ResortRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(configuration.class);
		ResortService service = container.getBean(ResortService.class);
		boolean value = service.validateAndSave(new ResortDTO());
		System.out.println(value);
	}

}
