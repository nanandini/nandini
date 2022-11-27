package com.xworkz.stringMethods;

public class SplitAllBySpace {
	public static void main(String[] args) {

		String heroGanesh = "Triple Riding is a Kannada movie released on 25 Nov, 2022.The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		System.out.println("Starting action of Movie");
	   // split all by space
		String[] splits = heroGanesh.split("Triple Riding ");
		for (int ride = 0; ride < splits.length; ride++) {
			System.out.println(splits[ride]);
		}

		System.out.println("Ending of the movie");
	}
}
