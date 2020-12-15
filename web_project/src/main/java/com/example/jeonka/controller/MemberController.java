package com.example.jeonka.controller;

import com.example.jeonka.dao.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class MemberController {

    @Autowired
    @Qualifier("memberDAO")
    MemberDAO memberDAO;

    @RequestMapping("register")
    public String register(HttpServletRequest request, Locale locale, Model model){
        return "register";
    }
}
