package com.solvd.bookingsystem.exceptions;

public class ScreenAlreadyOccupiedException extends Exception {
	public ScreenAlreadyOccupiedException() {
		super("Screen is no longer available...Please try another screen...");
	}
}
