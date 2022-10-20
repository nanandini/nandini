package com.xworkz.cmethods.boot;

import com.xworkz.cmethods.ctype.*;

public class SchoolRunner {

	public static void main(String[] args) {

		String[] students = { "vinu", "anu", "meghana", "divya", "kavya" };
		String[] activities = { "singing", "dancing", "playing" };
		char[] studentSigns = { 'H', 'D', 'S', 'R' };
		boolean[] overAll = { true, true, false, true };
		String[] sports = { "football", "hockey", "shuttle", "volleyBall" };

		School school = new School("BGS SCHOOL", "CHIKKABALLAPUR", 40000, true, "school Souroundings", students,
				activities, studentSigns, overAll, sports);
		school.display();

	}

}
