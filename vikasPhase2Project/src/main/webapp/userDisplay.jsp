<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,vikas.RatanRaman.User.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/main.css?version=34">
<title>Insert title here</title>
</head>
<body>
<%
List<User> user=new UserDao().display();

%>
<table border="1" class="data" style="width:90%;text-align:center;color:white">
<tr>
	<td colspan="7"> User Record</td>
</tr>
<tr>
	<th> S.No.</th>
	<th> User Id</th>
	<th> UserName</th>
	<th> UserPassword</th>
	<th> UserRole</th>
	<th colspan="2">Operation</th>
</tr>
<%
int cn=1;
for(User tmp:user)
{
	

%>
<tr>
	<td><%=cn++ %></td>
	<td><%=tmp.getUserId() %></td>
	<td><%=tmp.getUserName() %></td>
	<td><%=tmp.getUserPassword() %></td>
	<td><%=tmp.getUserRole() %></td>
	<td><a href="UserPage?action=edit&userId=<%=tmp.getUserId()%>">Edit</a>
	<td><a href="UserPage?action=delete&userId=<%=tmp.getUserId()%> onclick="return confirm('Are you sure, you want to delete it?')">Delete</a>
<%
}
%>
</table>
</body>
</html>