package com.xworkz.inheritance.gene;

public class SiliconCity extends MetroCity {
	public void siliconCity() {

		System.out.println("SiliconCity is the Child of MetroCity");
		System.out.println("==Heridity Information==");

		Object object = new Object();
		Place place1 = new Place();
		Capital capital1 = new Capital();
		City city1 = new City();
		MetroCity metroCity1 = new MetroCity();
		SiliconCity scity1 = new SiliconCity();

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

		MetroCity scity2 = new SiliconCity();
		City scity3 = new SiliconCity();
		Capital scity4 = new SiliconCity();
		Place scity5 = new SiliconCity();
		Object scity6 = new SiliconCity();

	}

}
