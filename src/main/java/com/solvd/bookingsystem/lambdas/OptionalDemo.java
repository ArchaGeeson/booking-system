package com.solvd.bookingsystem.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.bookingsystem.bean.theatre.Movie;

public class OptionalDemo {

	private static Logger log = LogManager.getLogger(OptionalDemo.class.getName());

	

	private static void findMovie(List<Movie> movies) {
		Optional<Movie> result = movies.stream().filter(movie-> movie.getRatings() >= 7.0).findFirst();
		log.info(result);
		
		if(result.isPresent()) {
			log.info("result: "+result.get());
		}else {
			log.info("Not found!");
		}
	}

	

	public static void main(String[] args) {
		List<Movie> movieList = new ArrayList<>();
		movieList.addAll(MovieCollection.getMovies("Action"));
		System.out.println(movieList);
		
		findMovie(movieList);
	}
	

}
	
