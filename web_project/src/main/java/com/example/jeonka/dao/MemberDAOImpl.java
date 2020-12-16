package com.example.jeonka.dao;

import com.example.jeonka.mapper.MemberMapper;
import com.example.jeonka.vo.MemberVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO{

    @Autowired
    MemberMapper memberMapper;

    @Override
    public void insert(MemberVO member) {
        memberMapper.insert(member);
    }
    public MemberVO showBymId(String mId){
        return memberMapper.showBymId(mId);
    }
    public MemberVO showBymNick(String mNick){
        return memberMapper.showBymNick(mNick);
    }
    public MemberVO loginCheck(MemberVO member){
        return memberMapper.loginCheck(member);
    }
}
