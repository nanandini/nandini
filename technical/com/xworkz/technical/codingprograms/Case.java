package com.xworkz.technical.codingprograms;

public class Case {
	public static void main(String[] args) {

		String str = "NANDINI";
		int i;
		char str[] = str.tocharArray();
		for (int i = 0; i < str.length; i++) {
			if (str[i] >= 'a' && str[i] <= 'z') {
				str[i] = (char) ((int) str[i] + 32);

			}
		}
		System.out.println("The string in lower case is");
		for (int i = 0; i < args.length; i++) {
			System.out.println(str[i]);

		}
	}

}
