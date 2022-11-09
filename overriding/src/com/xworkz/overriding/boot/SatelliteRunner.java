package com.xworkz.overriding.boot;

import com.xworkz.overriding.method.Moon;

public class SatelliteRunner {

	public static void main(String[] args) {

		Moon moon = new Moon("NEPTUNE", 9, true);
		moon.display();

	}

}
