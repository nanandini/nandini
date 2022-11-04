package com.xworkz.encapsulation.type;

public class MovieInsidePackage {
	public String otherMovieName = "JAMES";
	public Movie movie;

	public void use(Movie movie) {

		System.out.println("entering the GANDADAGUDI informations");

        movie.setMovie("GANDADA GUDI", "APPU AMARA","ASHWINI PUNEETHRAJKUMAR", 3, 5,true , true, 98.000, true, "NINADE NENAU DENAVU MANADALLI", 2);
		System.out.println(otherMovieName);
		System.out.println(movie.name);
		System.out.println(movie.heroName);
		System.out.println(movie.heroine);
		System.out.println(movie.noOfDailague);
		System.out.println(movie.noOfSongs);
		System.out.println(movie.acting);
		System.out.println(movie.dances);
		System.out.println(movie.invest);
		System.out.println(movie.overAll);
		System.out.println(movie.favSong);
		System.out.println(movie.noOfComedians);
	}

}



