package com.solvd.bookingsystem.interfaces;

import com.solvd.bookingsystem.bean.Search;
import com.solvd.bookingsystem.bean.theatre.Entertainment;

public interface ISearch {
	 Entertainment search(Search searchType);
}
