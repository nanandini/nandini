package com.xworkz.association.type;

public class Person {

	public String personName;
	public Email[] emails;
	public Job job;

	public Person(String personName) {
		super();
		this.personName = personName;
	}

	public void setPerson(Email[] emails, Job job) {
		this.emails = emails;
		this.job = job;

	}

	public void showOff() {
		System.out.println("printing Person details");

		System.out.println(this.personName);
		if (this.emails != null) {

			for (int i = 0; i < this.emails.length; i++) {
				Email email = this.emails[i];

				if (email != null) {
					email.showOff();

				}

			}

			if (job != null) {

				job.showOff();

			}

		}

	}

}
