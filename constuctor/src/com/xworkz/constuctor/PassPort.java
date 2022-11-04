package com.xworkz.constuctor;

public class PassPort {
	public int no;
	public String name;
	public int expiryDate;
	public String country;
	public String issueDate;

	public PassPort(int no) {
		this.no = no;
		System.out.println("verifying passport no");

	}

	public PassPort(int no, String name) {
		this.no = no;
		this.name = name;
		System.out.println("name and no of the passport");
	}

	public PassPort(int no, int expiryDate) {
		this.no = no;
		this.expiryDate = expiryDate;
		System.out.println("checking the expiryDate of passport");
	}

	public PassPort(int no, String name, String country) {
		this.no = no;
		this.name = name;
		this.country = country;
		System.out.println("information about passport");
	}

	public PassPort(String name, int expiryDate, String country, String issueDate) {
		this.name = name;
		this.expiryDate = expiryDate;
		this.country = country;
		this.issueDate = issueDate;
		System.out.println("information about passport");
	}

	public PassPort(int no, String name, String issueDate, String country) {
		this.no = no;
		this.name = name;
		this.issueDate = issueDate;
		this.country = country;
		System.out.println("information about passport");

	}

	public PassPort(int no, String name, String issueDate, String country, int expiryDate) {
		this.no = no;
		this.name = name;
		this.issueDate = issueDate;
		this.country = country;
		this.expiryDate = expiryDate;
		System.out.println("checking about passport information of there name,no,issue date...etc");

	}
}
