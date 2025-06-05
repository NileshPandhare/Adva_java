<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" action="/SpringMVCCRUDDemo/product/updateproduct" modelAttribute="product">
    <div>Pid : <form:input path="pid"/><form:errors path="pid"/> </div>
    <div>Name: <form:input path="pname"/> <form:errors path="pname"/></div>
    <div>Qty: <form:input path="qty"/> <form:errors path="qty"/></div>
    <div>Price: <form:input path="price"/> <form:errors path="price"/></div>
    <div>Mfg Date: <form:input path="mfgdate" type="date"/> <form:errors path="mfgdate"/>
    <input type="submit" value="update"/>
   </form:form>
</body>
</html>