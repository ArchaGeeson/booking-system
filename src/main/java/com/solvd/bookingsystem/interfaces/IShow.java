package com.solvd.bookingsystem.interfaces;

import java.util.Date;

import com.solvd.bookingsystem.bean.theatre.Entertainment;
import com.solvd.bookingsystem.bean.theatre.Movie;
import com.solvd.bookingsystem.bean.theatre.Screen;
import com.solvd.bookingsystem.bean.theatre.Show;
import com.solvd.bookingsystem.exceptions.ScreenAlreadyOccupiedException;

public interface IShow<T> {
	
	void playShow(T show);
	void updateShowInfo();
	void deleteShow();
	

}
