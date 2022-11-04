package com.vehicle.bus;

public class DeveloperRunner {

	public static void main(String[] args) {

		Developer skills = new Developer();

		skills.name = "N R Narayana Murthy";
		System.out.println("name: " + skills.name);

		skills.education = "BE";
		System.out.println("education: " + skills.education);

		skills.experience = "more than 30 years";
		System.out.println("experience: " + skills.experience);

		skills.salary = 2000000000;
		System.out.println("salary: " + skills.salary);

		skills.company = "Infosys";
		System.out.println("company: " + skills.company);

	}

}
