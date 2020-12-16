package com.example.jeonka.dao;

import com.example.jeonka.vo.MemberVO;

public interface MemberDAO {
    void insert(MemberVO member);
    MemberVO showBymId(String mId);
    MemberVO showBymNick(String mNick);
    MemberVO loginCheck(MemberVO member);
}
