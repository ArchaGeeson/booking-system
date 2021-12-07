package com.solvd.bookingsystem.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.bookingsystem.bean.theatre.Movie;

public class MovieService {
	private static Logger log = LogManager.getLogger(MovieService.class.getName());

	public Movie createMovie(Movie movie) {
		return movie;
	}

	public Movie getMovie(Movie movie) {
		MovieService movieService = new MovieService();
		movie.getTitle();
		return movie;

	}

}
