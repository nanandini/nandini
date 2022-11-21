//write a program to count the number of character in the given String without using length() Method.

package com.xworkz.technicalcodings;

public class Count {
	public static void main(String[] args) {
		int length = 0;

		String s = "Xworkz Enterprise Development Course";
		for (char c1 : s.toCharArray())
			length++;
		System.out.println("length of String:" + length);

	}

}
