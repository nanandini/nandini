package com.xworkz.overriding.method;

import com.xworkz.overriding.custom.Criminal;

public class Ravi extends Criminal {

	public int noOfCases;

	public Ravi(int age, String area) {
		super(age, area);
	}

	public Ravi(int age, String area, int noOfCases) {
		super(age, area);
		this.noOfCases = noOfCases;
	}

	public void display() {
		super.display();
		System.out.println(this.noOfCases);
	}

}
