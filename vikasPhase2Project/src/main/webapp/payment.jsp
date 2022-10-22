<jsp:include page="mainHeader.jsp"></jsp:include>
<div align="Center">
<%@ page import="vikas.RatanRaman.Booking.*" %>
<%
BookingDetails details=(BookingDetails)request.getAttribute("details");
%>
<form action="Booking" method="post">
<table border="1">
<tr>
	<Td colspan="2" align="center"> Payment Page</Td>
</tr>
<tr>
	<Td> Booking Id</Td>
	<td><input type="text" name="bookingId" value="<%=details.getBookingId() %>"></td>
<tr>
	<Td> Account Number </Td>
	<td> <input type="text" name="accountNumber" required></td>
</tr>
<tr>
	<td> Bank Number</td>
	<td><input type="text" name="bankName" required></td>
</tr>
<tr>
	<Td> Amount to be Paid</Td>
	<td><input type="text" name="fare" value="<%=details.getFair()%>"></td>
</tr>
<tr>
	<td> Customer Name</td>
	<td> <input type="text" name="customerName" value="<%=details.getCustomerName()%>"></td>
</tr>
<tr>
	<Td> FlightNumber </Td>
	<td><input type="text" name="flightNumber" value="<%=details.getFlightNumber()%>"></td>
</tr>
	<Td> Journey Date </Td>
	<td><input type="date" name="bookingDate" value="<%=details.getBookingDate()%>"></td>
</tr>
<tr>
	<td> DepartTime</td>
	<td><input type="text" name="departTime" value="<%=details.getDepartTime()%>"></td>
</tr>
<tr>
	<td colspan="2"><input type="submit" value="payAmount"></td>
<input type="hidden" name="action" value="payAmount">
</table>
</form>
</div>
<jsp:include page="mainFooter.jsp"></jsp:include>