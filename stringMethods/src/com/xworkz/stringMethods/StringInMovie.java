package com.xworkz.stringMethods;

public class StringInMovie {

	public static void main(String[] args) {
		String heroGanesh = "Triple Riding is a Kannada movie released on 25 Nov, 2022.The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		System.out.println("Starting action of the whole movie");

// split all by space
		String[] splits = heroGanesh.split("Triple Riding ");
		for (int ride = 0; ride < splits.length; ride++) {
			System.out.println(splits[ride]);
		}
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
		char[] chars = heroGanesh.toCharArray(); // logic to find digits in given String
		StringBuilder digits = new StringBuilder();
		for (char count : chars) {
			if (Character.isDigit(count)) {
				digits.append(count);
			}
		}
		System.out.println("numbers of digits are =" + digits);
		System.out.println("-----------");
		String[] splitBy = heroGanesh.split(","); // split by ,
		for (int i = 0; i < splitBy.length; i++) {
			System.out.println("splitted movie by , " + splitBy[i]);
		}
		char[] charecters = heroGanesh.toCharArray();
		for (int charec = 0; charec < charecters.length; charec++) {
			System.out.println(charecters[charec]);
		}
		String reverse = new StringBuffer(heroGanesh).reverse().toString();
		System.out.println("reverse the above String  =" + reverse);
		System.out.println("Ending of the movie");

		System.out.println(heroGanesh.toUpperCase());
		System.out.println(heroGanesh.toLowerCase());

		char[] character = heroGanesh.toCharArray();

		char[] duplicate = heroGanesh.toCharArray();
		int index1;
		for (int i = 0; i < duplicate.length; i++) {
			index1 = 1;
			for (int j = 0; j < duplicate.length; j++) {
				if (duplicate[i] == duplicate[j] && duplicate[i] != ' ') {
					index1++;
					duplicate[j] = '0';
				}
				if (index1 > 1 && duplicate[i] != '0')
					System.out.println("dupicate Characters are =" + duplicate[j]);

			}

		}
		StringBuffer count = new StringBuffer();
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