package com.xworkz.overriding.method;

import com.xworkz.overriding.custom.ShoppingMall;

public class Orion extends ShoppingMall {

	public int noOfSecurities;

	public Orion(String mallName, String mallLoaction) {
		super(mallName, mallLoaction);

	}

	public Orion(String mallName, String mallLoaction, int noOfSecurities) {
		super(mallName, mallLoaction);
		this.noOfSecurities = noOfSecurities;
	}

	public void display() {
		super.display();
		System.out.println(this.noOfSecurities);
	}
}
