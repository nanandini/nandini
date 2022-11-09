package com.xworkz.overriding.method;

import com.xworkz.overriding.custom.Director;

public class Prasanth extends Director {

	public boolean goodCharacter;

	public Prasanth(String movieName, String directorName) {
		super(movieName, directorName);
	}

	public Prasanth(String movieName, String directorName, boolean goodCharacter) {
		super(movieName, directorName);
		this.goodCharacter = goodCharacter;

	}

	public void display() {
		super.display();
		System.out.println(this.goodCharacter);
	}
}
