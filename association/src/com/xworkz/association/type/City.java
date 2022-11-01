package com.xworkz.association.type;

public class City {
	public String cityName;
	public int noCityAreas;
	public boolean cityConditions;
	public String oldName;

	public City(String cityName, int noCityAreas, boolean cityConditions, String oldName) {
		super();
		this.cityName = cityName;
		this.noCityAreas = noCityAreas;
		this.cityConditions = cityConditions;
		this.oldName = oldName;
	}

	public void showOff() {
		System.out.println("excuting City details");

		System.out.println(this.cityName);
		System.out.println(this.noCityAreas);
		System.out.println(this.cityConditions);
		System.out.println(this.oldName);
	}

}
