package com.xworkz.crud.dto;

import java.time.LocalDateTime;

public class BakeryDTO extends AbstractAuditDTO {
	private String name;
	private String ownerName;
	private String location;
	private long phNo;

	public BakeryDTO() {
		System.out.println("running bakery");
	}

	public BakeryDTO(String name, String ownerName, String location, long phNo) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.location = location;
		this.phNo = phNo;
	}

	@Override
	public String toString() {
		return "BakeryDTO [name=" + name + ", ownerName=" + ownerName + ", location=" + location + ", phNo=" + phNo
				+ ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

}
