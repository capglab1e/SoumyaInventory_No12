<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="a" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product Page</title>
</head>
<body>
<table border="2"  bordercolor="blue">
<a:form action = "Success1" method="POST" modelAttribute="my">
<tr>
<th> Product Id: </th>
<td> <a:input path="product_id"/> </td>
<tr>
<th> Product Name: </th>
<td> <a:input path="product_name"/> </td>
</tr>
<tr> 
<th> Product Price: </th>
<td> <a:input path="price"/> </td>
</tr>
<tr>
<th> Merchant Id: </th>
<td> <a:input path="merchant_id"/> </td>
</tr>
<tr>
<th> Quantity: </th>
<td> <a:input path="quantity"/></td>
</tr>
<tr>
<th> Category: </th>
<td>
<f:select path="category_id"  required="true">
<f:option value="">Please select</f:option>
<f:options items="${cato}"/>
</f:select>
 <!--<a:select path="category_id" items="${cato}"></a:select> </td>-->
</tr>
<tr>
<th> Subcategory: </th>
<td> 
<f:select path="subcategory_id"  required="true">
<f:option value="">Please select</f:option>
<f:options items="${subcato}"/>
</f:select>
<!--<a:select path="subcategory_id" items = "${subcato}"></a:select></td>-->
</tr>
<tr>
<td><input type="submit" value="Add Products"></td>
</tr>

</a:form>
</table>
</body>
<a href="index.jsp">Home</a>
</html>