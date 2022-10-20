package com.xworkz.cmethods.ctype;

public class Temple {
	public String name;
	public String location;
	public int days;
	public boolean good;
	public String flowers;

	public String[] godNames;
	public String[] typesOfTempleNames;
	public int[] noOfDays;
	public boolean[] overAll;
	public String[] namesOfPrayers;

	public Temple(String name, String location, int days, boolean good, String flowers, String[] godNames,
			String[] typesOfTempleNames, int[] noOfDays, boolean[] overAll, String[] namesOfPrayers) {
		this.name = name;
		this.location = location;
		this.days = days;
		this.good = good;
		this.flowers = flowers;
		this.godNames = godNames;
		this.typesOfTempleNames = typesOfTempleNames;
		this.noOfDays = noOfDays;
		this.overAll = overAll;
		this.namesOfPrayers = namesOfPrayers;

		System.out.println("excuting the temple deatials");
	}

	public void display() {
		System.out.println("name:" + this.name);
		System.out.println("location:" + this.location);
		System.out.println("days:" + this.days);
		System.out.println("good:" + this.good);
		System.out.println("flowers:" + this.flowers);

		for (int i = 0; i < this.godNames.length; i++) {
			String string = this.godNames[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.typesOfTempleNames.length; i++) {
			String string = this.typesOfTempleNames[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.noOfDays.length; i++) {
			double string = this.noOfDays[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.overAll.length; i++) {
			boolean string = this.overAll[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.namesOfPrayers.length; i++) {
			String string = this.namesOfPrayers[i];
			System.out.println(string);
		}
	}
}
