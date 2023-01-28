package com.xworkz.browsers.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.browsers.configuration.ChromeConfiguration;
import com.xworkz.browsers.ruleType.Browser;
import com.xworkz.browsers.things.Chrome;
import com.xworkz.browsers.things.FireBox;

public class ChromeRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ChromeConfiguration.class);
		System.out.println(context.getBeanDefinitionCount());
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

		Browser browser = context.getBean(Chrome.class);
		browser.browse();                      

		FireBox firebox = context.getBean(FireBox.class);
		firebox.browse();
	}
}
