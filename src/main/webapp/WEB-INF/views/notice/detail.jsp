<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>Notice Detail Page</h1>
		
		<h3>num : ${dto.num} </h3>
		<h3>title : ${dto.title}</h3>
		<h3>contents : ${dto.contents}</h3>
		<h3>writer : ${dto.writer}</h3>
		<h3>date : ${dto.regDate}</h3>
		<h3>hit : ${dto.hit}</h3>
		<a href="./list">go list</a>
</body>
</html>