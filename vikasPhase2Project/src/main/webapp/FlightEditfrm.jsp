<jsp:include page="FlightsHeader.jsp"></jsp:include>
<div align="center" class="content">

<%@ page import="java.util.*,vikas.RatanRaman.Flight.*" %>
<% 
Flights flight=(Flights)request.getAttribute("flight");
%>
<form action="FlightPage">
<table border="1">
<tr>
	<td colspan="2"> Flight Editing Form</td>
</tr>
<tr>
	<Td> Flight Number</Td>
	<td><input type="text" name="flightNumber" value="<%= flight.getFlightNumber()%>"></td>
</tr>
<tr>
	<td>Airline Name</td>
	<td><input type="text" name="airlineName" value="<%=flight.getAirlineName()%>"></td>
</tr>
<tr>
	<Td> From location </Td>
	<Td><input type="text" name="fromLocation" value="<%=flight.getFromLocation()%>"></Td>
</tr>
<tr>
	<Td> To Location </Td>
	<td><input type="text" name="toLocation" value=" <%= flight.getToLocation()%>"></td>
</tr>
<tr>
	<Td> ArrivalTime </Td>
	<td><input type="time" name="arrivalTime" value="<%= flight.getArrivalTime()%>"></td>
</tr>
<tr>
	<Td> Departure Time</Td>
	<td><input type="time" name="departTime" value="<%= flight.getDepartTime()%>"></td>
</tr>
<tr>	
	<Td> Capcity</Td>
	<td><input type="text" name="capacity" value="<%= flight.getCapacity()%>"></td>
</tr>
<tr>	
	<Td> Fair</Td>
	<td><input type="text" name="fair" value="<%= flight.getFair()%>"></td>
</tr>
<tr>
	<td colspan="2"> <input type="submit" value="Add Flights"><input type="reset" value="Clear ">
	</td>
</tr>
<input type="hidden" name="action" value="UpdateFlight">
</table>
</form>
</div>
<jsp:include page="FlightsFooter.jsp"></jsp:include>