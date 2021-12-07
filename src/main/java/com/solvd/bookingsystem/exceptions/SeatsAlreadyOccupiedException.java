package com.solvd.bookingsystem.exceptions;

public class SeatsAlreadyOccupiedException extends Exception {

	public SeatsAlreadyOccupiedException() {
		super("Seats are no longer available to book...Please try another show...");
	}
}
