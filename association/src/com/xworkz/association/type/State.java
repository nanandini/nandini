package com.xworkz.association.type;

public class State {
	public String stateName;
	public int noOfDistricts;
	public double population;
	public String capital;

	public State(String stateName, int noOfDistricts, double population, String capital) {
		super();
		this.stateName = stateName;
		this.noOfDistricts = noOfDistricts;
		this.population = population;
		this.capital = capital;
	}

	public void showOff() {
		System.out.println("excuting STATE information");

		System.out.println(this.stateName);
		System.out.println(this.noOfDistricts);
		System.out.println(this.population);
		System.out.println(this.capital);
	}
}
