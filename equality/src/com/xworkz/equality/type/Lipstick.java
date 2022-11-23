package com.xworkz.equality.type;



public class Lipstick {
	private String nameOfLipstick;
	private String brand;
	private int types;
	private double price;
	private boolean good;
	private String colour;
	private String prons;
	private boolean quality;
	private String favLipstickColor;
	private String cons;

	public Lipstick() {
		System.out.println("Default const of lipstick");
	}

	public Lipstick(String nameOfLipstick, String brand, int types, double price, boolean good, String colour,
			String prons, boolean quality, String favLipstickColor, String cons) {
		super();
		this.nameOfLipstick = nameOfLipstick;
		this.brand = brand;
		this.types = types;
		this.price = price;
		this.good = good;
		this.colour = colour;
		this.prons = prons;
		this.quality = quality;
		this.favLipstickColor = favLipstickColor;
		this.cons = cons;
	}

	@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in lipstick");

		if (other instanceof Lipstick) {
			System.out.println("other is lipstick,can check the properties");
			Lipstick ref = (Lipstick) other;

			if (this.brand.equals(ref.brand) && this.colour.equals(ref.colour)
					&& this.favLipstickColor.equals(ref.favLipstickColor)) {
				System.out.println("Brand is same");
				System.out.println("color is same");
				return true;
			}
		} else {
			System.out.println("other is not Lipstick,cannot check the properties");
		}
		return false;
	}

	@Override
	public String toString() {
		return "Paint[nameOfLipstick=" + nameOfLipstick + ",brand=" + brand + ", types=" + types + ",price=" + price
				+ ",good=" + good + ",prons=" + prons + ",quality=" + quality + ",favLipstickColor=" + favLipstickColor
				+ "" + ",cons=" + cons + "]";
	}

	public String getNameOfLipstick() {
		return nameOfLipstick;
	}

	public void setNameOfLipstick(String nameOfLipstick) {
		this.nameOfLipstick = nameOfLipstick;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getTypes() {
		return types;
	}

	public void setTypes(int types) {
		this.types = types;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isGood() {
		return good;
	}

	public void setGood(boolean good) {
		this.good = good;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getProns() {
		return prons;
	}

	public void setProns(String prons) {
		this.prons = prons;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public String getFavLipstickColor() {
		return favLipstickColor;
	}

	public void setFavLipstickColor(String favLipstickColor) {
		this.favLipstickColor = favLipstickColor;
	}

	public String getCons() {
		return cons;
	}

	public void setCons(String cons) {
		this.cons = cons;
	}

}
