package com.xworkz.equality.boot;

import com.xworkz.equality.type.Paint;

public class PaintRunner {

	public static void main(String[] args) {

		Paint paint = new Paint();
		paint.setBrand("ASIAN");
		paint.setCompanyName("MAHAVEER ENTERPRISES PAINTS");
		paint.setGoodMaterial(true);
		paint.setLocationOfShop("Hebbal");
		paint.setNoOfShops(6);
		paint.setOwnerName("Nandan Kumar");
		paint.setPrice(89.00);
		paint.setSignOfShop('A');
		paint.setType("ColourIdeas");

		System.out.println(paint); // implicit toString

		Paint paint2 = new Paint("MAHAVEER", "ASIAN", 6, 89.00, true, "nandan kumar", "hebbal", true, 'A',
				"colouridias");
		System.out.println(paint2);

		boolean same = paint.equals(paint2);
		System.out.println(same);

	}

}