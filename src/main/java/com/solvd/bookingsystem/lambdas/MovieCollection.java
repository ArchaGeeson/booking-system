package com.solvd.bookingsystem.lambdas;

import java.util.Arrays;
import java.util.List;

import com.solvd.bookingsystem.bean.theatre.Movie;

public class MovieCollection {
	
	public static List<Movie> getMovies(String keyword) {
		Movie m1 = new Movie("Ironman", "Jon Favreau", 7.9, "Action");
		Movie m2 = new Movie("Spiderman", "Jon Watts", 7.3, "Action");
		Movie m3 = new Movie("Joker", "Todd Phillips", 8.4, "Crime");
		Movie m4 = new Movie("Titanic", "James Cameron", 7.9, "Romance");
		Movie m5 = new Movie("Little women", "Clare Niederpruem", 5.2, "Drama");
		Movie m6 = new Movie("Heidi", "Alain Gsponer", 7.5, "Family/Drama");
		Movie m7 = new Movie("The Matrix", "Lana Wachowski, Lilly Wachowski", 8.7, "Sci-Fi");
		Movie m8 = new Movie("The Sixth Sense", " M. Night Shyamalan", 8.1, "Thriller");

		return Arrays.asList(m1, m2, m3, m4, m5, m6, m7, m7, m8);

	}


}
