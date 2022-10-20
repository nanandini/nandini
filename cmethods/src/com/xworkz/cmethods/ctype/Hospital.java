package com.xworkz.cmethods.ctype;

public class Hospital {
	public String name;
	public String location;
	public int days;
	public boolean good;
	public String type;

	public String[] patientNames;
	public String[] typesOfRooms;
	public double[] amount;
	public boolean[] overAll;
	public String[] oprations;

	public Hospital(String name, String location, int days, boolean good, String type, String[] patientNames,
			String[] typesOfRooms, double[] amount, boolean[] overAll, String[] oprations) {
		this.name = name;
		this.location = location;
		this.days = days;
		this.good = good;
		this.type = type;
		this.patientNames = patientNames;
		this.typesOfRooms = typesOfRooms;
		this.amount = amount;
		this.overAll = overAll;
		this.oprations = oprations;

		System.out.println("excuting the Hospitals details");
	}

	public void display() {
		System.out.println("name:" + this.name);
		System.out.println("location:" + this.location);
		System.out.println("days:" + this.days);
		System.out.println("good:" + this.good);
		System.out.println("type:" + this.type);

		for (int i = 0; i < this.patientNames.length; i++) {
			String string = this.patientNames[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.typesOfRooms.length; i++) {
			String string = this.typesOfRooms[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.amount.length; i++) {
			double string = this.amount[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.overAll.length; i++) {
			boolean string = this.overAll[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.oprations.length; i++) {
			String string = this.oprations[i];
			System.out.println(string);
		}
	}
}
