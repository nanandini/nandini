package com.xworkz.exceptionTask.eventRunner;

import com.xworkz.exceptionTask.configuration.ArraySizeExceededException;
import com.xworkz.exceptionTask.event.Temple;

public class TempleRunner {

	public static void main(String[] args) {

		Temple ref = new Temple();
		try {
			ref.method1();
			ref.method2();
		} catch (ArraySizeExceededException e) {
			System.out.println("Running catch block...");
		}

	}

}
