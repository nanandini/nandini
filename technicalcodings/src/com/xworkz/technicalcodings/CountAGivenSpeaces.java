package com.xworkz.technicalcodings;

public class CountAGivenSpeaces {
	public static void main(String[] args) {
		String str = "Im am nandini from chikkaballapur";

		char[] chr = str.toCharArray();
		int count = 0;
		for (int i = 0; i < chr.length - 1; i++) {
			if (chr[i] == ' ') {
				count++;

			}

		}
		System.out.println("counting no of spaces given in a string:" + count);

	}
}
