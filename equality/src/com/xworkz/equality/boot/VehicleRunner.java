package com.xworkz.equality.boot;

import com.xworkz.equality.type.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		Vehicle bike = new Vehicle();
		bike.setBrand("Honda");
		bike.setCost(90000);
		bike.setGoodMilage(true);
		bike.setLocationOfShop("Devanahalli");
		bike.setNoOfShops(8);
		bike.setOwnerName("Uday Gowda");
		bike.setQuantity(true);
		bike.setShopName("sangeetha");
		bike.setStaffName("vinay");
		bike.setVehicleName("DUIET");

		System.out.println(bike);

		Vehicle bike2 = new Vehicle("RAYZ", "Suzuki", 7, 70000, true, "myself", "banglore", true, "nandhu", "spoorthi");
		System.out.println(bike2);

		boolean real = bike.equals(bike2);
		System.out.println(real);

	}

}
