package com.example.jeonka.dao;

import com.example.jeonka.mapper.MemberMapper;
import com.example.jeonka.vo.MemberVO;
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
}
