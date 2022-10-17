package com.xworkz.chaining;

public class Chain {
	public String type;
	public String material;
	public int price;
	public String shop;
	public int length;
	public double weight;
	public boolean Stolen;
	public boolean Fresh;

	public Chain(String type) {
		this.type = type;
		System.out.println("excuting chain type");
	}

	public Chain(String type, int price) {
		this(type);
		this.price = price;
		System.out.println("excuting chain type and price");

	}

	public Chain(String type, int price, int length) {
		this(type, price);
		this.length = length;
		System.out.println("excuting chain information");
	}

	public Chain(String type, int price, int length, String material) {
		this(type, price, length);
		this.material = material;
		System.out.println("printing chain type,price,length and material");
	}

	public Chain(String type, int price, int length, String material, String shop) {
		this(type, price, length, material);
		this.shop = shop;
		System.out.println("excuting chain information");

	}

	public Chain(String type, int price, int length, String material, String shop, boolean Stolen) {
		this(type, price, length, material, shop);
		this.Stolen = Stolen;
		System.out.println("printing chain type,price,length,material,shop and stolen");
	}

	public Chain(String type, int price, int length, String material, String shop, boolean Stolen, boolean Fresh) {
		this(type, price, length, material, shop, Stolen);
		this.Fresh = Fresh;
		System.out.println("excuting the chain information");
	}

	public Chain(String type, int price, int length, String material, String shop, boolean Stolen, boolean Fresh,
			double weight) {
		this(type, price, length, material, shop, Stolen, Fresh);
		this.weight = weight;
		System.out.println("printinn information about chain its type,weight,material");
	}
}
