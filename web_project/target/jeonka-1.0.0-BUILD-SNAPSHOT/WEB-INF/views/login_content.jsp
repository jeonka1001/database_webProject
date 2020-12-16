<%--
  Created by IntelliJ IDEA.
  User: jeonka
  Date: 2020/12/13
  Time: 5:14 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<form method="post"  action="login">
    <div id="loginList">
        <ul>
            <li>
                <label for="mId">아이디</label><input id="mId" name="mId" type="text" placeholder="아이디를 입력해 주세요" value="${mId}">
                <div id="id_message">${id_message}</div>
            </li>
            <li>
                <label for="mPass">비밀번호</label><input id="mPass" name="mPass" type="password" placeholder="비밀번호를 입력해 주세요" value="${mPass}">
                <div id="pass_message">${pass_message}</div>
            </li>
            <li>
                <button id="login" type="submit" >로그인</button>
            </li>
            <li>
                <a id="signUp" href="register">가입하기</a>
                <button type="button" id="back" onclick="history.back()" >돌아가기</button>
            </li>
        </ul>
    </div>
</form>
