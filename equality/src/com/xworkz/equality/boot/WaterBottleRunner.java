package com.xworkz.equality.boot;

import com.xworkz.equality.type.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {
		WaterBottle bottle = new WaterBottle();
		bottle.setBottleName("plastic");
		bottle.setBrand("Tupperware");
		bottle.setGoodMaterial(true);
		bottle.setLocation("chikkaballapur");
		bottle.setLocationOfShop("neargbd");
		bottle.setPrice(90);
		bottle.setQuality(true);
		bottle.setQuantity(true);
		bottle.setShopName("Krishnan shop");
		bottle.setSize(6);

		System.out.println(bottle);

		WaterBottle bottle2 = new WaterBottle("plastic", "tupperware", 6, 90, true, "chikkaballpur", "neargbd", false,
				false, "Krishnan shop");

		System.out.println(bottle2);
		boolean same = bottle.equals(bottle2);
		System.out.println(same);

	}

}
