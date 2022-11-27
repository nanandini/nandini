package com.xworkz.basic;

public class Methods {

	public static void main(String[] args) {
		int a = 12;
		int b = 8;
		int c = minNum(a, b);
		System.out.println("minNum:" + c);

	}

	public static int minNum(int n1, int n2) {
		int min;
		if (n1 > n2) {
			min = n2;

		} else {
			min = n1;
		}
		return min;
	}

}