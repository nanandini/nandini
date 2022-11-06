package com.xworkz.inheritance.gene;

public class MetroCity extends City {
	public void metroCityMethod() {

		System.out.println("MetroCity is Child Of City");
		System.out.println("==Heridity Information==");

		Object object = new Object();
		Place place1 = new Place();
		Capital capital1 = new Capital();
		City city1 = new City();
		MetroCity metroCity1 = new MetroCity();

		Object place2 = new Place();
		Place capital2 = new Capital();
		Object capital3 = new Capital();

		Capital city2 = new City();
		Place city3 = new City();
		Object city4 = new City();

		City metroCity2 = new MetroCity();
		Capital metroCity3 = new MetroCity();
		Place metroCity4 = new MetroCity();
		Object metroCity5 = new MetroCity();

	}

}
