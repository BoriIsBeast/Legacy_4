<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<h1>List page</h1>
	
	<!-- 검색창-->
		<div>
			<form action="./list" method="get">
				<fieldset>
					<select name="kind">
						<option value="col1">제목</option>
						<option value="col2">본문</option>
						<option value="col3">작성자</option>
					</select>
					<input type="text" name="search" value="${pager.search}"><!-- 파라미터 -> name-->
					<button type="submit">검색</button>
				</fieldset>	
			</form>

		</div>
	
	<table>
		<tr>
			<th>글 번호</th><th>글 제목</th><th>내용</th><th>작성자</th><th>작성일자</th><th>조회수</th><th>REF</th><th>STEP</th><th>DEPTH</th>
		</tr>
		<c:forEach items="${list}" var="qna">
			<tr>
			<td>${qna.num}</td>
			<td><a href="./detail?num=${qna.num}">${qna.title}</a></td>
			<td>${qna.contents}</td>
			<td>${qna.writer}</td>
			<td>${qna.regDate}</td>
			<td>${qna.hit}</td>
			<td>${qna.ref}</td>
			<td>${qna.step}</td>
			<td>${qna.depth}</td>
			
			</tr>
			</c:forEach>
	</table>
	
	<div>
				<c:if test="${pager.pre}">
					<a href="./list?page=${pager.startNum-1}">PREVIEW</a>
				</c:if>
			
				<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
				<a href="./list?page=${i}&kind=${pager.kind}&search=${pager.search}">${i}</a>
				</c:forEach>
				
				<c:if test="${pager.next}">
					<a href="./list?page=${pager.lastNum+1}">NEXT</a>
				</c:if>
		</div>
			
			<a href="./add">ADD</a>
	</div>
</body>
</html>