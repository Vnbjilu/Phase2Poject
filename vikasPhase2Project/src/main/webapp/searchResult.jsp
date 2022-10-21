<jsp:include page="mainHeader.jsp"></jsp:include>


<%@page import="java.util.*,vikas.RatanRaman.Flight.*" %>
<%
List<Flights> flight=(List<Flights>)request.getAttribute("flight");

if(flight.isEmpty())
{
%>
<h1> Sorry No Record Found between Satations</h1>
<%
}
else
{
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
		<th> Operation</th>
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
		<th><a href="Main?action=book&value=<%=tmp.getFlightNumber()%>">Book Ticket</a></th>
		
	</tr>
			
	<%
	}
}
	%>
<jsp:include page="mainFooter.jsp"></jsp:include>