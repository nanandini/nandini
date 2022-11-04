package com.xworkz.encapsulation.type;

public class Flowers {
	public String flowerShopName;
	private String favNameOfFlower;
	private double flowersCost;
	int noOfFlowerBuy = 6;
	int noOfFlowerMarkets = 15;
	boolean smell = true;
	String flowerMarketRoad = "K R Market";
	int typesOfFlowersNeed = 10;
	String location = "R T NAGAR";
	String ShopOwnerName = "munjula";
	long flowerShopOwnerNum = 9900276244L;

	public String getFlowerShopName() {
		return flowerShopName;
	}

	public void setflowerShopName(String flowerShopName) {
		this.flowerShopName = flowerShopName;
	}

	public String getfavNameOfFlower() {
		return favNameOfFlower;
	}

	public void setfavNameOfFlower(String favNameOfFlower) {
		this.favNameOfFlower = favNameOfFlower;
	}

	public double getflowersCost() {
		return flowersCost;
	}

	public void setflowersCost(double flowersCost) {
		this.flowersCost = flowersCost;
	}

}
