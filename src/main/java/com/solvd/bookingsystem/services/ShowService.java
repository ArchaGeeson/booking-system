package com.solvd.bookingsystem.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.bookingsystem.bean.theatre.Entertainment;
import com.solvd.bookingsystem.bean.theatre.Movie;
import com.solvd.bookingsystem.bean.theatre.Screen;
import com.solvd.bookingsystem.bean.theatre.Show;
import com.solvd.bookingsystem.exceptions.ScreenAlreadyOccupiedException;
import com.solvd.bookingsystem.exceptions.ShowNotFoundException;
import com.solvd.bookingsystem.interfaces.IShow;

public class ShowService implements IShow {

	private static Logger log = LogManager.getLogger(ShowService.class.getName());

	private final Map<String, Show> shows;

	public ShowService() {
		this.shows = new HashMap<>();
	}

	public Show getShow(String showId, Movie movie) throws ShowNotFoundException {
		log.info("Getting show for the movie: " + movie.getTitle());
		if (!shows.containsKey(showId)) {

			throw new ShowNotFoundException();
		}
		return shows.get(showId);
	}

	private List<Show> getShowsForScreen(final Screen screen) {
		final List<Show> response = new ArrayList<>();
		for (Show show : shows.values()) {
			if (show.getShowPlayedAt().equals(screen)) {
				response.add(show);
			}
		}
		return response;
	}

	public Show createShow(Entertainment entertainment, Screen screen, Date showStartTime)
			throws ScreenAlreadyOccupiedException {
		try {
			if (!checkIfShowCreationAllowed(screen, showStartTime)) {
				throw new ScreenAlreadyOccupiedException();
			}
		} catch (ScreenAlreadyOccupiedException e) {
			// TODO Auto-generated catch block

			log.error(e.getMessage());
		}
		String showId = "show10001";
		Show show = new Show(showId, entertainment, screen, showStartTime);
		this.shows.put(showId, show);
		return show;
	}

	private boolean checkIfShowCreationAllowed(Screen screen, Date showStartTime) {

		return true;
	}

	public void updateShowInfo() {
		// TODO Auto-generated method stub

	}

	public void deleteShow() {
		// TODO Auto-generated method stub

	}

	/*
	 * private boolean isShowAvailable; public void getShowInfo(Show show, Movie
	 * movie) throws ShowNotFoundException {
	 * 
	 * // MovieService m = new MovieService(); log.info("Movie Details: " + movie);
	 * log.info("Getting show for the movie: " + movie.getTitle()); if
	 * (!isShowAvailable) { log.info("Please book a seat now for the show"); } else
	 * { throw new ShowNotFoundException();
	 * 
	 * } }
	 */

}
