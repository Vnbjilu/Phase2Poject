<jsp:include page="FlightsHeader.jsp"></jsp:include>
<div class="content">
<%@ page import="java.util.*,vikas.RatanRaman.Flight.*" %>
<%
List<Flights> flight=new FlightDao().displayAll();

%>
<table border="1" class="data" style="width:90%;text-align:center;color:white">
<tr>
	<th colspan="11"> Flight Details</th>
</tr>
<tr>
	<th> S.No</th>
	<th> Airline Name</th>
	<th> Flight Number</th>
	<th> From </th>
	<th> To </th>
	<th> Arrival Timining </th>
	<th> Depart Timing </th>
	<th> Capacity</th>
	<th> Fair</th>
	<th colspan="2"> Operation</th>
</tr>

<%
int cn=1;
for(Flights tmp:flight)
{
%>	
<tr>
	<th><%=cn++  %></th>
	<th><%= tmp.getAirlineName()%></th>
	<th><%= tmp.getFlightNumber()%></th>
	<th><%=tmp.getFromLocation() %></th>
	<th><%=tmp.getToLocation() %></th>
	<th><%=tmp.getArrivalTime() %></th>
	<th><%=tmp.getDepartTime() %></th>
	<th><%=tmp.getCapacity() %></th>
	<th><%=tmp.getFair() %></th>
	<th><a href='FlightPage?action=editFlights&value=<%=tmp.getFlightNumber()%>'>Edit </a></th>
	<th><a href='FlightPage?action=deleteFlights&value=<%=tmp.getFlightNumber()%>' onclick="return confirm('Are you sure, you want to delete it?')">Delete </a></th>
	
</tr>
		
<%
}
%>
</table>
</div>
<jsp:include page="FlightsFooter.jsp"></jsp:include>