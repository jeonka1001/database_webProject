package com.example.jeonka.dao;

import com.example.jeonka.vo.ReviewVO;

import java.util.ArrayList;

public interface ReviewDAO {
    ArrayList<ReviewVO> showMyReview(String mId);
    Double showAvgStar(int sCode);
}
