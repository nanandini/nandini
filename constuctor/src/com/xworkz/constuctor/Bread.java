package com.xworkz.constuctor;

public class Bread {
	public char type;
	public String shape;
	public int price;
	public double quantity;
	public String companyName;

	public Bread(char type) {
		this.type = type;
		System.out.println("Bread Type");
	}

	public Bread(char type, String shape) {
		this.type = type;
		this.shape = shape;
		System.out.println("type and shape of bread");
	}

	public Bread(char type, double quantity) {
		this.type = type;
		this.quantity = quantity;
		System.out.println("Bread type and quantity");

	}

	public Bread(char type, String shape, int price) {
		this.type = type;
		this.shape = shape;
		this.price = price;
		System.out.println("information about Bread their type,shape,and price");

	}

	public Bread(double quantity, String companyName, int price) {
		this.quantity = quantity;
		this.companyName = companyName;
		this.price = price;
		System.out.println("Bread information");
	}

	public Bread(char type, double quantity)  {
		th
	}

}
