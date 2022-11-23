package com.xworkz.equality.boot;

import com.xworkz.equality.type.Lipstick;

public class LipstickRunner {

	public static void main(String[] args) {

		Lipstick lipcare = new Lipstick();
		lipcare.setBrand("MAYBELLINE");
		lipcare.setColour("lightPink");
		lipcare.setCons("not transfer-proof");
		lipcare.setFavLipstickColor("light pink");
		lipcare.setGood(true);
		lipcare.setNameOfLipstick("LAKME");
		lipcare.setPrice(350);
		lipcare.setProns("non-drying");
		lipcare.setQuality(true);
		lipcare.setTypes(30);

		System.out.println(lipcare);

		Lipstick lipcare2 = new Lipstick("lakme", "maybelline", 30, 530, true, "pink", "non dring", true, "pink",
				"not transfer");
		System.out.println(lipcare2);

		boolean same = lipcare.equals(lipcare2);
		System.out.println(same);

	}

}
