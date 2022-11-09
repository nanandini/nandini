package com.xworkz.overriding.custom;

public class ShoppingMall {

	public String mallName;
	public String mallLoaction;

	public ShoppingMall(String mallName, String mallLoaction) {
		super();
		this.mallName = mallName;
		this.mallLoaction = mallLoaction;
	}

	public void display() {
		System.out.println(this.mallName);
		System.out.println(this.mallLoaction);
	}
}
