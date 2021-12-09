package com.solvd.bookingsystem.util;

import java.util.Arrays;
import java.util.List;

import com.solvd.bookingsystem.bean.profiles.Admin;
import com.solvd.bookingsystem.bean.theatre.Concert;
import com.solvd.bookingsystem.bean.theatre.Movie;

public class DataCollection {
	
	
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
	
	public static List<Admin> getAdmins(String name){
		Admin admin1 = new Admin("Rose", 20001);
		Admin admin2 = new Admin("Jude", 20002);
		Admin admin3 = new Admin("Ryan", 20003);
		Admin admin4 = new Admin("Tucker", 20004);
		Admin admin5 = new Admin("Sonia", 20005);
		Admin admin6 = new Admin("Ruth", 20006);
		return Arrays.asList(admin1, admin2, admin3, admin4, admin5, admin6);
	}
	
	public static List<Concert> getConcerts(String artistName){
		
		Concert redByTaylor = new Concert("Taylor Swift", "Red");
		Concert fearlessByTaylor = new Concert("Taylor Swift", "Fearless");
		Concert speakNowByTaylor = new Concert("Taylor Swift","Speak Now");
		return Arrays.asList(redByTaylor,redByTaylor,speakNowByTaylor);
		
	}
	
	


}
