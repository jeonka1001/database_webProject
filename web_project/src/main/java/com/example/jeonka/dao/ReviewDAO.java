package com.example.jeonka.dao;

import com.example.jeonka.vo.ReviewVO;

public interface ReviewDAO {
    ReviewVO showMyReview(String mId);
    Double showAvgStar(int sCode);
}
