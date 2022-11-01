package com.xworkz.association.type;

public class Job {
	public String role;
	public double salary;
	public boolean bond;
	public Company company;

	public Job(String role, double salary, boolean bond, Company company) {
		super();
		this.role = role;
		this.salary = salary;
		this.bond = bond;
		this.company = company;
	}

	public void showOff() {
		System.out.println("Printing Job informations");

		System.out.println(this.role);
		System.out.println(this.salary);
		System.out.println(this.bond);
		if (company != null) {

			this.company.showOff();

		}
	}
}
