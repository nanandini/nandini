package com.xworkz.exceptionTask.event;

import com.xworkz.exceptionTask.configuration.ArraySizeExceededException;

public class Temple {
	
	public void method1() {
		System.out.println("Running methid1....");
		
	}
	
	public void method2() throws ArraySizeExceededException {
		System.out.println("Running method2....");
	  throw new ArraySizeExceededException();
	}

}
