<%--
  Created by IntelliJ IDEA.
  User: jeonka
  Date: 2020/12/13
  Time: 10:16 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="info_main">
    <ul>
        <li>
            <div id="mId">
                <span id="idTitle">아이디</span><span id="idData">ruddks2011@naver.com</span>
            </div>
        </li>
        <li>
            <div id="mNick">
                <span id="nickTitle">닉네임</span>
                <span id="nickData"><input type="text" hint="변경 할 닉네임 입력"/></span>
                <span id="nickConfirm"><button type="button">중복확인</button></span>
            </div>
        </li>
        <li>
            <div id="mBirth">
                <span id="birthTitle">생년월일</span><span id="birthData"><input type="date"/></span>
            </div>
        </li>
        <li>
            <div id="mPass">
                <span id="passTitle">비밀번호</span><span id="passData"><input type="password" hint="비밀번호 입력해주세요."></span>
            </div>
        </li>
        <li>
            <div id="mPassConfirm">
                <span id="passConfirmTitle">비밀번호</span><span id="passConfirmData"><input type="password" hint="비밀번호 입력해주세요."></span>
            </div>
        </li>
        <li>
            <button type="button" id="editButton">수정하기</button>
            <button type="button" id="back" onclick="history.back()">돌아가기</button>
        </li>
    </ul>
</div>
