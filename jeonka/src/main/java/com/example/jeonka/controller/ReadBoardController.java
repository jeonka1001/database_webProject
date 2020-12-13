package com.example.jeonka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;


@Controller
public class ReadBoardController {
    private static final Logger logger = LoggerFactory.getLogger(ReadBoardController.class);

    @RequestMapping("read_board")
    public String readboard(Locale locale, Model model){
        return "read_board";
    }
}
