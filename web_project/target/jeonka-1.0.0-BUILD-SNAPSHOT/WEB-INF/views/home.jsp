<%@ page import="com.example.jeonka.vo.MemberVO" %>
<%@ page import="java.nio.file.FileStore" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="/resources/css/home.css">
	<link rel="stylesheet" type="text/css" href="/resources/css/home_header.css">
	<link rel="stylesheet" type="text/css" href="/resources/css/main_content.css">
	<link rel="stylesheet" type="text/css" href="/resources/css/home_side.css">
	<link rel="stylesheet" type="text/css" href="/resources/css/mypage.css">
	<title>Title</title>
</head>
<body>
<div class="header"><jsp:include page="home_header.jsp"/></div>
<div class="content">
	<div class="mainContent"><jsp:include page="main_content.jsp"/></div>
	<c:choose>
		<c:when test='${result == false || result == null}'>
			<div class="side"><jsp:include page="home_side.jsp"/></div>
		</c:when>
		<c:otherwise>
			<div class="side"><jsp:include page="mypage.jsp"/></div>
		</c:otherwise>
	</c:choose>
</div>
<div class="footer"><img src="/resources/image/adv.jpg"/></div>
</body>
</html>
