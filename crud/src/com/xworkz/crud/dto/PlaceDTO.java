package com.xworkz.crud.dto;

public class PlaceDTO {
	private String FavPlace;
	private String nameOfPlace;
	private int famousFor;
	private String Climate;
	private String BeachName;

	public PlaceDTO() {
		System.out.println("Starting of main method of place Details....");
	}

	public PlaceDTO(String favPlace, String nameOfPlace, int famousFor, String climate, String beachName) {
		super();
		FavPlace = favPlace;
		this.nameOfPlace = nameOfPlace;
		this.famousFor = famousFor;
		Climate = climate;
		BeachName = beachName;
	}

	@Override
	public String toString() {
		return "PlaceDTO [FavPlace=" + FavPlace + ", nameOfPlace=" + nameOfPlace + ", famousFor=" + famousFor
				+ ", Climate=" + Climate + ", BeachName=" + BeachName + ", toString()=" + super.toString() + "]";
	}

	public String getFavPlace() {
		return FavPlace;
	}

	public void setFavPlace(String favPlace) {
		FavPlace = favPlace;
	}

	public String getNameOfPlace() {
		return nameOfPlace;
	}

	public void setNameOfPlace(String nameOfPlace) {
		this.nameOfPlace = nameOfPlace;
	}

	public int getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(int famousFor) {
		this.famousFor = famousFor;
	}

	public String getClimate() {
		return Climate;
	}

	public void setClimate(String climate) {
		Climate = climate;
	}

	public String getBeachName() {
		return BeachName;
	}

	public void setBeachName(String beachName) {
		BeachName = beachName;
	}

}
