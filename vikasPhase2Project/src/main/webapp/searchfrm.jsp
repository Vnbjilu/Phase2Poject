
<%@ page import="java.util.*,vikas.RatanRaman.Flight.*" %>
<%
FlightDao dao=new FlightDao();
List<String> data=dao.getFromLocation();
String From="<select name='From'><option value=''>Select</option>";
for(String tmp:data)
{

From+="<option value='"+tmp+"'>"+tmp+"</option>";
}
From+="</select>";

List<String> dat=dao.gettoLocation();
String To="<select name='To'><option value=''>Select</option>";
for(String tmp:dat)
{

To+="<option value='"+tmp+"'>"+tmp+"</option>";
}
To+="</select>";

%>
<div align="center" >
<form action="Main">
<table border="1" class="search">
<tr>
	<Td colspan="2"> Flight Searching </Td>
</tr>
<tr>
	<Td> From Location </Td>
	<td><%=From %></td>
</tr>
<tr>
	<Td> To Location</Td>
	<td> <%=To %>
</td>
<tr>
	<Td colspan=2"> <input type="submit" value="search Flight"> </Td>
</tr>
<input type="hidden" name="action" value="search">
</table>
</form>
</div>