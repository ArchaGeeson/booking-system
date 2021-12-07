package com.solvd.bookingsystem.exceptions;

public class ShowNotFoundException extends Exception {
	public ShowNotFoundException() {
		super("Cannot find the show. Please check the movie");
	}
}
