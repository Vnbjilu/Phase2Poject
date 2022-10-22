<jsp:include page="mainHeader.jsp"></jsp:include>
<%@ page import="vikas.RatanRaman.Booking.*,java.util.*" %>
<%
String msg=(String)request.getAttribute("msg");
int id=(int)request.getAttribute("id");
Payment p=new PaymentDao().getTicket(id);


%>
<div align="Center" class="content">
<table border="1" style="width:90%" class="ticket">
<tR>
	<td>Dear <%=p.getCustomerName()%> </td>
</tR>
<tr>
	<td>your Payment  Id =<%=p.getPaymentId() %></td>
</tr>
<tr>
<Td>and Booking id=<%=p.getBookingId() %></Td></tr>
	<tr><td>Flight Number =<%=p.getFlightNumber() %></td></tr>
	<tr><td> Booking Date=<%=p.getBookingDate() %></td></tr>
	<tr><td> Your Flight Time: <%=p.getDepartTime() %> -> Kindly Reach 1 hour before Departure  Time at Airpot</td></tr>
	<tr><th> Note: Kindly Note all the informaton for future References</th></tr>
	<tr><th> Thanks for Visiting Your Website .......</th></tr>
	<tr><th> Have a Nice day........ Visit again </th></tr>
	 
</table>

</div>
<jsp:include page="mainFooter.jsp"></jsp:include>