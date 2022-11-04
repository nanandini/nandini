package com.xworkz.constructors;

public class RMDRunner {

	public static void main(String[] args) {
		RMD product = new RMD();

		System.out.println("details of literal properties.....");

		System.out.println("name:" + product.companyName);
		System.out.println("type:" + product.type);
		System.out.println("healthy:" + product.healthy);
		System.out.println("quantity:" + product.quantity);
		System.out.println("colour:" + product.colour);
		System.out.println("made:" + product.madeInIndia);
		System.out.println("cost:" + product.cost);
		System.out.println("streetname:" + product.streetName);
		System.out.println("aboutHealth:" + product.goodForHealth);

		System.out.println("shop details......");

		product.nameOfOwner = "someOneElse";
		System.out.println("name:" + product.nameOfOwner);

		product.expiredDate = "2024";
		System.out.println("date:" + product.expiredDate);

		product.panMasala = "15%";
		System.out.println("growth:" + product.panMasala);

		product.stores = "everywhere";
		System.out.println("workers:" + product.stores);

		product.shopLocation = "vidya nagar";
		System.out.println("location:" + product.shopLocation);

		product.price = 30;
		System.out.println("price:" + product.price);

		product.branch = true;
		System.out.println("good:" + product.branch);

		product.quality = "100%";
		System.out.println("name:" + product.quality);

		product.shopFeedBack = "its not good for health";
		System.out.println("feedback:" + product.shopFeedBack);
	}

}
