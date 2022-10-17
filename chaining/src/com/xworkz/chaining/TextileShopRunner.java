package com.xworkz.chaining;

public class TextileShopRunner {

	public static void main(String[] args) {

		TextileShop seller = new TextileShop("KRISHNA");
		System.out.println("name of the OWNER:" + seller.ownerName);

		TextileShop seller1 = new TextileShop("KRISHNA", "RADHA");
		System.out.println("name of the OWNERWIFENAME:" + seller1.ownerWifeName);

		TextileShop seller2 = new TextileShop("KRISHNA", "RADHA", "RITHU");
		System.out.println("name of the OWNERDAUGHTERNAME:" + seller2.ownerDaughterName);

		TextileShop seller3 = new TextileShop("KRISHNA", "RADHA", "RITHU", 9448958488L);
		System.out.println("name of the OWNERDAUGHTERNO:" + seller3.daughterNumber);

		TextileShop seller4 = new TextileShop("KRISHNA", "RADHA", "RITHU", 9448958488L, 1);
		System.out.println("name of the OWNERNOOFWIFES:" + seller4.ownerNoOfWifes);

		TextileShop seller5 = new TextileShop("KRISHNA", "RADHA", "RITHU", 9448958488L, 1, 246);
		System.out.println("name of the OWNER SHOPNO:" + seller5.shopNo);

		TextileShop seller6 = new TextileShop("KRISHNA", "RADHA", "RITHU", 9448958488L, 1, 246, 9900276144L);
		System.out.println("name of the OWNER contact no:" + seller6.contactNo);
	}

}
