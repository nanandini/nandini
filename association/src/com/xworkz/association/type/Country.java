package com.xworkz.association.type;

public class Country {
	public String countryName;
	public int noOfStates;
	public double population;
	public String nationalBirdName;

	public Country(String countryName, int noOfStates, double population, String nationalBirdName) {
		super();
		this.countryName = countryName;
		this.noOfStates = noOfStates;
		this.population = population;
		this.nationalBirdName = nationalBirdName;
	}

	public void showOff() {
		System.out.println("printing COUNTRY deatails ");
		System.out.println(this.countryName);
		System.out.println(this.noOfStates);
		System.out.println(this.population);
		System.out.println(this.nationalBirdName);

	}
}
