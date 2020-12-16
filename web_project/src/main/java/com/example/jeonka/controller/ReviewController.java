package com.example.jeonka.controller;

import com.example.jeonka.dao.ReviewDAO;
import com.example.jeonka.dao.StoreDAO;
import com.example.jeonka.vo.MemberVO;
import com.example.jeonka.vo.MyReviewVO;
import com.example.jeonka.vo.ReviewVO;
import com.example.jeonka.vo.StoreVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class ReviewController {

    @Autowired
    @Qualifier("reviewDAO")
    ReviewDAO reviewDAO;

    @Autowired
    @Qualifier("storeDAO")
    StoreDAO storeDAO;


    private Logger logger = LoggerFactory.getLogger(ReviewController.class);

    @RequestMapping("my_review/{mId}")
    public String myReview(@PathVariable("mId") String mId, Model model){
        ArrayList<ReviewVO> list = reviewDAO.showMyReview(mId);
        ArrayList<MyReviewVO> reviewList = new ArrayList<MyReviewVO>();
        for(ReviewVO review : list){
            StoreVO store = storeDAO.show(review.getsCode());
            String sAddress = store.getsAddress();
            String sType = store.getsType();
            reviewList.add(new MyReviewVO(mId,sType,sAddress,review.getrStar()));
        }
        model.addAttribute("list",reviewList);
        return "my_review";
    }
}
