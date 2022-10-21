<jsp:include page="FlightsHeader.jsp"></jsp:include>
<div align="center" class="content">
<form action="FlightPage">
<table border="1">
<tr>
	<td colspan="2"> Flight Adding Form</td>
</tr>
<tr>
	<Td> Flight Number</Td>
	<td><input type="text" name="flightNumber"></td>
</tr>
<tr>
	<td>Airline Name</td>
	<td><input type="text" name="airlineName"></td>
</tr>
<tr>
	<Td> From location </Td>
	<Td><input type="text" name="fromLocation"></Td>
</tr>
<tr>
	<Td> To Location </Td>
	<td><input type="text" name="toLocation"></td>
</tr>
<tr>
	<Td> ArrivalTime </Td>
	<td><input type="time" name="arrivalTime"></td>
</tr>
<tr>
	<Td> Departure Time</Td>
	<td><input type="time" name="departTime"></td>
</tr>
<tr>	
	<Td> Capcity</Td>
	<td><input type="text" name="capacity"></td>
</tr>
<tr>	
	<Td> Fair</Td>
	<td><input type="text" name="fair"></td>
</tr>
<tr>
	<td colspan="2"> <input type="submit" value="Add Flights"><input type="reset" value="Clear ">
	</td>
</tr>
<input type="hidden" name="action" value="AddFlight">
</table>
</form>
</div>
<jsp:include page="FlightsFooter.jsp"></jsp:include>

