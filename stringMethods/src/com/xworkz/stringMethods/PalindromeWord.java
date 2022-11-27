package com.xworkz.stringMethods;

public class PalindromeWord {
	public static void main(String[] args) {
		// Find Palindrome word in above String
		String heroGanesh = "Triple Riding is a Kannada movie released on 25 Nov, 2022.The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		System.out.println("Starting action of Movie");

		StringBuffer count = new StringBuffer(heroGanesh);
		count.reverse();
		String palindrom = count.toString();
		if (heroGanesh.equals(palindrom)) {
			System.out.println("palindrome word is in a above String");
		} else {
			System.out.println("palindrome word is not in a above String");
		}
		System.out.println("Ended of the movie");
	}

}
