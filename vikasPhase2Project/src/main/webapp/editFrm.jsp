<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,vikas.RatanRaman.User.*" %>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
User user=(User)request.getAttribute("user");
String userRole=(String)request.getAttribute("userRole");
%>
<div align="Center">
<form action="UserPage" method="Post">
<table border="1">
<tr>
	<td colspan="2">User Edit Form</td>
</tr>
<tr>
	<td> USer Id</td>
	<td><input type="text" name="userId" value="<%=user.getUserId() %>" readonly="readonly"></td>
</tr>
<tr>
	<Td> UserName</Td>
	<td><input type="text" name="userName" value="<%=user.getUserName() %>"></td>
</tr>
<tr>
	<Td> Password</Td>
	<td><input type="password" name="userPassword" value="<%=user.getUserPassword()%>"></td>
</tr>
<tr>
	<Td> User Role</Td>
	<td> <%=userRole %></td>
</tr>

<tr>
	<Td colspan="2"> <input type="submit" value="Update Record"><input type="reset" value="reset">
	</Td>
<input type="hidden" name="action" value="update">
	
	
	
	
</table>
</form>
</div>
</body>
</html>