package com.xworkz.strings;

public class InMethods {

	public static void main(String[] args) {
		String ref = "Xworkz Rajajinagar";
		String ref1 = " web Technology";

		System.out.println(ref);
		ref = ref.concat(ref1); // concat method
		System.out.println(ref);

		System.out.println(ref);
		ref = ref + "nandu";
		System.out.println(ref);
		String concated = ref.concat("CHIKKABALLAPUR"); // string method 1
		System.out.println(concated);
		System.out.println("-----");

		int reff = concated.charAt(25); // string method 2
		System.out.println(reff);
		System.out.println("------");

		int reff1 = concated.codePointAt(2); // string method 3
		System.out.println(ref1);
		System.out.println("-----");

		boolean ref2 = ref.contains(ref); // string method 4
		System.out.println(ref2);
		System.out.println("------");

		int ref3 = ref.codePointBefore(2); // string method 5
		System.out.println(ref3);
		System.out.println("------");

		int ref4 = concated.codePointCount(3, 13); // string method 6
		System.out.println(ref4);
		System.out.println("-------");

		int ref5 = ref.compareTo(concated); // string method 7
		System.out.println(ref5);
		System.out.println("---------");

		int ref6 = ref.compareToIgnoreCase(ref); // string method 8
		System.out.println(ref6);
		System.out.println("------");

		boolean ref7 = ref.contentEquals(concated); // string method 9
		System.out.println(ref7);
		System.out.println("------");

		boolean ref8 = concated.contentEquals(ref); // string method 10
		System.out.println(ref8);
		System.out.println("------");

		byte[] ref9 = concated.getBytes(); // string method 11
		System.out.println(ref9);
		System.out.println("------");

		byte[] a = concated.getBytes(); // string method 12
		System.out.println(a);
		System.out.println("--------");

		byte[] b = concated.getBytes(); // string method 13
		System.out.println(b);
		System.out.println("-------");

		int c = concated.hashCode(); // string method 14
		System.out.println(c);
		System.out.println("------");

		int d = ref.indexOf(1); // string method 15
		System.out.println(d);
		System.out.println("-------");

		int e = ref.indexOf(concated); // string method 16
		System.out.println(e);
		System.out.println("-------");

		int f = ref.indexOf(c, e); // string method 17
		System.out.println(f);
		System.out.println("--------");

		String g = ref.intern(); // string method 18
		System.out.println(g);
		System.out.println("-------");

		boolean h = ref.isEmpty(); // string method 19
		System.out.println(h);
		System.out.println("------");

		int i = ref.length(); // string method 20
		System.out.println(i);
		System.out.println("-------");

		boolean j = concated.matches(concated); // string method 21
		System.out.println(j);
		System.out.println("----");

		String k = concated.replace("hi", "bye"); // string method 22
		System.out.println(k);
		System.out.println("--------");

		String[] l = ref.split("jagadeesh"); // string method 23
		System.out.println(l);
		System.out.println("------");

		String m = concated.toUpperCase(); // string method 24
		System.out.println(m);
		System.out.println("-------");

		String n = concated.trim(); // string method 25
		System.out.println(n);
		System.out.println("----------");

		String o = concated.toLowerCase(); // string method 26
		System.out.println(o);
		System.out.println("---------");

	}

}
