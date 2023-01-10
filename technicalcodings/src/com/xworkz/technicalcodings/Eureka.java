package com.xworkz.technicalcodings;

import java.util.Scanner;

public class Eureka {
	public static void main(String[] args) {
		Scanner sp = new Scanner(System.in);
		int start = sp.nextInt(); // nextInt it used to accept the integer
		int end = sp.nextInt();
		// System.out.println(start);
		// System.out.println(end);
		for (int i = start; i <= end; i++) {
			// System.out.println(i);
			int num= i;
			int temp=num;
			//System.out.println(" " + temp);
			int count = 0;
			for (; temp != 0; temp = temp / 10) {
				count++;

			}
			int n = temp;
			int ref = 0;
			int sum = 0;
			for (; n > 0; n = n / 10) {
				num = n % 10;
				sum += (int) Math.pow(num, sum);
				count--;

			}
			if (num == sum) {
				System.out.println(num + " ");
			}
		}
	}

}
