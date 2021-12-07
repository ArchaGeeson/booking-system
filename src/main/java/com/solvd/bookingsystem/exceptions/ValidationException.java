package com.solvd.bookingsystem.exceptions;

public class ValidationException extends Exception {
	
	public ValidationException(String message) {
		super("Not valid...");
	}
}
