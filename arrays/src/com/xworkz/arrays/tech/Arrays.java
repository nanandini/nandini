//passing array to a Method 

package com.xworkz.arrays.tech;

public class Arrays {

	static void min(int array[]) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
				System.out.println(min);
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 25, 4, 6, 8 }; // declaring and initialization of array
		min(a);            // passing array to method

	}

}
