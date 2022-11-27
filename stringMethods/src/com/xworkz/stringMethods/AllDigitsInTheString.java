package com.xworkz.stringMethods;

public class AllDigitsInTheString {

	public static void main(String[] args) {
		String heroGanesh = "Triple Riding is a Kannada movie released on 25 Nov, 2022.The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		System.out.println("Starting action of Movie");

		char[] chars = heroGanesh.toCharArray(); // logic to find digits in given String
		StringBuilder digits = new StringBuilder();
		for (char count : chars) {
			if (Character.isDigit(count)) {
				digits.append(count);
			}
		}
		System.out.println("numbers of digits are =" + digits);
		System.out.println("-----------");

		System.out.println("Ending of the movie");
	}

}
