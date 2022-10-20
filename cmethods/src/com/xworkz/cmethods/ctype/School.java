package com.xworkz.cmethods.ctype;

public class School {
	public String name;
	public String location;
	public double fees;
	public boolean famous;
	public String fav;

	public String[] students;
	public String[] activities;
	public char[] studentSigns;
	public boolean[] overAll;
	public String[] sports;

	public School(String name, String location, double fees, boolean famous, String fav, String[] students,
			String[] activities, char[] studentSigns, boolean[] overAll, String[] sports) {

		this.name = name;
		this.location = location;
		this.fees = fees;
		this.famous = famous;
		this.fav = fav;
		this.students = students;
		this.activities = activities;
		this.studentSigns = studentSigns;
		this.overAll = overAll;
		this.sports = sports;

		System.out.println("excuting school information");

	}

	public void display() {
		System.out.println("name:" + this.name);
		System.out.println("location:" + this.location);
		System.out.println("fees:" + this.fees);
		System.out.println("famous:" + this.famous);
		System.out.println("fav:" + this.fav);

		for (int i = 0; i < this.students.length; i++) {
			String string = this.students[i];
			System.out.println(string);
		}

		for (int i = 0; i < this.activities.length; i++) {
			String string = this.activities[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.studentSigns.length; i++) {
			char string = this.studentSigns[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.overAll.length; i++) {
			boolean string = this.overAll[i];
			System.out.println(string);
		}
		for (int i = 0; i < this.sports.length; i++) {
			String string = this.sports[i];
			System.out.println(string);
		}
	}

}
