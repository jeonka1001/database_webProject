<%--
  Created by IntelliJ IDEA.
  User: jeonka
  Date: 2020/12/01
  Time: 12:09 오전
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form method="post" action="register" id="member">
    <div class="register_list">
        <ul>
            <li>
                <div class="inputId">
                    <label for="mId">아이디</label><input type="eamil" id="mId" placeholder="abdc@abcd.com" name="mId" value="${mId}"/>
                    <button type="button" id="idConfirmButton" name="idConfirmButton" onclick="fn_click('id');" value="false">중복확인</button>
                    <div class="message" id="id_message">${id_message}</div>
                </div>
            </li>
            <li>
                <div class="inputNick">
                    <label for="mNick">닉네임</label><input type="text" id="mNick" name="mNick" value="${mNick}"/>
                    <button type="button" id="nickConfirmButton" name="nickConfirmButton" onclick="fn_click('nick');" value="false">중복확인</button>
                    <div class="message" id="nick_message">${nick_message}</div>
                </div>
            </li>
            <li>
                <div class="inputPass">
                    <label for="mPass">비밀번호 </label><input type="password" id="mPass" name="mPass" value="${mPass}"/>
                    <div class="message">${pass_message}</div>
                </div>
            </li>
            <li>
                <div class="inputPassConfirm">
                    <label for="mPassConfirm">비밀번호확인 </label><input type="password" id="mPassConfirm" name="mPassConfirm" value="${mPassConfirm}"/>
                    <div class="message">${passConfirm_message}</div>
                </div>
            </li>
            <li>
                <div class="inputBirth">
                    <label for="birth">생년월일</label><input id="birth" type="date" name="mBirth" value="${mBirth}"/>
                    <div class="message">${birth_message}</div>
                </div>
            </li>
            <li>
                <div id="buttons">
                    <button type="submit" id="signUp" >가입하기</button>
                    <a id="back" href="/">돌아가기</a>
                </div>
            </li>
        </ul>
    </div>
</form>
<div class="main_divider"></div>