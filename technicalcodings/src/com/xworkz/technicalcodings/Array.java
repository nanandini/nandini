//Given an array of integers,return a new array with each value doubled.

package com.xworkz.technicalcodings;

public class Array {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3 };

		for (int i = 0; i < array.length; i++) {

			array[i] = 2 * array[i];
			System.out.println(array[i]);
		}
	}
}
