package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.type.Movie;

import com.xworkz.encapsulation.type.MovieInsidePackage;

public class MovieRunner {

	public static void main(String[] args) {
		MovieInsidePackage movieIn = new MovieInsidePackage();
		Movie movie = new Movie();
		movieIn.use(movie);
		System.out.println(movie.getHeroName());

	}

}
