package com.xworkz.stringMethods;

public class DuplicateChar {
	public static void main(String[] args) {

		// Print all Duplicate Characters
		String heroGanesh = "Triple Riding is a Kannada movie released on 25 Nov, 2022.The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		System.out.println("Starting action of Movie");

		char[] character = heroGanesh.toCharArray();

		char[] duplicate = heroGanesh.toCharArray();
		int index;
		for (int i = 0; i < duplicate.length; i++) {
			index = 1;
			for (int j = 0; j < duplicate.length; j++) {
				if (duplicate[i] == duplicate[j] && duplicate[i] != ' ') {
					index++;
					duplicate[j] = '0';
				}
				if (index > 1 && duplicate[i] != '0')
					System.out.println("dupicate Characters are =" + duplicate[j]);

			}
			System.out.println("Ended of the movie");
		}
	}
}
