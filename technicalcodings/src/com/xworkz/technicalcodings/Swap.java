//	Write a function that returns a string in which first name is swapped with last name.
//for ex:(input-->output)

package com.xworkz.technicalcodings;

public class Swap {

	public static void main(String[] args) {
		String name = "Sindhu Nandhu";
		System.out.println("Before swap:\n" + name);
		String firstName = name.substring(0, name.indexOf("Sindhu"));
		String lastName = name.substring(name.indexOf("Nandhu"));
		String swapName = lastName + "" + firstName;
		System.out.println("After swap:\n" + swapName);

	}

}