package com.xworkz.association.type;

public class Location {
	public int no;
	public String street;
	public City city;
	public State state;
	public Country country;

	public Location(int no, String street, City city, State state, Country country) {
		super();
		this.no = no;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public void showOff() {
		System.out.println("Excuting Details");

		System.out.println(this.no);
		System.out.println(this.street);
		if (this.city != null) {
			city.showOff();

		}

		if (this.state != null) {
			this.state.showOff();

		}
	}
}
