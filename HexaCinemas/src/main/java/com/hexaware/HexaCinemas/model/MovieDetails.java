package com.hexaware.HexaCinemas.model;

import java.sql.Date;
import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MovieDetails {
	
	@Id
	@Column(name="movieid")
	private int movieid;
	
	private String moviename;
	private String moviegenre;
	private String moviecast;
	private String moviesrc;
	private Date moviedate;
	private Date showdate1;
	private Date showdate2;
	private Time showtime1;
	private Time showtime2;
	
	
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getMoviegenre() {
		return moviegenre;
	}
	public void setMoviegenre(String moviegenre) {
		this.moviegenre = moviegenre;
	}
	public String getMoviecast() {
		return moviecast;
	}
	public void setMoviecast(String moviecast) {
		this.moviecast = moviecast;
	}
	public String getMoviesrc() {
		return moviesrc;
	}
	public void setMoviesrc(String moviesrc) {
		this.moviesrc = moviesrc;
	}
	public Date getMoviedate() {
		return moviedate;
	}
	public void setMoviedate(Date moviedate) {
		this.moviedate = moviedate;
	}
	public Date getShowdate1() {
		return showdate1;
	}
	public void setShowdate1(Date showdate1) {
		this.showdate1 = showdate1;
	}
	public Date getShowdate2() {
		return showdate2;
	}
	public void setShowdate2(Date showdate2) {
		this.showdate2 = showdate2;
	}
	public Time getShowtime1() {
		return showtime1;
	}
	public void setShowtime1(Time showtime1) {
		this.showtime1 = showtime1;
	}
	public Time getShowtime2() {
		return showtime2;
	}
	public void setShowtime2(Time showtime) {
		this.showtime2 = showtime;
	}
	
}
