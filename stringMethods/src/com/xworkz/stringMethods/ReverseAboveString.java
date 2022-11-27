package com.xworkz.stringMethods;

public class ReverseAboveString {
	public static void main(String[] args) {
		// Reverse above String
		String heroGanesh = "Triple Riding is a Kannada movie released on 25 Nov, 2022.The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		System.out.println("Starting action of Movie");
		String reverse = new StringBuffer(heroGanesh).reverse().toString();
		System.out.println("reverse the above String  =" + reverse);
		System.out.println("Ending of the movie");

	}

}
