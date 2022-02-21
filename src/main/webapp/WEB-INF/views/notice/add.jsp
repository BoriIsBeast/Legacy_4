<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Page</h1>
	
	<form action="./add" method="POST">
	
	Title <input type="text" name="title">
	Contents <textarea name="contents" rows="10" cols=""></textarea>
	Writer <input type="text" name="writer"> 
	Hit <input type="text" name="hit">
	
	<input type="submit" value="ADD">
	</form>
</body>
</html>