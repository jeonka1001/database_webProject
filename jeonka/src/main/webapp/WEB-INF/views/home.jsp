<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="/resources/css/home.css">
	<link rel="stylesheet" type="text/css" href="/resources/css/home_header.css">
	<link rel="stylesheet" type="text/css" href="/resources/css/main_content.css">
	<title>Title</title>
</head>
<body>
<div class="header"><jsp:include page="home_header.jsp"/></div>
<div class="content">
	<div class="mainContent"><jsp:include page="main_content.jsp"/></div>
	<div class="side"></div>
</div>
<div class="footer">footer</div>
</body>
</html>