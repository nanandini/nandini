//program to find the frequency of a given character in the string 

package com.xworkz.technicalcodings;

public class Frequency {

	public static void main(String[] args) {

		String ref = "X-workz Software development training";
		char chr = 'e';
		int frequency = 0;
		for (int i = 0; i < ref.length(); i++) {
			if (chr == ref.charAt(i)) {

				frequency++;

			}

		}
		System.out.println("frequency of given character:" + ref + "charchter:" + frequency);

	}

}
