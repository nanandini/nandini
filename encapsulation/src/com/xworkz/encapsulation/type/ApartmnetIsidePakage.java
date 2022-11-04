package com.xworkz.encapsulation.type;

public class ApartmnetIsidePakage {
	public String Name = "ECO NANO++";
	public Apartment apartment = new Apartment();

	public void display() {
		if (this.apartment != null) {
			System.out.println(apartment.getName());
			apartment.setOwnerName("VANIVILASA");
			System.out.println("after entering Apartment:" + apartment.getName());

			System.out.println(apartment.getCurrentBill());
			apartment.setCurrentBill(530000);
			System.out.println("after entering :" + apartment.getCurrentBill());

			System.out.println(apartment.getNoOfDoors());
			apartment.setNoOfDoors(40);
			System.out.println("after entering:" + apartment.getNoOfDoors());

			System.out.println(apartment.getNoOfHomes());
			apartment.setNoOfHomes(35);
			System.out.println("after entering:" + apartment.getNoOfHomes());

			System.out.println(apartment.getEducated());
			apartment.setEducated(true);
			System.out.println("after entering:" + apartment.getEducated());

		}

	}

}
