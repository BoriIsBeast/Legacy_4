<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${board} Page</h1>
	
	<form action="./add" method="POST" id="frm" enctype="multipart/form-data">
	
	Title <input type="text" name="title">
	Writer <input type="text" name="writer" value="${member.id}"  readonly="readonly"> 
	Contents <textarea name="contents" rows="10" cols=""></textarea>
	
	
	<div>
		<input type="file" name="files">
		<input type="file" name="files">
		<input type="file" name="files">
	</div>
	
	  <button type="submit">ADD</button>
	
	<!--  <input type="button" value="ADD" id="btn"> -->
	</form>

	<script src="../resources/js/add.js"></script>
</body>
</html>
