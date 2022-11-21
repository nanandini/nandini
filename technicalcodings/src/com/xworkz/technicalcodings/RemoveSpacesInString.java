//Write a program to remove all the white spaces in the String.

package com.xworkz.technicalcodings;

public class RemoveSpacesInString {
	public static void main(String[] args) {
		String str1 = "pursuing at xworkz at Rajajinagar";
		str1 = str1.replaceAll("\\s+", "");
		System.out.println("String after removing all the white spaces:" + str1);

	}

}
