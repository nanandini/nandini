package com.xworkz.cmethods.boot;

import com.xworkz.cmethods.ctype.*;

public class FoodRunner {

	public static void main(String[] args) {
		String[] colours = { "green", "yellow" };
		String[] foodNames = { "ponagal", "fideRice" };
		String[] shopNames = { "krishnaShop", "vinayaka" };
		String[] ownerNames = { "MYSELF", "NANDHINI" };
		long[] ownerPhoneNumbers = { 9900276144L, 9448958488L };
		boolean[] serveFacilities = { true, false };

		Food food = new Food("vegiterian", "vegPallav", "vegTypes", true, 35, colours, foodNames, shopNames, ownerNames,
				ownerPhoneNumbers, serveFacilities);
		food.display();
	}

}
