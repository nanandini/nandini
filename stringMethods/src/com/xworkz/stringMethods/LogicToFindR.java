package com.xworkz.stringMethods;

public class LogicToFindR {
	public static void main(String[] args) {

		String heroGanesh = "Triple Riding is a Kannada movie released on 25 Nov, 2022.The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		System.out.println("Starting action of Movie");

		// write logic to find no of 'R' in above sentence
		System.out.println("-------");
		System.out.println("find R in the above sentence");
		String alpha = "R";
		String repeates[] = heroGanesh.split(" ");
		int index = 0;
		for (int i = 0; i < repeates.length; i++) {
			if (alpha.equals(repeates[i]))
				index++;
		}
		System.out.println("The  " + alpha + " present " + index + " in the above sentence");
		System.out.println("Ended of the movie");
	}
}
