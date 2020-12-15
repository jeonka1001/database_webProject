package com.example.jeonka.mapper;

import com.example.jeonka.vo.MenuVO;

import java.util.ArrayList;

public interface MenuMapper {
    ArrayList<MenuVO> showList(int sCode);
}
