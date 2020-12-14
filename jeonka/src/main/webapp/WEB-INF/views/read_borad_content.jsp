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
                <span id="wTitle">작성자</span><span id="wData">JeonKa</span>
            </div>
            <div id="sDate">
                <span id="dTitle">등록일</span> <span id="dData">2020.11.28</span>
            </div>
        </li>
        <li>
            <div id="cate">
                <span id="cTitle">주요품목</span><span id="cData">붕어빵</span>
            </div>
        </li>
        <li>
            <div id="address">
                <div id="aTitle">주소</div><div id="aData">서울시 은평구 응암역 ddhdhhd7번출구 근처도보 10m이내</div>
            </div>
        </li>
        <li>
            <div id="eval">
                <span id="eTitle">평점</span><span id="eData">3.8</span>
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
                        <li><div>슈크림 붕어빵</div><div>3</div><div>1000</div></li>
                        <li><div>팥 붕어빵</div><div>4</div><div>1000</div></li>
                        <li><div>국화빵</div><div>5</div><div>1000</div></li>
                        <li><div>슈크림 국화빵</div><div>4</div><div>1000</div></li>
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
