package com.xworkz.springs.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springs.configuration.FeedConfiguration;
import com.xworkz.springs.mavenType.Cow;

public class FeedRunner {
	public static void main(String[] args) {
		ApplicationContext village = new AnnotationConfigApplicationContext(FeedConfiguration.class);
		Cow agri = village.getBean(Cow.class);
		System.err.println(agri);
		String agri2 = village.getBean("pomogranet", String.class);
		System.out.println(agri2);

	}

}
