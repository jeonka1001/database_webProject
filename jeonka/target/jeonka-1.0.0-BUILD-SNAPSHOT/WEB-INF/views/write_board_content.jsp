<%--
  Created by IntelliJ IDEA.
  User: jeonka
  Date: 2020/12/13
  Time: 6:18 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="write_board_main">
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
                <span id="cTitle">주요품목</span><span id="cData"><input type="text" id="cTitleInput" hint="품목을 입력해 주세요."></span>
            </div>
        </li>
        <li>
            <div id="address">
                <span id="aTitle">주소</span><span id="aData"><input type="text" id="aTitleInput" hint="주소를 입력해 주세요."></span>
            </div>
        </li>
        <li>
            <div id="mButton">
                <button type="button" id="mAdd">메뉴추가</button>
                <Button type="button" id="mDelete">메뉴삭제</Button>
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
                        <li>
                            <input type="text" hint="메뉴를 입력해 주세요."/>
                            <input type="text" hint="개당"/>
                            <input type="text" hint="가격"/>
                        </li>
                        <li>
                            <input type="text" hint="메뉴를 입력해 주세요."/>
                            <input type="text" hint="개당"/>
                            <input type="text" hint="가격"/>
                        </li>
                        <li>
                            <input type="text" hint="메뉴를 입력해 주세요."/>
                            <input type="text" hint="개당"/>
                            <input type="text" hint="가격"/>
                        </li>
                        <li>
                            <input type="text" hint="메뉴를 입력해 주세요."/>
                            <input type="text" hint="개당"/>
                            <input type="text" hint="가격"/>
                        </li>
                    </ul>
                </div>
            </div>
        </li>
        <li>
            <button type="button" id="registerButton">등록하기</button>
            <button type="button" id="back" onclick="history.back()">돌아가기</button>
        </li>
    </ul>
</div>
