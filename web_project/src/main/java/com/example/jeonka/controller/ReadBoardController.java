package com.example.jeonka.controller;

import com.example.jeonka.dao.MenuDAO;
import com.example.jeonka.dao.ReviewDAO;
import com.example.jeonka.dao.StoreDAO;
import com.example.jeonka.vo.MenuVO;
import com.example.jeonka.vo.ReadBoardVO;
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
import java.util.Locale;


@Controller
public class ReadBoardController {

    @Autowired
    @Qualifier("menuDAO")
    MenuDAO menuDAO;

    @Autowired
    @Qualifier("reviewDAO")
    ReviewDAO reviewDAO;

    @Autowired
    @Qualifier("storeDAO")
    StoreDAO storeDAO;

    private Logger logger = LoggerFactory.getLogger(ReadBoardController.class);

    @RequestMapping("read_board/{board_Num}") // 이거 하는법 알아오기
    public String read(Locale locale, Model model, @PathVariable("board_Num")int sCode){

        StoreVO store = storeDAO.show(sCode);
        ArrayList<MenuVO> menuList = menuDAO.showList(sCode);
        Double star = reviewDAO.showAvgStar(sCode);
        logger.info("star is "+star);
        ReadBoardVO readBoardVO = new ReadBoardVO(store.getmId(),store.getsDate(),store.getsType(),store.getsAddress(),star,menuList);
        model.addAttribute("board",readBoardVO);
        return "read_board";
    }
}
