package com.xworkz.javaCollection.boot;

import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionRunner {

	public static void main(String[] args) {
		String mall1 = "Esteem mall";
		String mall2 = "G T Mall";
		String mall3 = "Orian mall";
		String mall4 = "Garuda Mall";
		String mall5 = "lulu mall";
		String mall6 = "Mantri mall";
		String mall7 = "RMZ gallerian mall";
		String mall8 = "phoenix mall";
		String mall9 = "Elements mall";
		String mall10 = "Royal Meenakshi Mall";
		String mall11 = "Brookefield Mall";
		String mall12 = "Nexus Shantiniketan Mall";
		String mall13 = "sawgrass mall";
		String mall14 = "roosevelt mall";
		String mall15 = "south coast mall";
		String mall16 = "kingplace mall";
		String mall17 = "kibron mall";
		String mall18 = "limpa city mall";
		String mall19 = "kinto mall";
		String mall20 = "simom city mall";
		String mall21 = "pearls mall";
		String mall22 = "mall of america";

		// Collection<String> collection = new TreeSet();
		Collection<String> collection = new LinkedList<String>();

		Collection collection1 = new TreeSet();
		collection1.add(mall1);
		collection1.add(mall12);
		collection1.add(mall9);
		collection1.add(mall8);
		collection1.add(mall6);
		collection1.add(mall5);
		collection1.add(mall11);
		collection1.add(mall10);
		collection1.add(mall2);
		collection1.add(mall3); // passing ref
		collection1.add(mall4);
		collection1.add(mall7);

		System.out.println("total malls are =" + collection1.size());
		collection1.clear();

		System.out.println("After clear method....");
		System.out.println(collection.size());

		String currancy1 = "Dollar";
		String currancy2 = "Ruppe";
		String currancy3 = "pounds";
		String currancy4 = "euro";
		String currancy5 = "Australian Dollar";
		String currancy6 = "Canidian Dollar";
		String currancy7 = "dinar";
		String currancy8 = "franc";
		String currancy9 = "rand";
		String currancy10 = "singapore dollar";
		String currancy11 = "ruble";
		String currancy12 = "peso";
		String currancy13 = "yen";
		String currancy14 = "barmudian Dollar";
		String currancy15 = "nepalese rupee";
		String currancy16 = "dram";
		String currancy17 = "real";
		String currancy18 = "shiling";
		String currancy19 = "krone";
		String currancy20 = "rial";
		String currancy21 = "Brunie Dollar";
		String currancy22 = "dong";
		String currancy23 = "cedi";
		String currancy24 = "taka";
		String currancy25 = "afgani";
		String currancy26 = "cubian peso";

		Collection<String> collection11 = new TreeSet();
		Collection collection2 = new TreeSet();
		collection2.add(currancy1);
		collection2.add(currancy4);
		collection2.add(currancy13);
		collection2.add(currancy10);
		collection2.add(currancy11);
		collection2.add(currancy12);
		collection2.add(currancy14);
		collection2.add(currancy15);
		collection2.add(currancy16); // passing ref
		collection2.add(currancy17);
		collection2.add(currancy18);
		collection2.add(currancy19);
		collection2.add(currancy6);
		collection2.add(currancy9);
		collection2.add(currancy2);
		collection2.add(currancy22);
		collection2.add(currancy21);
		collection2.add(currancy23);
		collection2.add(currancy24);
		collection2.add(currancy25);
		collection2.add(currancy26);
		collection2.add(currancy3);
		collection2.add(currancy5);
		collection2.add(currancy6);
		collection2.add(currancy7);
		collection2.add(currancy8);
		collection2.add(currancy9);
		collection2.add(currancy20);
		collection2.add(currancy13);

		System.out.println("total currency are =" + collection2.size());
		collection2.clear();

		System.out.println("After clear method....");
		System.out.println(collection2.size());

		String Sweet1 = "jamun";
		String Sweet2 = "kesar pista";
		String Sweet3 = "laddu";
		String Sweet4 = "son papadi";
		String Sweet5 = "barfi";
		String Sweet6 = "kaju barfi";
		String Sweet7 = "kheer";
		String Sweet8 = "jalebi";
		String Sweet9 = "mysore pak";
		String Sweet10 = "rasagulla";
		String Sweet11 = "rasamalai";
		String Sweet12 = "kaju katli";
		String Sweet13 = "peda";
		String Sweet14 = "darawadh peda";

		Collection collection3 = new TreeSet();
		collection3.add(Sweet1);
		collection3.add(Sweet2);
		collection3.add(Sweet3);
		collection3.add(Sweet4);
		collection3.add(Sweet5);
		collection3.add(Sweet6);
		collection3.add(Sweet7);
		collection3.add(Sweet8);
		collection3.add(Sweet9);
		collection3.add(Sweet10); // passing ref
		collection3.add(Sweet11);
		collection3.add(Sweet12);
		collection3.add(Sweet13);
		collection3.add(Sweet14);

		System.out.println("total sweets are =" + collection3.size());
		collection3.clear();

		System.out.println("After clear method....");
		System.out.println(collection3.size());

		String coupon1 = "kfc coupon";
		String coupon2 = "amazon coupon";
		String coupon3 = "flifkart";
		String coupon4 = "ecommerce";
		String coupon5 = "ebay";
		String coupon6 = "naika";
		String coupon7 = "purple";
		String coupon8 = "governmet";
		String coupon9 = "kia";
		String coupon10 = "maruti";
		String coupon11 = "tcs";
		String coupon12 = "yamaha coupons";

		Collection<String> collection4 = new TreeSet();

		Collection collection41 = new TreeSet();
		collection41.add(coupon12);
		collection41.add(coupon11);
		collection41.add(coupon10);
		collection41.add(coupon1);
		collection41.add(coupon2);
		collection41.add(coupon4);
		collection41.add(coupon3);
		collection41.add(coupon5);
		collection41.add(coupon6);
		collection41.add(coupon7); // passing ref
		collection41.add(coupon8);
		collection41.add(coupon9);

		System.out.println("total coupon are =" + collection41.size());
		collection41.clear();

		System.out.println("After clear method....");
		System.out.println(collection41.size());

		String bike1 = "herohonda";
		String bike2 = "KTM";
		String bike3 = "bullet";
		String bike4 = "yamaha";
		String bike5 = "pulser";
		String bike6 = "classic 350";
		String bike7 = "meteor";
		String bike8 = "hunter 350";
		String bike9 = "pulser 220";
		String bike10 = "ninza";
		String bike11 = "bmw 650";
		String bike12 = "continental gt";
		String bike13 = "intereceptor";
		String bike14 = "access";
		String bike15 = "activa";
		String bike16 = "dio";
		String bike17 = "activa 125";
		String bike18 = "jupiter";

		Collection<String> collection42 = new TreeSet();

		Collection collection111 = new TreeSet();
		collection111.add(bike18);
		collection111.add(bike17);
		collection111.add(bike16);
		collection111.add(bike15);
		collection111.add(bike14);
		collection111.add(bike13);
		collection111.add(bike12);
		collection111.add(bike11);
		collection111.add(bike10);
		collection111.add(bike9); // passing ref
		collection111.add(bike8);
		collection111.add(bike7);
		collection111.add(bike6);
		collection111.add(bike5);
		collection111.add(bike4);
		collection111.add(bike3);
		collection111.add(bike2);
		collection111.add(bike1);

		collection111.add(bike18);

		System.out.println("total bike are =" + collection111.size());
		collection111.clear();

		System.out.println("After clear method....");
		System.out.println(collection111.size());

	}

}
