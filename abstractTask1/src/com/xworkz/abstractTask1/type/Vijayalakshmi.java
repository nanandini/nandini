package com.xworkz.abstractTask1.type;

import com.xworkz.abstractTask1.type1.KarnatakaRto;

public class Vijayalakshmi extends JavaTrainee implements KarnatakaRto {

	public Vijayalakshmi(String name, int age, boolean character, String place, String gender) {
		super(name, age, character, place, gender);
		System.out.println("-------");
	}

	@Override
	public boolean paidTax(double paid) {
		System.out.println("Running abstract method...");
		return false;
	}

	@Override
	public double gst() {
		System.out.println("Running method....");
		return 0;
	}

	@Override
	public double vat() {
		System.out.println("Running method...");
		return 0;
	}

	@Override
	boolean training() {
		System.out.println("running...");
		return false;
	}

	@Override
	boolean excuteProgram() {
		return false;
	}

}
