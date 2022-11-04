package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.type.Sports;
import com.xworkz.encapsulation.type.SportsInsidePackage;

public class SportsRunner {

	public static void main(String[] args) {
		SportsInsidePackage sportsInsidePackage = new SportsInsidePackage();
		sportsInsidePackage.display();
		Sports player = new Sports();
		player.setFavGame("KHO-KHO");
		System.out.println(player.getFavGame());
		player.setGameName("Shuttle cock");
		System.out.println(player.getGameName());

	}

}
