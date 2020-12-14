<%--
  Created by IntelliJ IDEA.
  User: jeonka
  Date: 2020/12/13
  Time: 10:47 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="review_main">
    <div id="reviewTitle">
        <span id="mId">작성자</span>
        <span id="product">품목</span>
        <span id="location">위치</span>
        <span id="eval">평가</span>
    </div>
    <div id="reviewData">
        <ul>
            <li>
                <div>Jeonka</div>
                <div>붕어빵</div>
                <div>서울시 은평구 응암동</div>
                <div>1</div>
            </li>
            <li>
                <div>hye0285</div>
                <div>계란빵</div>
                <div>경기도 광명시 광명7동</div>
                <div>2</div>
            </li>
            <li>
                <div>Hello</div>
                <div>호떡</div>
                <div>인천광역시 연수구</div>
                <div>5</div>
            </li>
        </ul>
    </div>
    <div id="buttonDiv">
        <button type="button" id="back" onclick="history.back()">돌아가기</button>
    </div>
</div>
