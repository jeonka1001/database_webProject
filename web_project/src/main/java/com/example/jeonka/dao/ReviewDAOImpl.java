package com.example.jeonka.dao;

import com.example.jeonka.mapper.ReviewMapper;
import com.example.jeonka.vo.ReviewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("reviewDAO")
public class ReviewDAOImpl implements ReviewDAO{

    @Autowired
    ReviewMapper reviewMapper;


    @Override
    public ReviewVO showMyReview(String mId) {
        return reviewMapper.showMyReview(mId);
    }

    @Override
    public Double showAvgStar(int sCode) {
        return reviewMapper.showAvgStar(sCode);
    }
}
