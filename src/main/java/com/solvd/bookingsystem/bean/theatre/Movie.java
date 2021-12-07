package com.solvd.bookingsystem.bean.theatre;

import java.util.List;

public class Movie<T> extends Entertainment {
	private String title;
	private String director;
	private double ratings;
	private List<String> writers;
	private List<String> cast;

	public Movie() {

	}

	public Movie(String title, String genre) {
		super(genre);
		this.title = title;

	}
	
	public Movie(String title, String director, double rating, String genre) {
		super(genre);
		this.title = title;
		this.director = director;
		this.ratings = rating;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	public List<String> getWriters() {
		return writers;
	}

	public void setWriters(List<String> writers) {
		this.writers = writers;
	}

	public List<String> getCast() {
		return cast;
	}

	public void setCast(List<String> cast) {
		this.cast = cast;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", ratings=" + ratings + ", writers=" + writers
				+ ", cast=" + cast + "]";
	}

	
	
	

}
