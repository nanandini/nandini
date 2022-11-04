package com.xworkz.encapsulation.type;

public class MobileShop {

	public String name;
	public String mobileColor;
	public char phoneSign;
	public int noOfCamera;
	public int noOfApps;
	public boolean mobileGood;
	public boolean behaviour;
	public double mobileCost;
	public boolean works;
	public String favMode;
	public long mobileNo;

	public void setMobileShop(String name, String mobileColor, char phoneSign, int noOfCamera, int noOfApps, boolean mobileGood,
			boolean behaviour, double mobileCost, boolean works, String favMode, long mobileNo) {

		this.name = name;
		this.mobileColor = mobileColor;
		this.phoneSign = phoneSign;
		this.noOfCamera = noOfCamera;
		this.noOfApps = noOfApps;
		this.mobileGood = mobileGood;
		this.behaviour = behaviour;
		this.mobileCost = mobileCost;
		this.works = works;
		this.favMode = favMode;
		this.mobileNo = mobileNo;
	}
	public String getName() {
		return name;
	}
	public String getMobileColor() {
		return mobileColor;
	}
	public char getphoneSign() {
		return phoneSign;
	}
	public int getNoOfCamera() {
		return noOfCamera;
	}
	public int getNoOfApps() {
		return noOfCamera;
	}
	public boolean getMoblieGood() {
		return mobileGood;
	}
	public boolean getBehaviour() {
		return behaviour;
	}
	public double getmobileCost() {
		return mobileCost;
	}
	public boolean getWorks() {
		return works;
	}
	public String getFavMode() {
		return favMode;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	

}
