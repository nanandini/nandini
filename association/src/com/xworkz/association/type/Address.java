package com.xworkz.association.type;

public class Address {
	public Location location;

	public Address(Location location) {
		this.location = location;
	}

	public void showOff() {
		System.out.println(System.lineSeparator());

		System.out.println("printing location deatails ");
		if (this.location != null) {
			location.showOff();

		}
	}
}
