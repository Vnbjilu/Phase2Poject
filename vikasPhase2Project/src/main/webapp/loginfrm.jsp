<jsp:include page="mainHeader.jsp"></jsp:include>
<div align="center">
<form action="Main">
<table border="1">
<%
if(request.getAttribute("msg")!=null)
{
	String msg=(String)request.getAttribute("msg");

%>
<tr>
	<td colspan="2"> <%=msg %></td>
</tr>
<%
}
%>
<tr>
	<td colspan="2" align="center"> Login Form </td>
</tr>
<tr>
	<td> UserName : </td>
	<Td><input type="text" name="userName"></Td>
</tr>
<tr>
	<td> Password : </td>
	<td><input type="password" name="userPassword"></td>
</tr>
<tr>
	<Td colsapn="2" align="center">  <input type="submit" value="login"></Td>
</tr>

</table>
<input type="hidden" name="action" value="login">
</form>

</div>
<jsp:include page="mainFooter.jsp"></jsp:include>