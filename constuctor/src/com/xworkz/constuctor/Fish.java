package com.xworkz.constuctor;

public class Fish {
	public String name;
	public String type;
	public int price;
	public double weight;
	public int length;

	public Fish(String name) {
		this.name = name;
		System.out.println("entered name of fish");

	}

	public Fish(String name, int price) {
		this.name = name;
		this.price = price;
		System.out.println("checking name and price of fish");

	}

	public Fish(String name, int price, int length) {
		this.name = name;
		this.price = price;
		this.length = length;
		System.out.println("entering name,price and weight");
	}

	public Fish(String name, String type, int price, double weight) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.weight = weight;
		System.out.println("inforamtion about name,type,price.and weight");
	}

	public Fish(String type, int price, double weight) {
		this.type = type;
		this.price = price;
		this.weight = weight;
		System.out.println("checking information of fish ");

	}

	public Fish(String name, int price, String type) {
		this.name = name;
		this.price = price;
		this.type = type;
		System.out.println("information about name,price and typetz");
	}

	public Fish(String name, String type, int price, double weight, int length) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.weight = weight;
		this.length = length;
		System.out.println("information");

	}
}
