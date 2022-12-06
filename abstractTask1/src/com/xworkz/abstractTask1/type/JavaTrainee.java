package com.xworkz.abstractTask1.type;

import com.xworkz.abstractTask1.bridge.XworkzRule;

public abstract class JavaTrainee extends Person implements XworkzRule {

	public JavaTrainee(String name, int age, boolean character, String place, String gender) {
		super(name, age, character, place, gender);
		System.out.println("starting...");
	}

	abstract boolean training();

	abstract boolean excuteProgram();

	@Override
	public boolean sleep() {
		System.out.println("Running sleeping activity...");
		return false;
	}

	@Override
	public boolean eat() {
		System.out.println("Running Eating Activity....");
		return false;
	}

	@Override
	public boolean uploadTask() {
		System.out.println("Running upload activity...");
		return false;
	}

	@Override
	public boolean completeProgram() {
		System.out.println("Running completeProgram task.....");
		return false;
	}

}
