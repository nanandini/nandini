package com.xworkz.association.type;

public class Company {
	public String companyName;
	public String ownerName;
	public Address address;

	public Company(String companyName, String ownerName, Address address) {
		super();
		this.companyName = companyName;
		this.ownerName = ownerName;
		this.address = address;
	}

	public void showOff() {
		System.out.println("Excuting Company Details");

		System.out.println(this.companyName);
		System.out.println(this.ownerName);
		if (this.address != null) {

			this.address.showOff();

		}
	}
}
