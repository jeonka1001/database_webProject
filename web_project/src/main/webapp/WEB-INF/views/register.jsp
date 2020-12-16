<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="/resources/css/home.css">
    <link rel="stylesheet" type="text/css" href="/resources/css/home_header.css">
    <link rel="stylesheet" type="text/css" href="/resources/css/register.css">
    <title>Title</title>
    <script src="http://code.jquery.com/jquery-3.1.1.js"></script>
    <script>
        function fn_click(type) {
            $.ajax({
                type: 'post',
                url: '/check/'+type,
                dataType:"json",
                data: {
                    type:type,
                    mId:$('#mId').val(),
                    mNick:$('#mNick').val()
                },
                success:function(data){
                    console.log("success");
                    console.log(data);
                    let resultType = data['type'];
                    let result = data['result'];
                    if(resultType=='id'){
                        if(result){
                            $('#id_message').text("사용 가능한 이메일 입니다.");
                        }
                        else{
                            $('#id_message').text("이미 존재하는 이메일 입니다.");
                        }
                        $('#idConfirmButton').val(result);
                    }
                    else{
                        if(result){
                            $('#nick_message').text("사용 가능한 닉네임 입니다.");
                        }
                        else{
                            $('#nick_message').text("이미 존재하는 닉네임 입니다.");
                        }
                        $('#nickConfirmButton').val(result);
                    }
                },
                error:function(error){
                    console.log(error)
                }
            })
        }
    </script>
</head>
<body>
<div class="header"><jsp:include page="home_header.jsp"/></div>
<div class="content">
    <div class="mainContent"><jsp:include page="register_content.jsp"/></div>
</div>
<div class="footer"><img src="/resources/image/adv.jpg"></div>
</body>
</html>
