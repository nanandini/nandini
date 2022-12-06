package com.xworkz.abstractTask1.type;

public abstract class Person {

	private String Name;
	private int age;
	private boolean character;
	private String place;
	private String gender;

	abstract boolean sleep();

	abstract boolean eat();

	public Person(String name, int age, boolean character, String place, String gender) {
		super();
		Name = name;
		this.age = age;
		this.character = character;
		this.place = place;
		this.gender = gender;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCharacter() {
		return character;
	}

	public void setCharacter(boolean character) {
		this.character = character;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}



