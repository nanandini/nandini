//write a program to print
//12345
//1234
//123
//12
//1

package com.xworkz.technicalcodings;

public class Print {
	public static void main(String[] args) {
		System.out.println("print the number in the correct form");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}

}
