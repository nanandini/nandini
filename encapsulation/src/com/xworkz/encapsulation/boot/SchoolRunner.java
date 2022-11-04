package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.type.School;

import com.xworkz.encapsulation.type.SchoolInsidePackage;

public class SchoolRunner {

	public static void main(String[] args) {
		SchoolInsidePackage schoolIn = new SchoolInsidePackage();
		School school = new School();
		schoolIn.use(school);
		System.out.println(school.getname());

	}

}
