package com.xworkz.encapsulation.type;

public class FlowersInsidePackage {
	Flowers flower = new Flowers();
	int flower1 = flower.noOfFlowerBuy;
	int flower2 = flower.noOfFlowerMarkets;
	boolean flower3 = flower.smell;
	String flower4 = flower.flowerMarketRoad;
	int flower5 = flower.typesOfFlowersNeed;
	String flower6 = flower.location;
	String flower7 = flower.ShopOwnerName;
	long flower8 = flower.flowerShopOwnerNum;

	public void display() {
		System.out.println(flower.noOfFlowerBuy);
		System.out.println(flower.noOfFlowerMarkets);
		System.out.println(flower.smell);
		System.out.println(flower.flowerMarketRoad);
		System.out.println(flower.typesOfFlowersNeed);
		System.out.println(flower.location);
		System.out.println(flower.ShopOwnerName);
		System.out.println(flower.flowerShopOwnerNum);
	}

}
