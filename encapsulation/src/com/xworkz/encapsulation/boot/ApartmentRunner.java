package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.type.ApartmnetIsidePakage;

public class ApartmentRunner {

	public static void main(String[] args) {

		ApartmnetIsidePakage count = new ApartmnetIsidePakage();
		System.out.println(count.Name);
		System.out.println(count.apartment);
		count.display();

	}

}
