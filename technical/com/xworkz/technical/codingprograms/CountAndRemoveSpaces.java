//Write a program to count and remove the white spaces from a given String

package com.xworkz.technical.codingprograms;

public class CountAndRemoveSpaces {
	public static void main(String[] args) {

		String str = "Hands on Learning Happens here";
		String s = "";
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (ch == ' ') { // it used to read each chracter
				count += 1; // count=count+1

			} else {
				s += ch; // s=s+ch;
			}
		}
		System.out.println("white spaces:" + count);
		System.out.println("String with removeing out white spaces:" + s);
	
		}

	}

