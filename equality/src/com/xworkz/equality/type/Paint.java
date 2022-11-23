package com.xworkz.equality.type;

public class Paint {

	private String companyName;
	private String brand;
	private int noOfShops;
	private double price;
	private boolean goodMaterial;
	private String ownerName;
	private String locationOfShop;
	private boolean quality;
	private char signOfShop;
	private String type;

	public Paint() {
		System.out.println("Default const of paint");
	}

	public Paint(String companyName, String brand, int noOfShops, double price, boolean goodMaterial, String ownerName,
			String locationOfShop, boolean quality, char signOfShop, String type) {
		super();
		this.companyName = companyName;
		this.brand = brand;
		this.noOfShops = noOfShops;
		this.price = price;
		this.goodMaterial = goodMaterial;
		this.ownerName = ownerName;
		this.locationOfShop = locationOfShop;
		this.quality = quality;
		this.signOfShop = signOfShop;
		this.type = type;
	}

	@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in paint");

		if (other instanceof Paint) {
			System.out.println("other is paint,can check the properties");
			Paint ref = (Paint) other;

			if (this.brand.equals(ref.brand)) {
				System.out.println("Brand is same");
				return true;
			}
		} else {
			System.out.println("other is not paint,cannot check the properties");
		}
		return false;
	}

	@Override
	public String toString() {
		return "Paint[companyName=" + companyName + ",brand=" + brand + ", noOfShops=" + noOfShops + ",price=" + price
				+ ",goodMaterial=" + goodMaterial + ",ownerName=" + ownerName + ",locationOfShop=" + locationOfShop
				+ ",quality=" + quality + ",signOfShop=" + signOfShop + "" + ",type=" + type + "]";
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNoOfShops() {
		return noOfShops;
	}

	public void setNoOfShops(int noOfShops) {
		this.noOfShops = noOfShops;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isGoodMaterial() {
		return goodMaterial;
	}

	public void setGoodMaterial(boolean goodMaterial) {
		this.goodMaterial = goodMaterial;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getLocationOfShop() {
		return locationOfShop;
	}

	public void setLocationOfShop(String locationOfShop) {
		this.locationOfShop = locationOfShop;
	}

	public boolean isLocationPlaceGood() {
		return quality;
	}

	public void setLocationPlaceGood(boolean locationPlaceGood) {
		this.quality = locationPlaceGood;
	}

	public char getSignOfShop() {
		return signOfShop;
	}

	public void setSignOfShop(char signOfShop) {
		this.signOfShop = signOfShop;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
