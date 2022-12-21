package com.xworkz.javaCollection.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AnimalRunner {

	public static void main(String[] args) {
		
				String pet1 = "Dog ";
				String pet2 = "deer ";
				String pet3 = "fox ";
				String pet4 = "wolf";
				String pet5 = "mouse ";
				String pet6 = "camel ";
				String pet7 = "ziraffe";
				String pet8 = "cat";
				String pet9 = "rabbit";
				String pet10 = "yak";

				Collection<String> collection = new ArrayList<String>();
				collection.add(pet1);
				collection.add(pet2);
				collection.add(pet4);
				collection.add(pet3);
				collection.add(pet5);
				collection.add(pet6);
				collection.add(pet8);
				collection.add(pet7);
				collection.add(pet9);
				collection.add(pet10);

				System.out.println(collection);
				System.out.println("to String method....");

				for (String value : collection) {
					System.out.println(value);
				}
				System.out.println("For each method....");
				Iterator<String> value = collection.iterator();
				while (value.hasNext()) {
					String reference = value.next();
					System.out.println(reference);
				}
				System.out.println("iterator method ....");

			}

		}
	


