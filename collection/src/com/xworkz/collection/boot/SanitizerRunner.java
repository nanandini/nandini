package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.collection.dto.SanitizerDto;

public class SanitizerRunner {

	public static void main(String[] args) {
		SanitizerDto corona1 = new SanitizerDto("Alco pure", "good", 1800D, "india");
		SanitizerDto corona2 = new SanitizerDto("hand sanitizer", "good", 1800D, "china");
		SanitizerDto corona3 = new SanitizerDto("glicerin", "good", 1800D, "china");
		SanitizerDto corona4 = new SanitizerDto("serum", "better", 800D, "india");
		SanitizerDto corona5 = new SanitizerDto("serum", "good", 800D, "china");
		SanitizerDto corona6 = new SanitizerDto("serum", "bad", 800D, "india");
		SanitizerDto corona7 = new SanitizerDto("serum", "good", 800D, "china");
		SanitizerDto corona8 = new SanitizerDto("serum", "bad", 800D, "india");
		SanitizerDto corona9 = new SanitizerDto("serum", "good", 800D, "china");
		SanitizerDto corona10 = new SanitizerDto("serum", "not bad", 800D, "india");

		Collection<SanitizerDto> collection = new LinkedList<SanitizerDto>();
		collection.add(corona1);
		collection.add(corona2);
		collection.add(corona3);
		collection.add(corona4);
		collection.add(corona5);
		collection.add(corona6);
		collection.add(corona7);
		collection.add(corona8);
		collection.add(corona9);
		collection.add(corona10);

		Iterator<SanitizerDto> virus1 = collection.iterator();
		while (virus1.hasNext()) {
			SanitizerDto value = virus1.next();
			if (value.getPrice() > 30) {
				System.out.println("sanitizsers price less or above " + value);
			}
		}
		Iterator<SanitizerDto> virus2 = collection.iterator();
		while (virus2.hasNext()) {
			SanitizerDto value2 = virus2.next();
			if (value2 != null) {
				System.out.println("given a value" + value2);

			}
		}
		Iterator<SanitizerDto> virus3 = collection.iterator();
		while (virus3.hasNext()) {
			SanitizerDto value3 = virus3.next();
			if (value3.getQuality().matches("good")) {
				virus3.remove();
				System.out.println("removed value  " + value3);

			}
		}
		Iterator<SanitizerDto> virus4 = collection.iterator();
		while (virus4.hasNext()) {
			SanitizerDto value4 = virus4.next();
			if (value4.getPrice() < 175) {
				System.out.println("less sanitizer price  " + value4);

			}
		}
		Iterator<SanitizerDto> virus5 = collection.iterator();
		while (virus5.hasNext()) {
			SanitizerDto value5 = virus5.next();
			if (value5.getPrice() > 1000) {
				System.out.println("maximum sanitizer  price " + value5);

			}
		}
		Iterator<SanitizerDto> virus6 = collection.iterator();
		while (virus6.hasNext()) {
			SanitizerDto value6 = virus6.next();
			if (value6.getPrice() > 900) {
				System.out.println("get sanitizer prize  " + value6);
			}
		}

	}

}