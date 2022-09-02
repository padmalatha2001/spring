<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Employees</title>
</head>
<body>
<h1 align="center">Employee List</h1>
<h2>Table of content : </h2>
<%int i = 1; %>
<table width="100%">
      <c:forEach items="${employees}" var="emp">
            <tr width="100%">
                  <td width="5%" align="center"><%= i++ %></td>
                  <td width="25%" align="left">${emp.name}</td>
                  <td width="25%" align="left">${emp.role}</td>
            </tr>
      </c:forEach>
</table>
</body>
</html>