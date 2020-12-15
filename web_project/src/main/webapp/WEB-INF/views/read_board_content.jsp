<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jeonka
  Date: 2020/12/13
  Time: 6:18 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="read_board_main">
    <ul>
        <li>
            <div id="writer">
                <div id="wTitle">작성자</div><div id="wData">${board.mId}</div>
            </div>
            <div id="sDate">
                <div id="dTitle">등록일</div> <div id="dData">${board.sDate}</div>
            </div>
        </li>
        <li>
            <div id="cate">
                <div id="cTitle">주요품목</div><div id="cData">${board.sType}</div>
            </div>
        </li>
        <li>
            <div id="address">
                <div id="aTitle">주소</div><div id="aData">${board.sAddress}</div>
            </div>
        </li>
        <li>
            <div id="eval">
                <div id="eTitle">평점</div><div id="eData">${board.rStar}</div>
            </div>
        </li>
        <li>
            <div id="menu">
                <div id="mTitle">
                    <div id="menuName">메뉴</div>
                    <div id="menuNum">개당</div>
                    <div id="menuPrice">가격</div>
                </div>
                <div id="mData">
                    <ul>
                        <c:forEach var="MenuVO" items="${board.menuList}">
                            <li><div>${MenuVO.mName}</div><div>${MenuVO.mNum}</div><div>${MenuVO.mPrice}</div></li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </li>
        <li>
            <button type="button" id="evalButton">평가하기</button>
            <button type="button" id="back" onclick="history.back()">돌아가기</button>
        </li>
    </ul>
</div>
