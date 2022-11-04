package com.xworkz.encapsulation.type;

public class Sports {
	public String gameName;
	private String favGame;
	private double sportsFees;
	int noOfPlayers = 9;
	int noOfExtraPlayers = 3;
	boolean health = true;
	String favSportsCoucher = "RAVI SIR";
	int noOfStudentsIntrest = 67;
	String mainRole = "MAIN PLAYER";
	String captainName = "NANDINI";
	long sportsTeacherNo = 9448958488L;

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getFavGame() {
		return favGame;
	}

	public void setFavGame(String favGame) {
		this.favGame = favGame;
	}

	public double getSportsFees() {
		return sportsFees;
	}

	public void setSportsFees(double sportsFees) {
		this.sportsFees = sportsFees;
	}
}
