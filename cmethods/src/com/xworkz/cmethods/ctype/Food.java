package com.xworkz.cmethods.ctype;

public class Food {
	public String name;
	public String fav;
	public String type;
	public boolean good;
	public int price;

	public String[] colours;
	public String[] foodNames;
	public String[] shopNames;
	public String[] ownerNames;
	public long[] ownerPhoneNumbers;
	public boolean[] serveFacilities;

	public Food(String name, String fav, String type, boolean good, int price, String[] colours, String[] foodNames,
			String[] shopNames, String[] ownerNames, long[] ownerPhoneNumbers, boolean[] serveFacilities) {
		this.name = name;
		this.fav = fav;
		this.type = type;
		this.good = good;
		this.price = price;
		this.colours = colours;
		this.foodNames = foodNames;
		this.shopNames = shopNames;
		this.ownerNames = ownerNames;
		this.ownerPhoneNumbers = ownerPhoneNumbers;
		this.serveFacilities = serveFacilities;

	}

	public Food() {

	}

	public void display()

	{
		System.out.println("name:" + this.name);
		System.out.println("fav:" + this.fav);
		System.out.println("type:" + this.type);
		System.out.println("good:" + this.good);
		System.out.println("price:" + this.price);

		for (int i = 0; i < colours.length; i++) {
			System.out.println(this.colours[i]);
		}
		System.out.println(System.lineSeparator() + "foodNames");
		for (int i = 0; i < foodNames.length; i++) {
			System.out.println(this.foodNames[i]);
		}
		for (int i = 0; i < serveFacilities.length; i++) {
			System.out.println(this.serveFacilities[i]);
		}
		for (int i = 0; i < shopNames.length; i++) {
			System.out.println(this.shopNames[i]);
		}
		for (int i = 0; i < ownerNames.length; i++) {
			System.out.println(this.ownerNames[i]);
		}
		for (int i = 0; i < ownerPhoneNumbers.length; i++) {
			System.out.println(this.ownerPhoneNumbers[i]);

		}
	}

}
