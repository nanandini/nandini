package com.xworkz.overriding.custom;

public class Satellite {

	public String satelliteName;
	public int noOfSatellite;

	public Satellite(String satelliteName, int noOfSatellite) {
		super();
		this.satelliteName = satelliteName;
		this.noOfSatellite = noOfSatellite;
	}

	public void display() {
		System.out.println(this.noOfSatellite);
		System.out.println(this.satelliteName);
	}

}
