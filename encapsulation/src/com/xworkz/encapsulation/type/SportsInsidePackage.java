package com.xworkz.encapsulation.type;

public class SportsInsidePackage {
	Sports sports = new Sports();
	int player1 = sports.noOfPlayers;
	int player2 = sports.noOfExtraPlayers;
	boolean player3 = sports.health;
	String player4 = sports.favSportsCoucher;
	int player5 = sports.noOfStudentsIntrest;
	String player6 = sports.mainRole;
	String player7 = sports.captainName;
	long player8 = sports.sportsTeacherNo;

	public void display() {
		System.out.println(sports.noOfPlayers);
		System.out.println(sports.noOfExtraPlayers);
		System.out.println(sports.health);
		System.out.println(sports.favSportsCoucher);
		System.out.println(sports.noOfStudentsIntrest);
		System.out.println(sports.mainRole);
		System.out.println(sports.captainName);
		System.out.println(sports.sportsTeacherNo);
	}

}
