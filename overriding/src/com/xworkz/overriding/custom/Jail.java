package com.xworkz.overriding.custom;

import com.xworkz.overriding.method.Pg;

public class Jail extends Pg {

	public void pgName() {
		System.out.println("declaring");
		super.pgName();
	}
}
