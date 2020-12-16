package com.example.jeonka.controller;

import com.example.jeonka.dao.MenuDAO;
import com.example.jeonka.dao.ReviewDAO;
import com.example.jeonka.dao.StoreDAO;
import com.example.jeonka.vo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

@Controller
public class WriteBoardController {

    private Logger logger = LoggerFactory.getLogger(WriteBoardController.class);

    @Autowired
    @Qualifier("storeDAO")
    StoreDAO storeDAO;

    @Autowired
    @Qualifier("menuDAO")
    MenuDAO menuDAO;

    @RequestMapping(value="write_board/{mId}",method= RequestMethod.GET)
    public String write(Model model, @PathVariable("mId")String mId){
        SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat ( "yyyy-MM-dd", Locale.KOREA );
        Date currentTime = new Date ();
        String mTime = mSimpleDateFormat.format ( currentTime );
        model.addAttribute("mId",mId);
        model.addAttribute("time",mTime);
        return "write_board";
    }

    @RequestMapping(value="write_board/{mId}",method=RequestMethod.POST)
    public String write_register(@PathVariable("mId")String mId, HttpServletRequest request, Model model, RedirectAttributes reda){
        SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat ( "yyyy-MM-dd", Locale.KOREA );
        Date currentTime = new Date ();

        String mTime = mSimpleDateFormat.format ( currentTime );
        String sName = request.getParameter("sTitle");
        String sType = request.getParameter("cTitle");
        String sAddress = request.getParameter("aTitle");
        StoreCommand store = new StoreCommand(sName,sAddress,sType,mTime,mId);
        storeDAO.insert(store);
        int sCode = storeDAO.getsCode();
        for(int i = 0; i <=5 ; i ++){
            String menu = request.getParameter("menu"+i);
            String num = request.getParameter("num"+i);
            String price = request.getParameter("price"+i);
            if(menu.trim() == "" || num.trim() == "" || price.trim() == ""){
                break;
            }
            menuDAO.insert(new MenuVO(sCode,Integer.parseInt(num),menu,Integer.parseInt(price)));
        }
        return "redirect:/";
    }
}
