<%--
  Created by IntelliJ IDEA.
  User: jeonka
  Date: 2020/12/13
  Time: 6:18 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form method="post", action="/write_board/${mId}">
<div id="write_board_main">
    <ul>
        <li>
            <div id="writer">
                <span id="wTitle">작성자</span><span id="wData">${mId}</span>
            </div>
            <div id="sDate">
                <span id="dTitle">등록일</span> <span id="dData">${time}</span>
            </div>
        </li>
        <li>
            <div id="cate">
                <span id="sTitle">상호명</span><span id="sData"><input type="text" id="sTitleInput" placeholder="상호명을 입력해 주세요." name="sTitle"></span>
                <span id="cTitle">주요품목</span><span id="cData"><input type="text" id="cTitleInput" placeholder="품목을 입력해 주세요." name="cTitle"></span>
            </div>
        </li>
        <li>
            <div id="address">
                <span id="aTitle">주소</span><span id="aData"><input type="text" id="aTitleInput" placeholder="주소를 입력해 주세요." name="aTitle"></span>
            </div>
        </li>
        <li>
            <div id="mButton">
                <button type="button" id="mAdd" onclick="fn_Add();">메뉴추가</button>
                <Button type="button" id="mDelete" onclick="fn_Delete();">메뉴삭제</Button>
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
                            <input type="text" placeholder="메뉴를 입력해 주세요." name="menu0"/>
                            <input type="text" placeholder="개당" name="num0"/>
                            <input type="text" placeholder="가격" name="price0"/>
                        </li>
                        <li>
                            <input type="text" placeholder="메뉴를 입력해 주세요." name="menu1"/>
                            <input type="text" placeholder="개당" name="num1"/>
                            <input type="text" placeholder="가격" name="price1"/>
                        </li>
                        <li>
                            <input type="text" placeholder="메뉴를 입력해 주세요." name="menu2"/>
                            <input type="text" placeholder="개당" name="num2"/>
                            <input type="text" placeholder="가격" name="price2"/>
                        </li>
                        <li>
                            <input type="text" placeholder="메뉴를 입력해 주세요." name="menu3"/>
                            <input type="text" placeholder="개당" name="num3"/>
                            <input type="text" placeholder="가격" name="price3"/>
                        </li>
                        <li>
                            <input type="text" placeholder="메뉴를 입력해 주세요." name="menu4"/>
                            <input type="text" placeholder="개당" name="num4"/>
                            <input type="text" placeholder="가격" name="price4"/>
                        </li>
                        <li>
                            <input type="text" placeholder="메뉴를 입력해 주세요." name="menu5"/>
                            <input type="text" placeholder="개당" name="num5"/>
                            <input type="text" placeholder="가격" name="price5"/>
                        </li>
                    </ul>
                </div>
            </div>
        </li>
        <li>
            <button type="submit" id="registerButton">등록하기</button>
            <button type="button" id="back" onclick="history.back()">돌아가기</button>
        </li>
    </ul>
</div>
</form>
