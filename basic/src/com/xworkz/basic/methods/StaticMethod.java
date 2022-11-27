package com.xworkz.basic.methods;

public class StaticMethod {
	public static int getMaximum(int a, int b) {
		if (a > b) {
			return a;
		} else {                       //calling a java method
			return b;
		}
	}

	public static void main(String[] args) {
		int maxValue1 = getMaximum(5, 42);
		System.out.println("out out 5 and 42:" + maxValue1 + "is greater");
		int maxValue2 = getMaximum(30, 20);
		System.out.println("out out 30 and 20:" + maxValue2 + "is greater");
	}
}
