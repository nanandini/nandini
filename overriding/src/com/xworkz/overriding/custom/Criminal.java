package com.xworkz.overriding.custom;

public class Criminal {
	public int age;
	public String area;

	public Criminal(int age, String area) {
		super();
		this.age = age;
		this.area = area;
	}

	public void display() {
		System.out.println(this.age);
		System.out.println(this.area);

	}
}