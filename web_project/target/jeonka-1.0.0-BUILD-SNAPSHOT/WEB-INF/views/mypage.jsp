<%--
  Created by IntelliJ IDEA.
  User: jeonka
  Date: 2020/12/13
  Time: 3:02 오전
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="myPage">
    <ul>
        <li>
            <a href="myinfo/${member.mId}" >내정보 변경</a>
            <div id="idTitle">아이디   :   </div>
            <div id="idData">${member.mId}</div>
        </li>
        <li>
            <a href="write_board/${member.mId}" id="">등록하기</a>
            <a href="my_review/${member.mId}">내 평가 보기</a>
        </li>
    </ul>
</div>
