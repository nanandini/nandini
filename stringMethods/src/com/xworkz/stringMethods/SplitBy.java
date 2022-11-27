package com.xworkz.stringMethods;

public class SplitBy {
	public static void main(String[] args) {

		// split by ,

		String heroGanesh = "Triple Riding is a Kannada movie released on 25 Nov, 2022.The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		System.out.println("Starting action of Movie");
		String[] splitBy = heroGanesh.split(","); // split by ,
		for (int i = 0; i < splitBy.length; i++) {
			System.out.println("splitted movie by , " + splitBy[i]);
		}
		System.out.println("Ending of the movie");
	}

}
