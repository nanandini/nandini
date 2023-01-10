package com.xworkz.springs.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PgRunner {

	public static void main(String[] args) {
		Map<String, Double> pg = new HashMap<String, Double>();
		pg.put("krishnan", 4000D);
		pg.put("kushal ", 4500D);
		pg.put("Vhaibav ", 5500D);
		pg.put("Virat ", 7000D);
		pg.put("Pallavi ", 6500D);
		pg.put("Shree sai ", 4500D);
		pg.put("Vemana ", 8000D);
		pg.put("Yadav ", 4700D);
		pg.put("Acharya", 4800D);
		pg.put("Queue ", 6500D);
		pg.put("Veena ", 9000D);
		pg.put("Kushi ", 3000D);

		Set<String> keys = pg.keySet();

		System.err.println("Keys");
		keys.forEach(ele -> System.out.println(ele));
		// System.out.println(keys);
		System.out.println(System.lineSeparator());

		System.err.println("Values");
		Collection<Double> values = pg.values();
		values.forEach(ele -> System.out.println(ele));

		System.out.println(System.lineSeparator());

		System.err.println("Entries");
		Set<Entry<String, Double>> entres = pg.entrySet();

		entres.forEach(ele -> System.out.println(ele));

	}

}
