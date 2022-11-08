package com.xworkz.inheritance2.type;

import com.xworkz.inheritance2.casting.Court;

public class DistrictCourt extends Court {

	public String districtName;
	public long pinCodeOfDistrict;

	public DistrictCourt() {
		System.out.println("creating default constructor");
	}

}
