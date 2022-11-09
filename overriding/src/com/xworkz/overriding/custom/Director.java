package com.xworkz.overriding.custom;

public class Director {

	public String movieName;
	public String directorName;

	public Director(String movieName, String directorName) {
		super();
		this.movieName = movieName;
		this.directorName = directorName;
	}

	public void display() {
		System.out.println(this.movieName);
		System.out.println(this.directorName);
	}

}
