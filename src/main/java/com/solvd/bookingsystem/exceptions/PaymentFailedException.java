package com.solvd.bookingsystem.exceptions;

public class PaymentFailedException extends Exception {

	public PaymentFailedException(String message) {
		super("Payment Failed...!");
		
	}
}
