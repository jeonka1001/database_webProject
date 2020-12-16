package com.example.jeonka.controller;

import com.example.jeonka.dao.MemberDAO;
import com.example.jeonka.vo.MemberVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    @Qualifier("memberDAO")
    private MemberDAO memberDAO;


    @RequestMapping(value = "login",method=RequestMethod.GET)
    public String login(Locale locale, Model model){
        return "login";
    }

    @RequestMapping(value="login", method=RequestMethod.POST)
    public String signin(HttpSession session,HttpServletRequest request, RedirectAttributes reat, Locale locale, Model model){
        String mId = request.getParameter("mId");
        if(mId == ""){
            model.addAttribute("id_message","아이디를 입력해 주세요");
            return "login";
        }
        String mPass = request.getParameter("mPass");
        if(mPass == ""){
            model.addAttribute("mId",mId);
            model.addAttribute("pass_message","비밀번호를 입력해 주세요");
            return "login";
        }
        MemberVO member = new MemberVO();
        member.setmId(mId);
        member.setmPass(mPass);

        member = memberDAO.loginCheck(member);
        if(member == null){
            model.addAttribute("id_message","아이디 또는 비밀번호가 일치하지 않습니다.");
            model.addAttribute("pass_message","아이디 또는 비밀번호가 일치하지 않습니다.");
            model.addAttribute("mId",mId);
            model.addAttribute("mPass",mPass);
            return "login";
        }
        reat.addFlashAttribute("result",true);
        reat.addFlashAttribute("member",member);
        session.setAttribute("member",member);
        return "redirect:/";
    }
}
