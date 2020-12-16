package com.example.jeonka.mapper;

import com.example.jeonka.vo.MemberVO;

public interface MemberMapper {
    void insert(MemberVO member);
    MemberVO showBymId(String mId);
    MemberVO showBymNick(String mNick);
    MemberVO loginCheck(MemberVO member);
}
