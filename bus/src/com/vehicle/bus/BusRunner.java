package com.vehicle.bus;

public class BusRunner {

	public static void main(String[] args) {

		Bus vishwa = new Bus();
		System.out.println("bus number:" + vishwa.num);

		vishwa.num = 176;
		System.out.println("bus number:" + vishwa.num);

		vishwa.starting = "chikkaballapur";
		System.out.println("place where start :" + vishwa.starting);

		vishwa.destination = "hindupur";
		System.out.println("destination :" + vishwa.destination);
	}

}
