<jsp:include page="mainHeader.jsp"></jsp:include>
<%@ page import="vikas.RatanRaman.Flight.*,java.util.*" %>
<%
Flights flight=(Flights)request.getAttribute("flight");
%>
<div class="content" align="center">
<form action="Booking">
<table>
<tr align="center">
	<td colspan="2"> Booking Page </td>
</tr>
<tr>
	<td>Booking Date</td>
	<Td><input type="date" name="bookingDate"></Td>
</tr>
<tr>
	<Td>Customer Name</Td>
	<td><input type="text" name="customerName"></td>
</tr>
<tr>
	<td> Customer Email</td>
	<td><input type="email" name=customerEmail"></td>
</tr>
<tr>
	<Td> Customer Contact</Td>
	<td><input type="text" name="customerContact"></td>
</tr>
<tr>
	<td>Flight Number</td>
	<td><input type="text" name="flightNumber" value="<%=flight.getFlightNumber()%>"></td>
</tr>
<tr>
	<td> From </td>
	<td> <input type="text" name="from" value="<%=flight.getFromLocation()%>"></td>
</tr>
<tR>
	<td> To</td>
	<td><input type="text" name="to" value="<%=flight.getToLocation()%>"></td>
</tR>
<tr>
	<Td>Fare</Td>
	<td><input type="text" name="fare" value="<%=flight.getFair() %>"></td>
</tr>
<tr>
	<td> Depart Time</td>
	<td><input type="text" name="departTime" value="<%=flight.getDepartTime() %>"></td>
</tr>
<tR>
	<Td colspan="2"> <input type="submit" value="next"></Td></tR> 
  </table>
  <input type="hidden" name="action" value="Add">
</form>
</main>

<jsp:include page="mainFooter.jsp"></jsp:include>