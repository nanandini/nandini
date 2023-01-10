package com.xworkz.streamTask.DTO;

import java.io.Serializable;

public class DaugtherDTO implements Serializable {

	private String name;
	private long mobileNo;
	private int age;
	private boolean commited;
	private boolean alive;
	private CompanyCEODto ceodto;

	private DaugtherDTO() {
		// TODO Auto-generated constructor stub
	}

	private DaugtherDTO(String name, long mobileNo, int age, boolean commited, boolean alive) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.age = age;
		this.commited = commited;
		this.alive = alive;

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public boolean equals(Object value) {
		if (value != null) {
			if (value instanceof DaugtherDTO) {
				DaugtherDTO daugtherDTO = (DaugtherDTO) value;
				if (daugtherDTO.getName().equals(this.name)) {

					System.out.println("Cheacking Sucessfully ");
					return true;
				}

			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "DaugtherDTO [name=" + name + ", mobileNo=" + mobileNo + ", age=" + age + ", commited=" + commited
				+ ", alive=" + alive + "]";
	}

	public CompanyCEODto getCeodto() {
		return ceodto;
	}

	public void setCeodto(CompanyCEODto ceodto) {
		this.ceodto = ceodto;
	}

	public String getName() {
		return name;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public int getAge() {
		return age;
	}

	public boolean isCommited() {
		return commited;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCommited(boolean commited) {
		this.commited = commited;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

}
