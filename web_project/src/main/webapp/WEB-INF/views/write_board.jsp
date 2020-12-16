<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="/resources/css/home.css">
    <link rel="stylesheet" type="text/css" href="/resources/css/home_header.css">
    <link rel="stylesheet" type="text/css" href="/resources/css/write_board.css">
    <title>Title</title>
    <script src="http://code.jquery.com/jquery-3.1.1.js"></script>
    <script>
        let MAX_NUM = 6;
        let MIN_NUM = 1;
        let cur_num = 1;

        function fn_Add(){
            $('#mData > ul').find('li:nth-child('+cur_num+')').css("visibility","visible");
            cur_num = cur_num+1 > MAX_NUM ? MAX_NUM : cur_num+1;
        };

        function fn_Delete(){
            $('#mData > ul').find('li:nth-child('+cur_num+')').css("visibility","hidden");
            cur_num = cur_num-1 < MIN_NUM ? MIN_NUM : cur_num-1;
        };
    </script>
</head>
<body>
<div class="header"><jsp:include page="home_header.jsp"/></div>
<div class="content">
    <div class="mainContent"><jsp:include page="write_board_content.jsp"/></div>
</div>
<div class="footer"><img src="/resources/image/adv.jpg"></div>
</body>
</html>
