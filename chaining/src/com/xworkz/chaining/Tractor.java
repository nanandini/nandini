package com.xworkz.chaining;

public class Tractor {
	public String name;
	public String brand;
	public int price;
	public String colour;
	public int hp;
	public String model;

	public Tractor(String name) {
		this.name = name;
		System.out.println(" constructor excuting the tractor information at shop");
	}

	public Tractor(String name, String brand) {
		this(name);
		this.brand = brand;
	}

	public Tractor(String name, String brand, int price) {
		this(name, brand);
		this.price = price;

	}

	public Tractor(String name, String brand, int price, String colour) {
		this(name, brand, price);
		this.colour = colour;

	}

	public Tractor(String name, String brand, int price, String colour, int hp) {
		this(name, brand, price, colour);
		this.hp = hp;

	}

	public Tractor(String name, String brand, int price, String colour, int hp, String model) {
		this(name, brand, price, colour, hp);
		this.model = model;

	}
}
