package com.xworkz.encapsulation.type;

public class Movie {

	public String name;
	public String heroName;
	public String heroine;
	public int noOfDailague;
	public int noOfSongs;
	public boolean acting;
	public boolean dances;
	public double invest;
	public boolean overAll;
	public String favSong;
	public int noOfComedians;

	public void setMovie(String name, String heroName, String heroine, int noOfDailague, int noOfSongs, boolean acting,
			boolean dances, double invest, boolean overAll, String favSong, int noOfComedians) {

		this.name = name;
		this.heroName = heroName;
		this.heroine = heroine;
		this.noOfDailague = noOfDailague;
		this.noOfSongs = noOfSongs;
		this.acting = acting;
		this.dances = dances;
		this.invest = invest;
		this.overAll = overAll;
		this.favSong = favSong;
		this.noOfComedians = noOfComedians;
	}

	public String getName() {
		return name;
	}

	public String getHeroName() {
		return heroName;
	}

	public String getHeroine() {
		return heroine;
	}

	public int getNoOfDailague() {
		return noOfDailague;
	}

	public int getNoOfSongs() {
		return noOfSongs;
	}

	public boolean getActing() {
		return acting;

	}

	public boolean getDances() {
		return dances;

	}

	public double getInvest() {
		return invest;

	}

	public boolean getOverAll() {
		return overAll;
	}

	public String getFavSong() {
		return favSong;
	}

	public int getNoOfComedians() {
		return noOfComedians;
	}

}
