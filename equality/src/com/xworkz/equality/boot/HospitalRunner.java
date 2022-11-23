package com.xworkz.equality.boot;

import com.xworkz.equality.type.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.setBillpay(60000);
		hospital.setAboutHospital(true);
		hospital.setDocterName("Dr.NAYANA");
		hospital.setExperiencedTrainers(true);
		hospital.setHeadOfHospital("Dr.JAYASHREE");
		hospital.setHospitalName("APPORVA Hospital");
		hospital.setLocation("GOWRIBIDANUR");
		hospital.setNoOffacilities(10);
		hospital.setOperationame("ENT TEST");
		hospital.setTypeofOperation("Ear Operation");

		System.out.println(hospital);

		Hospital hospital2 = new Hospital("JAYADEVA", "Bhuvaneswar", "heart operation", 59000, true, "vinoda",
				"Rajajinagar", true, 6, "head");
		System.out.println(hospital2);
		boolean same = hospital.equals(hospital2);
		System.out.println(same);

	}

}