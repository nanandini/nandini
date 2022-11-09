package com.xworkz.overriding.method;

import com.xworkz.overriding.custom.Satellite;

public class Moon extends Satellite {

	public boolean powerFull;

	public Moon(String satelliteName, int noOfSatellite) {
		super(satelliteName, noOfSatellite);

	}

	public Moon(String satelliteName, int noOfSatellite, boolean powerFull) {
		super(satelliteName, noOfSatellite);
		this.powerFull = powerFull;
	}

	public void display() {
		super.display();
		System.out.println(this.powerFull);
	}

}
