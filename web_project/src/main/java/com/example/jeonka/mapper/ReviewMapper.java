package com.example.jeonka.mapper;

import com.example.jeonka.vo.ReviewVO;
import com.example.jeonka.vo.StoreCommand;

import java.util.ArrayList;

public interface ReviewMapper {
    ArrayList<ReviewVO> showMyReview(String mId);
    double showAvgStar(int sCode);
}
