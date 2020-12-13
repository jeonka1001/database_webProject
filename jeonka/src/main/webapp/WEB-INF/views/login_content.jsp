<%--
  Created by IntelliJ IDEA.
  User: jeonka
  Date: 2020/12/13
  Time: 5:14 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:form method="post"  action="login"></form:form>
<div id="loginList">
    <ul>
        <li>
            <label for="mId">아이디</label><input id="mId" type="text" hint="아이디를 입력해 주세요">
        </li>
        <li>
            <label for="mPass">비밀번호</label><input id="mPass" type="text" hint="비밀번호를 입력해 주세요">
        </li>
        <li>
            <button id="login" type="submit" >로그인</button>
        </li>
        <li>
            <button type="submit" id="signUp">가입하기</button>
            <button type="button" id="back" >돌아가기</button>
        </li>
    </ul>
</div>
