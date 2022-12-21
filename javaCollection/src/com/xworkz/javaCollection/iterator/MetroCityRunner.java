package com.xworkz.javaCollection.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityRunner {

	public static void main(String[] args) {

		String metroCity1 = "Banglore";
		String metroCity2 = "Hydrabad";
		String metroCity3 = "Mumbai";
		String metroCity4 = "Pune";
		String metroCity5 = "Dehali";

		Collection<String> cityname = new ArrayList<String>();
		cityname.add(metroCity5);
		cityname.add(metroCity4);
		cityname.add(metroCity3);
		cityname.add(metroCity2);
		cityname.add(metroCity1);

		System.out.println(cityname);
		System.out.println("Excuting to string method...");

		for (String name : cityname) {
			System.out.println(name);

		}
		System.out.println(" Excuting for each method.....");
		Iterator<String> city = cityname.iterator();
		while (city.hasNext()) {
			String metro = city.next();
			System.out.println(metro);
		}
		System.out.println(" Excuting Iterator method....");

	}

}
