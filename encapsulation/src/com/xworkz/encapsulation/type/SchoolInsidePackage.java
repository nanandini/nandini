package com.xworkz.encapsulation.type;

public class SchoolInsidePackage {
	public String otherSchoolName = "SIT SCHOOL";
	public School school;

	public void use(School school) {

		System.out.println("entering the SCHOOL informations");

		school.setSchool1("BGS SCHOOL", "GREEN and white", 'T', 67, 87, true, false, 450.67, false, "ARCHANA MAM", 30);
		System.out.println(otherSchoolName);
		System.out.println(school.name);
		System.out.println(school.uniformColor);
		System.out.println(school.students);
		System.out.println(school.noOfDoors);
		System.out.println(school.noOfStudentsInClass);
		System.out.println(school.Education);
		System.out.println(school.studentsBehaviour);
		System.out.println(school.schoolFees);
		System.out.println(school.nature);
		System.out.println(school.favTeacher);
		System.out.println(school.noOfVans);
	}

}
