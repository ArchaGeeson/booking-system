package com.solvd.bookingsystem.interfaces;

import com.solvd.bookingsystem.bean.profiles.User;
import com.solvd.bookingsystem.bean.theatre.Movie;
import com.solvd.bookingsystem.bean.theatre.Show;

public interface IBooking {
	void book(User userId, Show showId);

}
