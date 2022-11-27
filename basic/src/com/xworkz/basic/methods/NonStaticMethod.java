package com.xworkz.basic.methods;

public class NonStaticMethod {
	public static int getMinimum(int a, int b) {
		if (a < b) {
			return a;
		} else {                   // calling a java method
			return b;
		}
	}

	public static void main(String[] args) {
		int minValue1 = getMinimum(5, 42);
		System.out.println("out out 5 and 42:" + minValue1 + "is greater");
		int minValue2 = getMinimum(30, 20);
		System.out.println("out out 30 and 20:" + minValue2 + "is greater");
	}
}
  