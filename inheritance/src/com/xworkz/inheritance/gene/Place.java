package com.xworkz.inheritance.gene;

public class Place extends Object {
	public void placeMethod() {
		System.out.println(".....Showing that Parent as Object and Place as Child....");
		System.out.println("====Heridity Information===");
		Object object = new Object();
		Place place = new Place();

	}
	// place ref =new object(); ---//child cant be as parent,so its not possible....
}
