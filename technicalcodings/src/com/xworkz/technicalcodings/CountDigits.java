package com.xworkz.technicalcodings;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		int count = 0;
		System.out.println("enter a number:");
		int num = ref.nextInt();
		while (num != 0) {
			num = num / 10;
			count++;

		}
		System.out.println("no of digits is :" + count);

	}

}
