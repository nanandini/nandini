package com.xworkz.validation.dto;

import com.xworkz.validation.constant.Color;
import com.xworkz.validation.constant.Type;

public class HelmetDTO extends AbstractAudioDTO {
	private String brand;
	private double price;
	private Color colour;
	private Type type;

	public HelmetDTO(String brand, double price, Color color,Type type) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.type = type;

	}

	@Override
	public String toString() {
		return "HelmetDTO [brand=" + brand + ", price=" + price + ", colour=" + colour + ", type=" + type
				+ ", toString()=" + super.toString() + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Color getColour() {
		return colour;
	}

	public void setColour(Color colour) {
		this.colour = colour;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
