package com.xworkz.encapsulation.type;

public class MobileShopInsidePackage {
	public String otherMobileShopName = "SANGEETHA";
	public MobileShop mobileShop;

	public void use(MobileShop mobileShop) {

		System.out.println("entering the Cell Phones informations");

		mobileShop.setMobileShop("VIVO", "SELLVER", 'v', 3, 25, true, false, 19000, false, "SAILENT MODE", 9448958488L);
		System.out.println(otherMobileShopName);
		System.out.println(mobileShop.name);
		System.out.println(mobileShop.mobileColor);
		System.out.println(mobileShop.phoneSign);
		System.out.println(mobileShop.noOfCamera);
		System.out.println(mobileShop.noOfApps);
		System.out.println(mobileShop.mobileGood);
		System.out.println(mobileShop.behaviour);
		System.out.println(mobileShop.mobileCost);
		System.out.println(mobileShop.works);
		System.out.println(mobileShop.favMode);
		System.out.println(mobileShop.mobileNo);
	}

}
