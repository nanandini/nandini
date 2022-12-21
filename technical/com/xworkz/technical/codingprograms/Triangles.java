package com.xworkz.technical.codingprograms;

public class Triangles {

	public static void main(String[] args) {

		System.out.println("printing right angle triangle using loops");
		int n = 4; // main loop
		for (int i = 1; i <= n; i++) {
			// printing space

			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");

			}

			for (int k = 1; k <= i; k++) {
				System.out.print("$");

			}
			System.out.println("");

		}

		System.out.println(System.lineSeparator());
		System.out.println("printing as triangle using loops");

		for (int i = 1; i <= n; i++) {
			// printing space

			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");

			}

			for (int k = 1; k <= i; k++) {
				System.out.print("* ");

			}
			System.out.println("");

		}

		System.out.println(System.lineSeparator());
		System.out.println("printing no in triangle using loops");

		for (int i = 1; i <= n; i++) {
			// printing space

			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");

			}

			for (int k = 1; k <= i; k++) {
				System.out.print(i);

			}
			System.out.println("");

		}

		System.out.println(System.lineSeparator());
		System.out.println("printing no in triangle using loops");

		for (int i = 1; i <= n; i++) {
			// printing space

			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");

			}

			for (int k = 1; k <= i; k++) {
				System.out.print(k);

			}
			System.out.println("");

		}

		System.out.println(System.lineSeparator());
		System.out.println("printing ");

		for (int i = 1; i <= n; i++) {
			// printing space

			for (int j = n - 1; j >= i; j--) {
				System.out.print(j);

			}

			for (int k = 1; k <= i; k++) {
				System.out.print(k);

			}
			System.out.println("");

		}
		System.out.println(System.lineSeparator());
		System.out.println("printing name in place of no 2");

		for (int i = 1; i <= n; i++) {
			// printing space

			for (int j = n - 1; j >= i; j--) {
				if (j == 2) {
					System.out.print("Nandhu");

				} else {

					System.out.print(j);
				}

			}

			for (int k = 1; k <= i; k++) {
				if (k == 2) {
					System.out.print("Nandhu");

				} else {

					System.out.print(k);
				}
			}
			System.out.println("");

		}

		System.out.println("printing right angle triangle using loops");
		int n1 = 3; // main loop
		for (int i = 2; i <= n1; i++) {
			                     // printing space

			for (int j = n1 - 2; j >= i; j--) {
				System.out.print(" ");

			}

			for (int k = 3; k <= i; k++) {
				System.out.print("$");

			}
			System.out.println("");

		}

	}

}
