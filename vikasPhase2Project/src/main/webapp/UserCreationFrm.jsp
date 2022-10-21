<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action="UserPage" method="post">
<table border="1">

<tr>
	<Td colspan="2"> User Creation Form</Td>
</tr>
<tr>
	<Td> UserName</Td>
	<td><input type="text" name="userName"></td>
</tr>
<tr>
	<Td> Password</Td>
	<td><input type="password" name="userPassword"></td>
</tr>
<tr>
	<Td> User Role</Td>
	<td><select name="userRole">
	<option value=""> Select</option>
	<option value="ADMIN">ADMIN</option>
	<option value="USER">USER</option>
	
	</select>
	</td>
</tr>
<tR>
	<td colspan="2"><input type="submit" value="Create  User"> <input type="reset" value="Clear"></td>
</tR>

</table>
<input type="hidden" name="action" value="create">
</form>
</div>
<jsp:include page="userDisplay.jsp"></jsp:include>
</body>
</html>