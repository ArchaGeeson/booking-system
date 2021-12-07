package com.solvd.bookingsystem.exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BookingFailedException extends Exception {
	private static Logger log = LogManager.getLogger(BookingFailedException.class.getName());

	public BookingFailedException(String message) {
		super("Booking failed...Try Again!");
		log.debug("Failed Booking Attempt...");
	}

}
