<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="b" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b:form action="Success" modelAttribute="yy">
<table border="2" bordercolor="black" >
<tr>
<th> New Price: </th>
<td> <b:input path="price"/> </td>
</tr>
<tr>
<th> New Quantity: </th>
<td> <b:input path="quantity"/> </td>
</tr>
<tr> 
<td> <input type="submit" value="Update" >
</table>
</b:form>
</body>
</html>