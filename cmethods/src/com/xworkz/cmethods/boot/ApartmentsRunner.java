package com.xworkz.cmethods.boot;

import com.xworkz.cmethods.ctype.*;

public class ApartmentsRunner {

	public static void main(String[] args) {

		String[] noOfHomes = { "home1", "home2", "home3" };
		String[] noOfMainDoors = { "door1", "door2", "door3" };
		String[] womens = { "radha", "rukmini", "vasuda" };
		boolean[] good = { true, false, true };
		int[] noOfChilderns = { 2, 4, 2 };

		Apartments apartments = new Apartments("ECO-NANO", "R T NAGAR", 2000000, true, "BBMP", noOfHomes, noOfMainDoors,
				womens, good, noOfChilderns);
		apartments.display();
	}

}
