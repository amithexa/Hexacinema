<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
}

.navbar {
  overflow: hidden;
  background-color: #0000FF;
}

.navbar a {
  float: left;
  font-size: 16px;
  color: #800080;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: #800080;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: #800080;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #800080;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: blue;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

.dropdown:hover .dropdown-content {
  display: block;
}
</style><link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
}

.navbar {
  overflow: hidden;
  background-color: #333;
}

.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

.dropdown:hover .dropdown-content {
  display: block;
}
</style>
<title>Insert title here</title>
</head>
<body background = "background.jpg">
<div class="navbar">
  <a href="#home">Home</a>
  <a href=/Contactus>Contact Us</a>
  <div align="right" class="dropdown">
    <button  class="dropbtn">${name}
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">View profile</a>
      <a href="#">Services</a>
      <a href="#">History</a>
      <a href="/logout">Logout</a>
    </div>
  </div> 
</div>
<h1><b>Movie Details</b></h1>
	<img src="${u.moviesrc}" height=300 width=300></img>
		<form action="/Book" method="post">
		<table>
		<tr>
		<td><p><b>Movie Name : </b></p></td>
		<td><p><b>${u.moviename} </b></p></td>
		</tr>
		<tr>
	
		<td><p><b>Genre : </b></p></td>
		<td><p><b> ${u.moviegenre}</b></p></td>
		</tr>
		<tr>
		<td><p><b>Cast : </b></p></td>
		<td><p><b>${u.moviecast}</b></p></td>
		</tr>
		<tr>
		<td><p><b>Release Date : </b></p></td>
		<td><p><b>${u.moviedate}</b></p></td>
		</tr>
		<tr>
		<td><b>Select Date:</b></td>
		<td>
		<select id="date" name="date">
	      <option value="${u.showdate1}">${u.showdate1}</option>
	      <option value="${u.showdate2}">${u.showdate2}</option>
	     
	    </select> </td> <br>
	    </tr>
	    <tr>
	    <td><b>Select Time:</b></td>
	    <td>
	    <select id="time" name="time">
	      <option value="${u.showtime1}">${u.showtime1}</option>
	      <option value="${u.showtime2}">${u.showtime2}</option>
	    </select></td> <br>
	    </tr>
	    <tr>
		<td><input type = "submit" value = "Proceed"></td>
		</tr>
		</table>
		</form>
</body>
</html>