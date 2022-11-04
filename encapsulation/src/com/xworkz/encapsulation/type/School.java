package com.xworkz.encapsulation.type;

public class School {
	public String name;
	public String uniformColor;
	public char students;
	public int noOfDoors;
	public int noOfStudentsInClass;
	public boolean Education;
	public boolean studentsBehaviour;
	public double schoolFees;
	public boolean nature;
	public String favTeacher;
	public int noOfVans;

	public void setSchool1(String name, String uniformColor, char students, int noOfDoors, int noOfStudentsInClass,
			boolean education, boolean studentsBehaviour, double schoolFees, boolean nature, String favTeacher,
			int noOfVans) {

		this.name = name;
		this.uniformColor = uniformColor;
		this.students = students;
		this.noOfDoors = noOfDoors;
		this.noOfStudentsInClass = noOfStudentsInClass;
		Education = education;
		this.studentsBehaviour = studentsBehaviour;
		this.schoolFees = schoolFees;
		this.nature = nature;
		this.favTeacher = favTeacher;
		this.noOfVans = noOfVans;
	}

	public String getname() {
		return name;
	}

	public String getuniformColor() {
		return uniformColor;
	}

	public char getstudents() {
		return students;
	}

	public int getnoOFDoors() {
		return noOfDoors;
	}

	public int getnoOfStudentsInClass() {
		return noOfStudentsInClass;
	}

	public boolean getEducation() {
		return Education;
	}

	public boolean getstudentsBehaviour() {
		return studentsBehaviour;
	}

	public double getschoolFees() {
		return schoolFees;
	}

	public boolean getnature() {
		return nature;
	}

	public String getfavTeacher() {
		return favTeacher;
	}

	public int getnoOfVans() {
		return noOfVans;
	}

}
