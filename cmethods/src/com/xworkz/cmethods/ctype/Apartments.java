package com.xworkz.cmethods.ctype;

public class Apartments {
	public String name;
	public String location;
	public double rent;
	public boolean facilities;
	public String cleanBy;

	public String[] noOfHomes;
	public String[] noOfMainDoors;
	public String[] womens;
	public boolean[] good;
	public int[] noOfChilderns;

	public Apartments(String name, String location, double rent, boolean facilities, String cleanBy, String[] noOfHomes,
			String[] noOfMainDoors, String[] womens, boolean[] good, int[] noOfChilderns) {

		this.name = name;
		this.location = location;
		this.rent = rent;
		this.facilities = facilities;
		this.cleanBy = cleanBy;
		this.noOfHomes = noOfHomes;
		this.noOfMainDoors = noOfMainDoors;
		this.womens = womens;
		this.good = good;
		this.noOfChilderns = noOfChilderns;

		System.out.println("excuting Apartments information");

	}

	public void display() {
		System.out.println("name:" + this.name);
		System.out.println("location:" + this.location);
		System.out.println("rent:" + this.rent);
		System.out.println("facilities:" + this.facilities);
		System.out.println("cleanBy:" + this.cleanBy);

		for (int i = 0; i < this.noOfHomes.length; i++) {
			String string = this.noOfHomes[i];
			System.out.println(string);
		}

		for (int i = 0; i < this.noOfMainDoors.length; i++) {
			String string = this.noOfMainDoors[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.womens.length; i++) {
			String string = this.womens[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.good.length; i++) {
			boolean string = this.good[i];
			System.out.println(string);
		}
		for (int i = 0; i < this.noOfChilderns.length; i++) {
			int string = this.noOfChilderns[i];
			System.out.println(string);
		}
	}

}
