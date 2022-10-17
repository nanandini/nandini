package com.xworkz.chaining;

public class TextileShop {
	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public long daughterNumber;
	public int ownerNoOfWifes;
	public int shopNo;
	public long contactNo;

	public TextileShop(String ownerName) {
		this.ownerName = ownerName;
		System.out.println("excuting the TEXTILESHOP details");
	}

	public TextileShop(String ownerName, String ownerWifeName) {
		this(ownerName);
		this.ownerWifeName = ownerWifeName;
		System.out.println("........");
		System.out.println("constructor excuting the TEXTILESHOP ownerwifename");
	}

	public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName) {
		this(ownerName, ownerWifeName);
		this.ownerDaughterName = ownerDaughterName;
		System.out.println("excuting the ownerdaughtername");

	}

	public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName, long daughterNumber) {
		this(ownerName, ownerWifeName, ownerDaughterName);
		this.daughterNumber = daughterNumber;
		System.out.println("excuting the ownerdaughterno");

	}

	public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName, long daughterNumber,
			int ownerNoOfWifes) {
		this(ownerName, ownerWifeName, ownerDaughterName, daughterNumber);
		this.ownerNoOfWifes = ownerNoOfWifes;
		System.out.println("excuting the ownernoofwifes");

	}

	public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName, long daughterNumber,
			int ownerNoOfWifes, int shopNo) {
		this(ownerName, ownerWifeName, ownerDaughterName, daughterNumber, ownerNoOfWifes);
		this.shopNo = shopNo;
		System.out.println("excuting the ownershop no");
	}

	public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName, long daughterNumber,
			int ownerNoOfWifes, int shopNo, long contactNo) {
		this(ownerName, ownerWifeName, ownerDaughterName, daughterNumber, ownerNoOfWifes, shopNo);
		this.contactNo = contactNo;
		System.out.println("excuting the ownercontact no");
	}
}
