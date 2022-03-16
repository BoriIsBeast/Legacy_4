<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<c:import url="./template/header_css.jsp"></c:import>
	
	<style type="text/css">
		.hea {
			width: 80%;
			height: 200px;
			margin: 0 auto;
		}
		.hea img{
			width: 100%;
			height :100%; 
		}
	</style>
</head>
<body>
	<c:import url="./template/header.jsp"></c:import>
	
	
	<h1>Index Page</h1>
	<div class="hea">
		<img alt="" src="./resources/images/back.jpg">
	</div>
	
	<h3>${member.name}님 환영합니다.<span class="material-icons-outlined">account_circle</span>
	
	</h3>
	
	<div>
		<c:if test="${not empty member}">
		<a  href="./member/mypage">My Page</a>
		<a href="./member/logout">Logout</a>
		</c:if>
		
		<c:if test="${empty member}">
		<a  href="./member/login">Login</a>
		<a href="./member/join">Join</a>
		</c:if>
	</div>
	
	<img alt="" src="./resources/upload/member/e791a839-b92d-4943-ad90-d6ca9fa86221_너구리.jpg">
	

</body>
</html>