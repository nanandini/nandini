package com.xworkz.equality.type;

public class Vehicle {
	private String vehicleName;
	private String brand;
	private int noOfShops;
	private double cost;
	private boolean goodMilage;
	private String ownerName;
	private String locationOfShop;
	private boolean quantity;
	private String staffName;
	private String shopName;

	public Vehicle() {
		System.out.println("Default const of vehicle");
	}

	public Vehicle(String vehicleName, String brand, int noOfShops, double cost, boolean goodMilage, String ownerName,
			String locationOfShop, boolean quantity, String staffName, String shopName) {
		super();
		this.vehicleName = vehicleName;
		this.brand = brand;
		this.noOfShops = noOfShops;
		this.cost = cost;
		this.goodMilage = goodMilage;
		this.ownerName = ownerName;
		this.locationOfShop = locationOfShop;
		this.quantity = quantity;
		this.staffName = staffName;
		this.shopName = shopName;
	}

	@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in vehicle");

		if (other instanceof Vehicle) {
			System.out.println("other is vehicle,can check the properties");
			Vehicle ref = (Vehicle) other;

			if (this.brand.equals(ref.brand) && this.shopName.equals(ref.shopName)) {
				System.out.println("Brand is same");
				System.out.println("shopName is same");
				return true;
			}
		} else {
			System.out.println("other is not Vehicle,cannot check the properties");
		}
		return false;
	}

	@Override
	public String toString() {
		return "Vehicle[vehicleName=" + vehicleName + ",brand=" + brand + ", noOfShops=" + noOfShops + ",cost=" + cost
				+ ",goodMilage=" + goodMilage + ",ownerName=" + ownerName + ",locationOfShop=" + locationOfShop
				+ ",quantity=" + quantity + ",staffName=" + staffName + "" + ",shopName=" + shopName + "]";
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public boolean isGoodMilage() {
		return goodMilage;
	}

	public void setGoodMilage(boolean goodMilage) {
		this.goodMilage = goodMilage;
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

	public boolean isQuantity() {
		return quantity;
	}

	public void setQuantity(boolean quantity) {
		this.quantity = quantity;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
