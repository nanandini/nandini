package com.xworkz.springs.boot;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CityRunner {

	public static void main(String[] args) {
		Map<String, Double> temp = new LinkedHashMap<String, Double>();
		temp.put("Ubli", 24.5);
		temp.put("Davangere", 21.5);
		temp.put("Dharwad", 11.0);
		temp.put("Gubbi", 30.4);
		temp.put("kolar", 22.3);
		temp.put("Madikeri", 21.2);
		temp.put("Mysore", 11.2);
		temp.put("Kalaburgi", 24.5);
		temp.put("Chitradurga", 31.14);
		temp.put("Kerala", 29.22);

		Set<Entry<String, Double>> entri = temp.entrySet();
		entri.forEach(ele -> System.out.println(ele));
		Collection<Double> value = temp.values();
		value.stream().forEach(ele -> System.out.println(ele));
		Set<String> key = temp.keySet();
		key.forEach(ele -> System.out.println(ele));

	}

}
