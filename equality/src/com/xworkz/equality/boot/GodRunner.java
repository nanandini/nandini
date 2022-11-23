package com.xworkz.equality.boot;

import com.xworkz.equality.type.God;

public class GodRunner {

	public static void main(String[] args) {

		God peace = new God();
		peace.setBookFoRTrain(1200);
		peace.setFavPalce("ADHICHUNNAGIRI");
		peace.setGodName("kalabhairava");
		peace.setLocation("Mandya");
		peace.setNatureOfThatPalce(true);
		peace.setNoOfDaysOpen(7);
		peace.setNoofSteps(2400);
		peace.setPlace("HALEBIDU");
		peace.setTempleName("kalabhairava swamy temple");
		peace.setTravelingIntrainBetter(true);

		System.out.println(peace);

		God god2 = new God("kalabhairava", "halebidu", 7, 2400, true, "adhichunnagiri", "mandya", true, "kalabhairava",
				2400);
		System.out.println(god2);
		boolean same = peace.equals(god2);
		System.out.println(same);

	}

}
