package com.example.jeonka.controller;

import com.example.jeonka.dao.MemberDAO;
import com.example.jeonka.vo.MemberVO;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Locale;

@Controller
public class MemberController {

    @Autowired
    @Qualifier("memberDAO")
    MemberDAO memberDAO;

    private Logger logger = LoggerFactory.getLogger(MemberController.class);

    @RequestMapping(value="register",method = RequestMethod.GET)
    public String register(Locale locale,Model model){
        return "register";
    }

    @RequestMapping(value="register",method= RequestMethod.POST)
    public String register(HttpServletRequest request, Locale locale, Model model){
        String mId = request.getParameter("mId");
        String mNick = request.getParameter("mNick");
        String mPass = request.getParameter("mPass");
        String mPassConfirm = request.getParameter("mPassConfirm");
        String mBirth = request.getParameter("mBirth");
        MemberVO member = new MemberVO(mId,mPass,mNick,mBirth);

        String[] message = confirm(member,mPassConfirm);
        if(message!=null){
            model.addAttribute(message[0],message[1]);
            model.addAttribute("mPassConfirm",mPassConfirm);
            sendModel(member,model);
            return "register";
        }
        memberDAO.insert(member);
        return "redirect:/";
    }
    public String[] confirm(MemberVO member,String mPassConfirm){
        if(member.getmId() == ""){
            return new String[]{"id_message","아이디를 입력해주세요."};
        }
        if(member.getmNick() == ""){
            return new String[]{"nick_message","닉네임을 입력해주세요."};
        }
        if(member.getmPass() == ""){
            return new String[] {"pass_message","비밀번호를 입력해주세요."};
        }
        if (mPassConfirm == "") {
            return new String[]{"passConfirm_message","비밀번호 확인을 입력해주세요."};
        }
        if(member.getmPass().compareTo(mPassConfirm) != 0){
            return new String[]{"passConfirm_message","비밀번호와 비밀번호 확인이 불일치합니다."};
        }
        if(member.getmBirth() == ""){
            return new String[]{"birth_message","생년월일을 입력해주세요."};
        }
        return null;
    }

    @RequestMapping(value="check/{type}",method=RequestMethod.POST)
    public void check(@PathVariable("type")String type,HttpServletResponse response, HttpServletRequest request){
        String mId = request.getParameter("mId");
        String mNick = request.getParameter("mNick");
        JSONObject jObj = new JSONObject();
        if(type.compareTo("nick")== 0){
            jObj.put("type","nick");
            if(memberDAO.showBymNick(mNick) == null){
                jObj.put("result",true);
            }
            else{
                jObj.put("result",false);
            }
        }
        else{
            jObj.put("type","id");
            if(memberDAO.showBymId(mId) == null){
                jObj.put("result",true);
            }
            else{
                jObj.put("result",false);
            }
        }
        PrintWriter out;
        try {
            logger.info(jObj.toString());
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json");
            out = response.getWriter();
            out.println(jObj.toJSONString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void sendModel(MemberVO member,Model model){
        model.addAttribute("mId",member.getmId());
        model.addAttribute("mNick",member.getmNick());
        model.addAttribute("mPass",member.getmPass());
        model.addAttribute("mBirth",member.getmBirth());
    }
}
