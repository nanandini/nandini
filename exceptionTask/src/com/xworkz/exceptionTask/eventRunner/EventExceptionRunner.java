package com.xworkz.exceptionTask.eventRunner;

import java.rmi.activation.ActivationException;

import com.xworkz.exceptionTask.event.EventException;

public class EventExceptionRunner {

	public static void main(String[] args) {

		EventException creator = new EventException();
		try { // this is try block here try will help to come out of exception but not handle
				// it

			System.out.println("before method 2");
			creator.method2();
			System.out.println("after method 2");
		} catch (ActivationException e) { // it will handle the exception and continues execution
											// e.printStackTrace(); to print stack trace
			System.err.println("the exception is in main method");
		}
	}

}
