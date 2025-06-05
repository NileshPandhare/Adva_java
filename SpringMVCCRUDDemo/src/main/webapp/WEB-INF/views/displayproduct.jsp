<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Product details</h1>
<table border="2">
  <tr>
     <th>Product Id</th>
     <th>Product Name</th>
     <th>Product Qty</th>
     <th>Product price</th>
     <th>Product mfgdate</th>
     <th>actions</th>
  </tr>
  <c:forEach var="prod" items="${plist}">
  <tr>
     <td>${prod.pid}</td>
     <td>${prod.pname}</td>
     <td>${prod.qty}</td>
     <td>${prod.price}</td>
     <td>${prod.mfgdate}</td>
     <td>
        <a href="delete/${prod.pid}">delete</a>/
        <a href="edit/${prod.pid}">edit</a>
     </td>
  </tr>
  </c:forEach>
</table>
<a href="addnewproduct">Add new Product</a>
</body>
</html>