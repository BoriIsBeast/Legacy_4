<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/header_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
		<h1>${board} Detail Page</h1>
		
		<h3>num : ${dto.num} </h3>
		<h3>title : ${dto.title}</h3>
		<h3>contents : ${dto.contents}</h3>

		<a href="./list">go list</a>
		
		<a href="./delete?num=${dto.num}">Delete</a>
		<a href="./update?num=${dto.num}">Update</a>
		<a href="./reply?num=${dto.num}">Reply</a>
</body>
</html>