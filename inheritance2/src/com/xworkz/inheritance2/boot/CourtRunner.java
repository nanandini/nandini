package com.xworkz.inheritance2.boot;

import com.xworkz.inheritance2.casting.Court;
import com.xworkz.inheritance2.type.DistrictCourt;
import com.xworkz.inheritance2.type.HighCourt;
import com.xworkz.inheritance2.type.SupremeCourt;

public class CourtRunner {

	public static void main(String[] args) {

		Court court = new Court();

		System.out.println(court.judgeName);
		System.out.println(court.location);

		Court court1 = new DistrictCourt();

		DistrictCourt district = (DistrictCourt) court1;

		System.out.println(district.districtName);
		System.out.println(district.pinCodeOfDistrict);

		Court court2 = new HighCourt();

		HighCourt highcourt = (HighCourt) court2;

		System.out.println(highcourt.StateName);
		System.out.println(highcourt.noOfJudges);

		Court court3 = new SupremeCourt();

		SupremeCourt supremecourt = (SupremeCourt) court3;

		System.out.println(supremecourt.nation);
		System.out.println(supremecourt.judgeFinalDecision);

	}

}
