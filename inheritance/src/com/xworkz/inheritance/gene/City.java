package com.xworkz.inheritance.gene;

public class City extends Capital {
	public void cityMethod() {
		// ...City is a Child of Capital,
		                    // ..Capital is a Child of Place ,
		                                         // ...Place is a Child of Place
		                                                              // ..Place is a Child of Object,
		                                                                                 // ...Object is a Parent of Class
		
		
		System.out.println("City is a Child of Capital ");
		System.out.println("===Heridity Information===");
		Object object = new Object();
		Place place = new Place();
		Capital capital = new Capital();
		City city = new City();

		Object place2 = new Place();
		Place capital2 = new Capital();
		Object capital3 = new Capital();

		Capital city2 = new City();
		Place city3 = new City();
		Object city4 = new City();

	}
}
