<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <c:forEach var="MyReivew" items="${list}">
                <li>
                    <div>${MyReivew.mId}</div>
                    <div>${MyReivew.sType}</div>
                    <div>${MyReivew.sAddress}</div>
                    <div>${MyReivew.rStar}</div>
                </li>
            </c:forEach>
        </ul>
    </div>
    <div id="buttonDiv">
        <button type="button" id="back" onclick="history.back()">돌아가기</button>
    </div>
</div>
