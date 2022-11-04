package com.xworkz.encapsulation.type;

public class ChildhoodInside {
	Childhood memory = new Childhood();
	int memory1 = memory.noOfChildhoodFriends;
	int memory2 = memory.noOfChildhoodEnemies;
	boolean memory3 = memory.friends;
	String memory4 = memory.childhoodSchoolName;
	int memory5 = memory.typesOfFriends;
	String memory6 = memory.location;
	String memory7 = memory.favTeacher;
	long memory8 = memory.favTeacherNum;

	public void display() {
		System.out.println(memory.noOfChildhoodFriends);
		System.out.println(memory.noOfChildhoodEnemies);
		System.out.println(memory.friends);
		System.out.println(memory.childhoodSchoolName);
		System.out.println(memory.typesOfFriends);
		System.out.println(memory.location);
		System.out.println(memory.favTeacher);
		System.out.println(memory.favTeacherNum);
	}

}
