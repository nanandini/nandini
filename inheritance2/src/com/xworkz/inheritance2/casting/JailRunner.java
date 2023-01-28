package com.xworkz.inheritance2.casting;

import com.xworkz.inheritance2.casting.Jail;
import com.xworkz.inheritance2.type.CentralJail;
import com.xworkz.inheritance2.type.DistrictJail;
import com.xworkz.inheritance2.type.TalukJail;

public class JailRunner {

	public static void main(String[] args) {

		Jail jail = new Jail();

		System.out.println(jail.location);
		System.out.println(jail.name);

		Jail jail1 = new DistrictJail();

		DistrictJail district = (DistrictJail) jail1;

		System.out.println(district.noOfThiefs);
		System.out.println(district.thiefName);

		Jail jail2 = new CentralJail();

		CentralJail central = (CentralJail) jail2;

		System.out.println(central.placeName);
		System.out.println(central.inchargerNo);

		TalukJail jail3 = new TalukJail();

		TalukJail taluk = (TalukJail) jail3;

		System.out.println(taluk.talukName);
		System.out.println(taluk.security);

	}

}
