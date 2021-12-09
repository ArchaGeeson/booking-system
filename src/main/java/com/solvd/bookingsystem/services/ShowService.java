package com.solvd.bookingsystem.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.bookingsystem.bean.theatre.Entertainment;
import com.solvd.bookingsystem.bean.theatre.Movie;
import com.solvd.bookingsystem.bean.theatre.Screen;
import com.solvd.bookingsystem.bean.theatre.Show;
import com.solvd.bookingsystem.exceptions.ScreenAlreadyOccupiedException;
import com.solvd.bookingsystem.exceptions.ShowNotFoundException;
import com.solvd.bookingsystem.interfaces.IShow;

public class ShowService<T> implements IShow<T> {

	private static Logger log = LogManager.getLogger(ShowService.class.getName());

	private final Map<String, Show> shows;

	public ShowService() {
		this.shows = new HashMap<>();
	}

	// Optional
	public Show getShow(Show show) {
		Optional<Integer> isShowAvailable = Optional.ofNullable(show.getShowId());

		try {
			log.info(isShowAvailable.orElseThrow(() -> new ShowNotFoundException()));
		} catch (ShowNotFoundException e) {
			log.error(e.getMessage());
		}
		return show;

	}

	public List<Show> getShowsForScreen(List<Show> showsForScreen, Consumer<Screen> screen) {

		showsForScreen.stream().forEach(show -> {
			if (show.getShowPlayedAt().equals(screen)) {
				showsForScreen.add(show);
			}
		});
		return showsForScreen;
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
		Show show = new Show();
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

	@Override
	public void playShow(T show) {
		// TODO Auto-generated method stub

	}

}
