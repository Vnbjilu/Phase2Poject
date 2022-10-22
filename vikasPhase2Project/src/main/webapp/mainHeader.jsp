<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Airline Booking Portal</title>
<link rel="stylesheet" type="text/css" href="css/home.css?version=58"/>
<link rel="stylesheet" type="text/css" href="css/main.css?version=58"/>
</head>
<body class="homepage">

<marquee class="motion"> Welcome To Airline Booking Portal</marquee>
<table  class="tablenav">
<tr>
	<td><a href="index.jsp">Home</a></td>
	<Td><a href="Main?action=flights">Flights</a></Td>
	<td><a href="">Booking</a></td>
	<td><a href="Main?action=searchFrm">Searching</a></td>
	<%
	session=request.getSession();
	if(session.getAttribute("userName")!=null)
	{
	%>
	<td><a href="Main?action=logout">Logout</a></td>
	<%
	}
	%>
</tr>
</table>