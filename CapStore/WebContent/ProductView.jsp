<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> View Products </title>
</head>
<body>
<table border = 1 bordercolor="green">
<tr> 
<th> Product Name </th>
<th> Product Id </th>
<th> Category </th>
<th> Merchant </th>
<th> Price </th>
<th> Quantity </th>
<th> Subcategory </th>
</tr>
<a:forEach var = "pro" items ="${data}">
<tr> 
<td> ${pro.product_name} </td>
<td> ${pro.product_id} </td>
<td> ${pro.category_id} </td>
<td> ${pro.merchant_id} </td>
<td> ${pro.price} </td>
<td> ${pro.quantity} </td>
<td> ${pro.subcategory_id} </td>
</tr>
</a:forEach>
</table>
<a href="index.jsp">Home</a>
</body>
</html>