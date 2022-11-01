package com.xworkz.association.type;

public class Email {
	public int id;
	public String passward;
	public long mobileNo;
	public Company company;

	public Email(int id, String passward, long mobileNo, Company company) {
		super();
		this.id = id;
		this.passward = passward;
		this.mobileNo = mobileNo;
		this.company = company;
	}

	public void showOff() {
		System.out.println("accessing Email details");

		System.out.println(this.id);
		System.out.println(this.passward);
		System.out.println(this.mobileNo);

		if (company != null) {

			this.company.showOff();

		}
	}
}
