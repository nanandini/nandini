package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.type.Flowers;
import com.xworkz.encapsulation.type.FlowersInsidePackage;

public class FlowersRunner {

	public static void main(String[] args) {
		FlowersInsidePackage FlowersInsidePackage = new FlowersInsidePackage();
		FlowersInsidePackage.display();
		Flowers fav = new Flowers();
		fav.setfavNameOfFlower("MARIGOLD");
		System.out.println(fav.getfavNameOfFlower());
		fav.setflowersCost(600);
		System.out.println(fav.getflowersCost());

	}

}
