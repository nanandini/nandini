package com.xworkz.technicalcodings;

public class PrimeNumbers {
	public static void main(String[] args) {
		int num = 72;
		boolean company = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				company = true;
				break;

			}
		}
		if (company) {
			System.out.println(num + "  is a prime number");

		} else {
			System.out.println(num + "  is not a prime number");

		}
	}

}
