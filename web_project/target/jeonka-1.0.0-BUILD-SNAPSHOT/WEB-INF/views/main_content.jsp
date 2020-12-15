<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jeonka
  Date: 2020/12/01
  Time: 12:09 오전
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="mainList">
    <div id="mainTitle">
        <div id="tWrite">작성자</div>
        <div id="tProduct">품목</div>
        <div id="tLocation">위치</div>
    </div>
    <ul>
        <c:forEach var="StoreVO" items="${list}">
        <li>
            <div class="writer"><div>${StoreVO.mId}</div></div>
            <div class="product"><div>${StoreVO.sType}</div></div>
            <div class="location"><div>${StoreVO.sAddress}</div></div>
            <a href="read_board/${StoreVO.sCode}">자세히 보기</a>
        </li>
        </c:forEach>
    </ul>
</div>
<div class="listFinder">
    <ul>
        <li class="category">
            <select>
                <option id="pro" value="1">품목</option>
                <option id="loc" value="2">위치</option>
            </select>
        </li>
        <li class="findContent"><input type="text" id="findText" placeholder="내용을 입력해 주세요."/></li>
        <li class="button"><input type="button" id="findButton" value="검색"></li>
    </ul>
</div>
<div class="listController">
    <ul>
        <li class="prevBar"> <div> < prev</div> </li>
        <li class="divBar" > <div>|</div> </li>
        <li class="nextBar"> <div>next ></div> </li>
    </ul>
</div>
<div class="main_divider"></div>