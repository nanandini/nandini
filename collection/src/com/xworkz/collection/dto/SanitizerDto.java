package com.xworkz.collection.dto;

public class SanitizerDto {

	private String name;
	private String quality;
	private Double price;
	private String country;

	public SanitizerDto(String name, String quality, Double price, String country) {
		super();
		this.name = name;
		this.quality = quality;
		this.price = price;
		this.country = country;
	}

	@Override
	public String toString() {
		return "SanitizerDto [name=" + name + ", quality=" + quality + ", price=" + price + ", country=" + country
				+ ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}