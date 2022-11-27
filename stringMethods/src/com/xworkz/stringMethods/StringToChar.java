package com.xworkz.stringMethods;

public class StringToChar {
	public static void main(String[] args) {
		// converted to char
		String heroGanesh = "Triple Riding is a Kannada movie released on 25 Nov, 2022.The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		System.out.println("Starting action of Movie");
		char[] charecters = heroGanesh.toCharArray();
		for (int chars = 0; chars < charecters.length; chars++) {
			System.out.println(charecters[chars]);
		}
		System.out.println("Ending of the movie");
	}
}
