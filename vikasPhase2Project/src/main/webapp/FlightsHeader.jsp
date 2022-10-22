<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/main.css?version=34">
<title>Insert title here</title>
</head>
<%
session=request.getSession();
if(session.getAttribute("userName")==null)
	request.getRequestDispatcher("loginfrm.jsp").forward(request, response);

%>
<body class="userpage">
<table  class="tablenav">
<tr>
	<Td><a href="index.jsp">Home</a></Td>
	<Td><a href="FlightPage?action=Addfrm">Add Flights</a></Td>
	
	<td><a href="FlightPage?action=Displayfrm">Display Flights</a></td>
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
