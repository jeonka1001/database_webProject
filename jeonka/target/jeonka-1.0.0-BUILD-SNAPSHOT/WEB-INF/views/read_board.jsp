<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="/resources/css/home.css">
    <link rel="stylesheet" type="text/css" href="/resources/css/home_header.css">
    <link rel="stylesheet" type="text/css" href="/resources/css/read_board.css">
    <title>Title</title>
</head>
<body>
<div class="header"><jsp:include page="home_header.jsp"/></div>
<div class="content">
    <div class="mainContent"><jsp:include page="read_borad_content.jsp"/></div>
</div>
<div class="footer"><img src="/resources/image/adv.jpg"></div>
</body>
</html>
