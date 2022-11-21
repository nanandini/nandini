package com.xworkz.technicalcodings;

public class constant {
	public static void main(String[] args) {
		int vCount = 0, cCount = 0;
		String str = "This is a really simple sentence";
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a') {
				vCount++;

			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				cCount++;
			}
		}
		System.out.println("number of vowels:" + vCount);
		System.out.println("number of consonants:" + cCount);
	}
}
