package com.xworkz.cmethods.boot;

import com.xworkz.cmethods.ctype.*;

public class TempleRunner {

	public static void main(String[] args) {
		String[] godNames = { "HANUMAN", "KRISHNA", "SAI BABA" };
		String[] typesOfTempleNames = { "ISCON", "SHIRADI", "SANJEEVARAYA" };
		int[] noOfDays = { 2, 4, 8, 9, 10 };
		boolean[] overAll = { true, false, true };
		String[] namesOfPrayers = { "VEDAGOSHA", "GEETHAPATA", "BAGAVATH GEETHA" };

		Temple temple = new Temple("ISCON TEMPLE", "BANGLORE", 8, true, "MARIGOLD", godNames, typesOfTempleNames,
				noOfDays, overAll, namesOfPrayers);
		temple.display();
	}

}
