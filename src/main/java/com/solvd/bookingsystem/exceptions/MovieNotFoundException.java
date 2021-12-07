package com.solvd.bookingsystem.exceptions;

public class MovieNotFoundException extends Exception {
	
	public MovieNotFoundException() {
		super("Cannot find the movie. Please check the spelling");
	}

}
