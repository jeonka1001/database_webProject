<%--
  Created by IntelliJ IDEA.
  User: jeonka
  Date: 2020/12/01
  Time: 12:09 오전
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:form method="post" action="register">
<div class="register_list">
    <ul>
        <li>
            <div class="inputId">
                <label for="mId">아이디</label><input type="text" id="mId" />
                <button type="submit" id="idConfirmButton" >중복확인</button>
            </div>
        </li>
        <li>
            <div class="inputNick">
                <label for="mNick">닉네임</label><input type="text" id="mNick" />
                <button type="submit" id="nickConfirmButton">중복확인</button>
            </div>
        </li>
        <li>
            <div class="inputPass">
                <label for="mPass">비밀번호 </label><input type="password" id="mPass" path="mPass"/>
            </div>
        </li>
        <li>
            <div class="inputPassConfirm">
                <label for="mPassConfirm">비밀번호확인 </label><input type="password" id="mPassConfirm" />
            </div>
        </li>
        <li>
            <div class="inputBirth">
                <label for="birth">생년월일</label><input id="birth" type="date" />
            </div>
        </li>
        <li>
            <div id="buttons">
                <button type="submit" id="signUp" >가입하기</button>
                <button type="button" onclick="history.back()" id="back" >돌아가기</button>
            </div>
        </li>
    </ul>
</div>
</form:form>
<div class="main_divider"></div>