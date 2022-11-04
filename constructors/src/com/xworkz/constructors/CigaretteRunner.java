package com.xworkz.constructors;

public class CigaretteRunner {

	public static void main(String[] args) {
		Cigarette badForHealth = new Cigarette();

		System.out.println("details of literal properties.....");

		System.out.println("name:" + badForHealth.shopName);
		System.out.println("type:" + badForHealth.causes);
		System.out.println("healthy:" + badForHealth.healthy);
		System.out.println("quantity:" + badForHealth.quantity);
		System.out.println("colour:" + badForHealth.colour);
		System.out.println("made:" + badForHealth.madeInIndia);
		System.out.println("cost:" + badForHealth.cost);
		System.out.println("streetname:" + badForHealth.streetName);
		System.out.println("aboutHealth:" + badForHealth.goodForHealth);

		System.out.println("shop details......");

		badForHealth.nameOfCause = "SMOKING SHOP";
		System.out.println("name:" + badForHealth.nameOfCause);

		badForHealth.diseases = "lung diseases by smoking";
		System.out.println("date:" + badForHealth.diseases);

		badForHealth.type = " most Smoking";
		System.out.println("growth:" + badForHealth.type);

		badForHealth.estimates = "INCREASES THE RISK";
		System.out.println("workers:" + badForHealth.estimates);

		badForHealth.shopLocation = "RAJAJINAGAR";
		System.out.println("location:" + badForHealth.shopLocation);

		badForHealth.price = 40;
		System.out.println("price:" + badForHealth.price);

		badForHealth.bad = true;
		System.out.println("cause:" + badForHealth.bad);

		badForHealth.nameOfThing = "Cigarettes";
		System.out.println("name:" + badForHealth.nameOfThing);

		badForHealth.shopFeedBack = "overall its bad for health and it causes helth injuries";
		System.out.println("feedback:" + badForHealth.shopFeedBack);
	}

}
