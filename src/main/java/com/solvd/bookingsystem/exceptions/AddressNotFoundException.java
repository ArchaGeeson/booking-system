package com.solvd.bookingsystem.exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AddressNotFoundException extends Exception {

	public AddressNotFoundException(String message) {
		super("Address not found!");
	}
}
