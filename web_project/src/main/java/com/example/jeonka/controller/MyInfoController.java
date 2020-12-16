package com.example.jeonka.controller;

import com.example.jeonka.dao.MemberDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MyInfoController {
    private Logger logger = LoggerFactory.getLogger(MyInfoController.class);

    @Autowired
    @Qualifier("memberDAO")
    MemberDAO memberDAO;

    @RequestMapping("myinfo/{mId}")
    public String myInfo(@PathVariable("mId")String mId, Model model, HttpServletRequest request){

        model.addAttribute("member",memberDAO.showBymId(mId));

        return "myinfo";
    }
}
