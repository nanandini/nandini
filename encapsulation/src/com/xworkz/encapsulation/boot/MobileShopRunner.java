package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.type.MobileShop;
import com.xworkz.encapsulation.type.MobileShopInsidePackage;

public class MobileShopRunner {

	public static void main(String[] args) {

		MobileShopInsidePackage mobileShopIn1 = new MobileShopInsidePackage();
		MobileShop mobileShop = new MobileShop();
		mobileShop = new MobileShop();
		mobileShopIn1.use(mobileShop);
		System.out.println(mobileShop.getFavMode());

	}

}
