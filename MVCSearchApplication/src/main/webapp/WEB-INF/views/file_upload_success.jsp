<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload Form Result</title>
</head>
<body>
	<h1>${msg}</h1>
	<img alt="My File Image"
		src="<c:url value="/resources/images/${file}"/>">
</body>
</html>