package com.xworkz.collectionWeapon.Dto;

import java.sql.Types;
import java.time.LocalDate;

import com.xworkz.collectionWeapon.type.types;

public class WeaponDto implements Comparable<WeaponDto> {

	private String name;
	private String madeBy;
	private LocalDate madeOn;
	private double price;
	private Types type;

	public WeaponDto(String string, String string2, LocalDate localDate, double d, types firams) {
		// TODO Auto-generated constructor stub
	}

	public WeaponDto(String name, String madeBy, LocalDate madeOn, double price, Types type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 22;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof WeaponDto) {
				WeaponDto dto = (WeaponDto) obj;
				if (this.name.equals(dto.getName())) {
					System.out.println("cheaking sucessfully");
					return true;

				}
			}
		}
		return false;
	}

	public int compareTo1(WeaponDto o) {
		return this.name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}

	public String getName() {
		return name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public LocalDate getMadeOn() {
		return madeOn;
	}

	public double getPrice() {
		return price;
	}

	public Types getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setType(Types type) {
		this.type = type;
	}

	@Override
	public int compareTo(WeaponDto o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
