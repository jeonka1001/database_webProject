package com.example.jeonka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class WriteBoardController {
    private static Logger logger = LoggerFactory.getLogger(WriteBoardController.class);

    @RequestMapping("write_board")
    public String registerForm(Locale locale, Model model){
        return "write_board";
    }
}
