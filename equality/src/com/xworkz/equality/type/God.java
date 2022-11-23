package com.xworkz.equality.type;



public class God {

	private String godName;
	private String place;
	private int noOfDaysOpen;
	private double bookFoRTrain;
	private boolean natureOfThatPalce;
	private String FavPalce;
	private String location;
	private boolean travelingIntrainBetter;
	private String templeName;
	private int NoofSteps;

	public God() {
		System.out.println("Default const of god");
	}

	public God(String godName, String place, int noOfDaysOpen, double bookFoRTrain, boolean natureOfThatPalce,
			String favPalce, String location, boolean travelingIntrainBetter, String templeName, int noofSteps) {
		super();
		this.godName = godName;
		this.place = place;
		this.noOfDaysOpen = noOfDaysOpen;
		this.bookFoRTrain = bookFoRTrain;
		this.natureOfThatPalce = natureOfThatPalce;
		FavPalce = favPalce;
		this.location = location;
		this.travelingIntrainBetter = travelingIntrainBetter;
		this.templeName = templeName;
		NoofSteps = noofSteps;
	}

	@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in god");

		if (other instanceof God) {
			System.out.println("other is god,can check the properties");
			God ref = (God) other;

			if (this.FavPalce.equals(ref.FavPalce) && this.godName.equals(ref.godName)
					&& this.location.equals(ref.location) && this.place.equals(ref.place)) {
				System.out.println("favplace is same");
				System.out.println("godname is same");
				System.out.println("location is same");
				System.out.println("place is same");
				return true;
			}
		} else {
			System.out.println("other is not god,cannot check the properties");
		}
		return false;
	}

	@Override
	public String toString() {
		return "Paint[godName=" + godName + ",place=" + place + ",  noOfDaysOpen=" + noOfDaysOpen + ", bookFoRTrain="
				+ bookFoRTrain + ",natureOfThatPalce=" + natureOfThatPalce + ",travelingIntrainBetter="
				+ travelingIntrainBetter + ",templeName=" + templeName + "" + ",NoofSteps=" + NoofSteps + "]";
	}

	public String getGodName() {
		return godName;
	}

	public void setGodName(String godName) {
		this.godName = godName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getNoOfDaysOpen() {
		return noOfDaysOpen;
	}

	public void setNoOfDaysOpen(int noOfDaysOpen) {
		this.noOfDaysOpen = noOfDaysOpen;
	}

	public double getBookFoRTrain() {
		return bookFoRTrain;
	}

	public void setBookFoRTrain(double bookFoRTrain) {
		this.bookFoRTrain = bookFoRTrain;
	}

	public boolean isNatureOfThatPalce() {
		return natureOfThatPalce;
	}

	public void setNatureOfThatPalce(boolean natureOfThatPalce) {
		this.natureOfThatPalce = natureOfThatPalce;
	}

	public String getFavPalce() {
		return FavPalce;
	}

	public void setFavPalce(String favPalce) {
		FavPalce = favPalce;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isTravelingIntrainBetter() {
		return travelingIntrainBetter;
	}

	public void setTravelingIntrainBetter(boolean travelingIntrainBetter) {
		this.travelingIntrainBetter = travelingIntrainBetter;
	}

	public String getTempleName() {
		return templeName;
	}

	public void setTempleName(String templeName) {
		this.templeName = templeName;
	}

	public int getNoofSteps() {
		return NoofSteps;
	}

	public void setNoofSteps(int noofSteps) {
		NoofSteps = noofSteps;
	}

}
