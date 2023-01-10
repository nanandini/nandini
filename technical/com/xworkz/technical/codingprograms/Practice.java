package com.xworkz.technical.codingprograms;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // user input scanner is class
		String coupon = scanner.next();
		String str1 = coupon.substring(0, 2);
		System.out.println(str1);
		
		String str2=coupon.substring(2, 6);
		System.out.println(str2);
		
		String str3=coupon.substring(6, 9);
		System.out.println(str3);
		
		//int convertString=Integer.parseInt(str2);
		int convertString=Integer.valueOf(str2);
		System.out.println("convert a given String to int: "+convertString);

	}

}
