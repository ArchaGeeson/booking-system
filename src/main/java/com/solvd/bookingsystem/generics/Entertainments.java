package com.solvd.bookingsystem.generics;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.bookingsystem.bean.theatre.Entertainment;

public class Entertainments<T extends Entertainment> {

	private static Logger log = LogManager.getLogger(Entertainments.class.getName());

	public List<T> getAllEntertainments() {

		return null;
	}

}
