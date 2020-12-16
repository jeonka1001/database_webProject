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
                <span id="idTitle">아이디</span><span id="idData">${member.mId}</span>
            </div>
        </li>
        <li>
            <div id="mNick">
                <span id="nickTitle">닉네임</span>
                <span id="nickData">${member.mNick}</span>
            </div>
        </li>
        <li>
            <div id="mBirth">
                <span id="birthTitle">생년월일</span><span id="birthData"><input type="date" name="mBirth"/></span>
            </div>
        </li>
        <li>
            <div id="mPass">
                <span id="passTitle">비밀번호</span><span id="passData"><input type="password" hint="비밀번호 입력해주세요." name="mPass"></span>
            </div>
        </li>
        <li>
            <div id="mPassConfirm">
                <span id="passConfirmTitle">비밀번호</span><span id="passConfirmData"><input type="password" hint="비밀번호 입력해주세요." name="mPassConfirm"></span>
            </div>
        </li>
        <li>
            <button type="button" id="editButton">수정하기</button>
            <button type="button" id="back" onclick="history.back()">돌아가기</button>
        </li>
    </ul>
</div>
