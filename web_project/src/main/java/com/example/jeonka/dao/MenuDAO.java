package com.example.jeonka.dao;

import com.example.jeonka.vo.MenuVO;
import com.example.jeonka.vo.ReadBoardVO;

import java.util.ArrayList;

public interface MenuDAO {
    ArrayList<MenuVO> showList(int sCode);
    void insert(MenuVO menu);
}
