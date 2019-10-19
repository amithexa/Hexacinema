package com.hexaware.HexaCinemas.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_history")
public class OrderHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "ticketno")
	private int ticketno;
	private int userid;
	private int movieid;
	private String moviename;
	private Time showtime;
	private Date showdate;
	private int totalseats;
	private int seatno;
	
	public OrderHistory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderHistory(int ticketno, int userid, int movieid, String moviename, Time showtime, Date showdate,
			int totalseats, int seatno) {
		super();
		this.ticketno = ticketno;
		this.userid = userid;
		this.movieid = movieid;
		this.moviename = moviename;
		this.showtime = showtime;
		this.showdate = showdate;
		this.totalseats = totalseats;
		this.seatno = seatno;
	}

	public int getTicketno() {
		return ticketno;
	}

	public void setTicketno(int ticketno) {
		this.ticketno = ticketno;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

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

	public Time getShowtime() {
		return showtime;
	}

	public void setShowtime(Time showtime) {
		this.showtime = showtime;
	}

	public Date getShowdate() {
		return showdate;
	}

	public void setShowdate(Date showdate) {
		this.showdate = showdate;
	}

	public int getTotalseats() {
		return totalseats;
	}

	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}

	public int getSeatno() {
		return seatno;
	}

	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}
	

}
