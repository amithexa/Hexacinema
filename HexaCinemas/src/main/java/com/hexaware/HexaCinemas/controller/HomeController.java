package com.hexaware.HexaCinemas.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.sql.Date;
import java.sql.Time;
import java.util.Random;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hexaware.HexaCinemas.model.MovieDetails;
import com.hexaware.HexaCinemas.model.OrderHistory;
import com.hexaware.HexaCinemas.model.UserDetails;
import com.hexaware.extra.QRCodeGenerator;

@Controller
public class HomeController {
	
	@Autowired
	UserInterface userinf;
	@Autowired
	MovieInterface movinf;
	@Autowired
	OrderHistoryInterface ordinf;
	
	/*Home Page*/
	@RequestMapping("/")
	public String Home() {
		return "Home";
	}
	
	/*Register Page*/
	@RequestMapping("/register") 	
	public String register(UserDetails user) {
		return "register";
	}
	
	/*Saving User Details After Registration*/
	@RequestMapping("/save")
	public String store(UserDetails user) {
		userinf.save(user);
		return "login";
	}
	
	/*login validating user details*/
	@RequestMapping("/login")
	public String login(String useremail,String userpwd, HttpSession session) {
		UserDetails user = userinf.findUser(useremail,userpwd); 
		System.out.println(user.getUsername());
		if(user != null) {
			session.setAttribute("name", user.getUsername());
			session.setAttribute("user", user);
			return "ShowMovie";
		} 
		return "register";
	}
	/*Fetch movie Details*/
	@RequestMapping("/Dhoni")
	public String Dhoni (HttpSession session){
	System.out.println("Inside Home Controller");
	MovieDetails movie = movinf.findById(1).orElse(new MovieDetails());
	session.setAttribute("u", movie);
	return "MovieDetails";		
}
	/*Fetch movie Details*/
	@RequestMapping("/Arjun")
	public String Arjun(HttpSession session){
	System.out.println("Inside Home Controller");
	MovieDetails movie = movinf.findById(2).orElse(new MovieDetails());
	session.setAttribute("u", movie);
	return "MovieDetails";		
}
	/*Fetch movie Details*/
	@RequestMapping("/Pursuit")
	public String Pursuit(HttpSession session){
	System.out.println("Inside Home Controller");
	MovieDetails movie = movinf.findById(3).orElse(new MovieDetails());
	session.setAttribute("u", movie);
	return "MovieDetails";		
}
	/*Fetch movie Details*/
	@RequestMapping("/Chhichhore")
	public String Chhichhore(HttpSession session){
	System.out.println("Inside Home Controller");
	MovieDetails movie = movinf.findById(4).orElse(new MovieDetails());
	session.setAttribute("u", movie);
	return "MovieDetails";		
}
	/*Fetch movie Details*/
	@RequestMapping("/Kabali")
	public String Kabali(HttpSession session){
	System.out.println("Inside Home Controller");
	MovieDetails movie = movinf.findById(5).orElse(new MovieDetails());
	session.setAttribute("u", movie);
	return "MovieDetails";		
}
	/*Fetch movie Details*/
	@RequestMapping("/Joker")
	public String Joker(HttpSession session){
	System.out.println("Inside Home Controller");
	MovieDetails movie = movinf.findById(6).orElse(new MovieDetails());
	session.setAttribute("u", movie);
	return "MovieDetails";		
}
	/*To Display The Movie Book Details*/
	@RequestMapping("/Book")
	public String BookMovie(String time, String date,HttpSession session) {
		session.setAttribute("date", date);
		session.setAttribute("time", time);
		return "BookMovie";
	}
	
	/*To Select The Seat*/
	@RequestMapping("/SelectSeat")
	public String SelectSeat() {
		
		return "SelectSeat";
	}
	
	/*Confirming Ticket Amount*/
	@RequestMapping("/Confirm")
	public String BookTicket(String seats,HttpSession session) {
		int seatno = Integer.parseInt(seats);
		int amount = (seatno*200);
		session.setAttribute("seatno",seatno);
		session.setAttribute("amount", amount);
		return "Confirm";
	}
	
	@RequestMapping("/Booked")
	public String History(HttpSession session) {
		Random random = new Random();
		UserDetails user = (UserDetails)session.getAttribute("user");
		MovieDetails movie = (MovieDetails) session.getAttribute("u");
		int userid = user.getUserid();
		String username = user.getUsername();
		int movieid = movie.getMovieid();
		String moviename = movie.getMoviename();
		String date = (String)session.getAttribute("date");
		Date showdate = Date.valueOf(date);
		String time =(String)session.getAttribute("time");
		Time showtime = Time.valueOf(time);
		int seatno = (int)session.getAttribute("seatno");
		int seatnumber = random.nextInt(100);
		session.setAttribute("seatnumber", seatnumber);
		OrderHistory order = null;
		order=new OrderHistory(-1, userid, movieid, moviename, showtime, showdate, seatno, seatnumber);
		ordinf.save(order);
		QRCodeGenerator getqr = new QRCodeGenerator();
		getqr.getQrCode(username, moviename, showdate, showtime, seatnumber);
		return "TicketBooked" ;
	}
	/*For Logging Out*/
	@RequestMapping("/logout")
	public String Logout(HttpSession session) {
		session.invalidate();
		return "Home";
	}
	
	/*The Contact Us Page*/
	@RequestMapping("/Contactus")
	public String Contact(HttpSession session) {
		session.invalidate();
		return "Contactus";
	}
}

