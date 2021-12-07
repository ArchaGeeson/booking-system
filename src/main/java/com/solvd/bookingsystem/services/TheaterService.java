package com.solvd.bookingsystem.services;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.bookingsystem.bean.theatre.Screen;
import com.solvd.bookingsystem.bean.theatre.Seat;
import com.solvd.bookingsystem.bean.theatre.Theatre;
import com.solvd.bookingsystem.interfaces.ITheatre;

public class TheaterService implements ITheatre {
	private static Logger log = LogManager.getLogger(TheaterService.class.getName());
	
	private Map<Integer, String> theaters = new HashMap<Integer, String>();

	public Theatre createTheater(Theatre theatre) {
		log.info(theatre.getName());
		theaters.put(theatre.getId(), theatre.getName());
		log.info("Theater Info: " + theaters);
		return theatre;
	}

	public Screen createScreen(String screenName, Theatre theatre) {

		return null;
	}

	public Seat createSeat(Screen screen) {
		
		return null;
	}

}
