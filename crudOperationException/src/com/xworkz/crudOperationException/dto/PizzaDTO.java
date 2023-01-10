package com.xworkz.crudOperationException.dto;

import com.xworkz.crudOperationException.constant.PizzaSize;

public class PizzaDTO extends AbstractAuditDTO {

	private String name;
	private String CompanyName;
	private PizzaSize size;
	private boolean cheese;
	private String type;
	private double prize;

	public PizzaDTO() {

	}

	public PizzaDTO(String name, String companyName, PizzaSize size, boolean cheese, String type, double prize) {
		super();
		this.name = name;
		CompanyName = companyName;
		this.size = size;
		this.cheese = cheese;
		this.type = type;
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "PizzaDTO [name=" + name + ", CompanyName=" + CompanyName + ", size=" + size + ", cheese=" + cheese
				+ ", type=" + type + ", prize=" + prize + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public PizzaSize getSize() {
		return size;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}

	public boolean isCheese() {
		return cheese;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

}