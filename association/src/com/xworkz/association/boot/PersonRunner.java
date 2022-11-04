package com.xworkz.association.boot;

import com.xworkz.association.type.Address;
import com.xworkz.association.type.City;
import com.xworkz.association.type.Company;
import com.xworkz.association.type.Country;
import com.xworkz.association.type.Email;
import com.xworkz.association.type.Job;
import com.xworkz.association.type.Location;
import com.xworkz.association.type.Person;
import com.xworkz.association.type.State;

public class PersonRunner {

	public static void main(String[] args) {
		State state = new State("KARANATAKA", 31, 61.130704, "BENGALURU");
		City city = new City("BENGALURU", 76, true, "BENDAKALURU");
		Country country = new Country("India", 29, 37285236, "peacock");

		Location location = new Location(14, "RT NAGAR", city, state, country);

		Address address = new Address(location);
		Company company = new Company("TCS", "TATA SONS Ltd", address);

		Job job = new Job("SOFTWARE ENGINEER", 35000, false, company);

		Email email1 = new Email(21, "nandhu30", 9448958488L, company);

		Email email2 = new Email(24, "knandhu26", 9900276144L, company);

		Email[] email = { email1, email2 };

		Person person = new Person("Nandini");
		person.setPerson(email, job);

		person.showOff();

	}

}
