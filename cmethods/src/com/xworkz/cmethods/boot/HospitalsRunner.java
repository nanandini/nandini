package com.xworkz.cmethods.boot;

import com.xworkz.cmethods.ctype.*;

public class HospitalsRunner {

	public static void main(String[] args) {

		String[] patientNames = { "kiran", "vidya", "vanya", "manasa", "pragnya" };
		String[] typesOfRooms = { "AC", "NON AC", "NORMAL" };
		double[] amount = { 40000, 25000, 60000, 700000 };
		boolean[] overAll = { true, false, true };
		String[] oprations = { "head opration", "stomach opration", "hand opration" };

		Hospital hospital = new Hospital("JEEVAN HOSPITAL", "CHIKKABALLAPUR", 7, true, "ALL AROUNDER", patientNames,
				typesOfRooms, amount, overAll, oprations);
		hospital.display();
	}

}
