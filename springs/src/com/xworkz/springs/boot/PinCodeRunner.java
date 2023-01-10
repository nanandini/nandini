package com.xworkz.springs.boot;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PinCodeRunner {

	public static void main(String[] args) {
		Map<Double, String> pin = new TreeMap<Double, String>();
		pin.put(561208D, "Chikkaballapur");
		pin.put(561206D, "Gowribidanur");
		pin.put(560061D, "kolar");
		pin.put(560028D, "munchenahalli");
		pin.put(561220D, "Bagepalli");
		pin.put(561205D, "Lepakshi");
		pin.put(561203D, "Ghudibande");
		pin.put(561209D, "Devanahalli");
		pin.put(561229D, "Rtnagar");
		pin.put(561202D, "hoskote");

		Set<Double> key = pin.keySet();
		key.forEach(ele -> System.out.println(ele));

		Collection<String> value = pin.values();
		value.forEach(ele -> System.out.println(ele));

		Set<Entry<Double, String>> entries = pin.entrySet();
		entries.forEach(ele -> System.out.println(ele));

	}

}
