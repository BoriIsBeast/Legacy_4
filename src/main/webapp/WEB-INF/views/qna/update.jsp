<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
		<form action="./update" method="POST" >
		 		 <input type="hidden" readonly="readonly" name="bookNumber" value="${dto.num}">
		Title <input type="text" name="title" value="${dto.title}">
	    BookContents <textarea name="contents" rows="10" cols="">${dto.contents}</textarea>
		<!-- textarea는 value를 >< 사이에 넣을것 -->
		
		
			 
			 <input type="submit" value="ADD">
			 
		</form>
</body>
</html>