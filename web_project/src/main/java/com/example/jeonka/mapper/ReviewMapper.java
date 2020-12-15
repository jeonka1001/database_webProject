package com.example.jeonka.mapper;

import com.example.jeonka.vo.ReviewVO;

public interface ReviewMapper {
    ReviewVO showMyReview(String mId);
    double showAvgStar(int sCode);
}
