package com.xworkz.inheritance.gene;

public class Capital extends Place {

	public void capitalMethod() {

		System.out.println("Capital is the child of Place");
		// place is a child of object,
		                    // object is a parent class
		System.out.println("===Heridity Information===");
		Object object = new Object();
		Place place = new Place();
		Capital capital = new Capital();

		Object place2 = new Place();
		Place capital2 = new Capital();
		Object capital3 = new Capital();

	}

}
