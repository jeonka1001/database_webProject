<%--
  Created by IntelliJ IDEA.
  User: jeonka
  Date: 2020/12/01
  Time: 12:09 오전
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="mainList">
    <ul>
        <li>
            <div>작성자</div>
            <div>품목</div>
            <div>위치</div>
        </li>
        <li>
            <div class="writer"><div>Jeonka</div></div>
            <div class="product"><div>호떡</div></div>
            <div class="location"><div>경기도 광명시 광명사거리</div></div>
        </li>
        <li>
            <div class="writer"><div>hye0285</div></div>
            <div class="product"><div>계란빵</div></div>
            <div class="location"><div>서울시 은평구 응암역</div></div>
        </li>
        <li>
            <div class="writer"><div>hello</div></div>
            <div class="product"><div>호떡</div></div>
            <div class="location"><div>사랑시 고백구 행복동</div></div>
        </li>
        <li>
            <div class="writer"><div>ruddks20002</div></div>
            <div class="product"><div>타코야끼</div></div>
            <div class="location"><div>경상북도 울릉군 남면도동</div></div>
        </li>
        <li>
            <div class="writer"><div>iLike</div></div>
            <div class="product"><div>붕어빵</div></div>
            <div class="location"><div>서울시 은평구 응암역</div></div>
        </li>
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
        <li class="divBar"> <div>|</div> </li>
        <li class="nextBar"> <div>next ></div> </li>
    </ul>
</div>
<div class="main_divider"></div>