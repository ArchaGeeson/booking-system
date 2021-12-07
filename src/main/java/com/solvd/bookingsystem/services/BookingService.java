package com.solvd.bookingsystem.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.bookingsystem.bean.Booking;
import com.solvd.bookingsystem.bean.Ticket;
import com.solvd.bookingsystem.bean.theatre.Show;
import com.solvd.bookingsystem.exceptions.SeatsAlreadyOccupiedException;

public class BookingService {

	private static Logger log = LogManager.getLogger(BookingService.class.getName());

	private static HashMap<String,ArrayList<Show>> movieMap;

	private Map<String, Booking> showBookings;
	private Set<Integer> bookingID = new HashSet<Integer>();

	private boolean isSeatAvailbale;
	
	/*
	 * public static ArrayList<Show> searchShows(String name){ if
	 * (movieMap.containsKey(name)){ return movieMap.get(name); } else return null;
	 * }
	 */
	
	public void displayAvailableSeats() {
		
	}

	public void bookingShow(Show show) throws SeatsAlreadyOccupiedException {

		if (!isSeatAvailbale) {
			log.info("Show Time: " + show.getShowStartTime());
			
			log.info("Confirm seats for: " + show.getEntertainment());

		} else {
			throw new SeatsAlreadyOccupiedException();
		}
	}
	
	public void invoice(Booking booking) {
		 Ticket ticket = new Ticket();
		 
	}

}
