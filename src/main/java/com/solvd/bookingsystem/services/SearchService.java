package com.solvd.bookingsystem.services;

import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.bookingsystem.bean.Search;
import com.solvd.bookingsystem.bean.theatre.Movie;
import com.solvd.bookingsystem.interfaces.ISearch;

public class SearchService implements ISearch {

	private static Logger log = LogManager.getLogger(SearchService.class.getName());

	public Movie search(Search searchType) {

		Movie movie = new Movie();

		log.info("Please enter the search criteria...");

		if ("Title".equalsIgnoreCase(searchType.getSearchFilterType())) {

			log.info("Searching by " + searchType.getSearchFilterType());

		} else {
			log.info("Ivalid search type...Please check again...");
		}
		return movie;

	}

	public void display(Iterator<Movie> movieList) {

	}

}
