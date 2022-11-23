package com.xworkz.equality.type;

public class WaterBottle {

	private String bottleName;
	private String brand;
	private int size;
	private double price;
	private boolean goodMaterial;
	private String shopName;
	private String locationOfShop;
	private boolean quality;
	private boolean quantity;
	private String location;

	public WaterBottle() {
		System.out.println("Default const of waterBottle");
	}

	public WaterBottle(String bottleName, String brand, int size, double price, boolean goodMaterial, String shopName,
			String locationOfShop, boolean quality, boolean quantity, String location) {
		super();
		this.bottleName = bottleName;
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.goodMaterial = goodMaterial;
		this.shopName = shopName;
		this.locationOfShop = locationOfShop;
		this.quality = quality;
		this.quantity = quantity;
		this.location = location;
	}

	@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in Bottle");

		if (other instanceof WaterBottle) {
			System.out.println("other is waterBottle,can check the properties");
			WaterBottle ref = (WaterBottle) other;

			if (this.bottleName.equals(ref.bottleName) && this.brand.equals(ref.brand)
					&& this.location.equals(ref.location) && this.locationOfShop.equals(ref.locationOfShop)
					&& this.shopName.equals(ref.shopName));
				
			{
				System.out.println("BottleName is same");
				System.out.println("Brand is same");
				System.out.println("location is same");
				System.out.println("locatonofShop is same");
				System.out.println("shopName is same");
				return true;
			}
		}
		else {
			System.out.println("other is not bottle,cannot check the properties");
		}
		return false;
	}

	@Override
	public String toString() {
		return "Paint[bottleName=" + bottleName + ",brand=" + brand + ", location=" + location + ",price=" + price
				+ ",goodMaterial=" + goodMaterial + ",shopName=" + shopName + ",locationOfShop=" + locationOfShop
				+ ",quality=" + quality + ",size=" + size + "" + ",quantity=" + quantity + "]";
	}

	public String getBottleName() {
		return bottleName;
	}

	public void setBottleName(String bottleName) {
		this.bottleName = bottleName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
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

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getLocationOfShop() {
		return locationOfShop;
	}

	public void setLocationOfShop(String locationOfShop) {
		this.locationOfShop = locationOfShop;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public boolean isQuantity() {
		return quantity;
	}

	public void setQuantity(boolean quantity) {
		this.quantity = quantity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
