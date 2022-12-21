package com.xworkz.javaCollection.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class WatchRunner {
	public static void main(String[] args) {

		String watch1 = "Titan";
		String watch2 = "Fastack";
		String watch3 = "Sonata";
		String watch4 = "HMT";
		String watch5 = "sangeetha";

		Collection<String> watch = new ArrayList<String>();
		watch.add(watch5);
		watch.add(watch4);
		watch.add(watch3);
		watch.add(watch2);
		watch.add(watch1);

		System.out.println(watch);
		System.out.println(" Excuting to string method...");

		Iterator<String> value = watch.iterator();
		while (value.hasNext()) {
			String set = value.next();
			System.out.println(set);
		}
		System.out.println(" Excuting iterator method...");
		for (String getwatch : watch) {
			System.out.println(getwatch);
		}
		System.out.println("Excuting for each ");

	}

}
