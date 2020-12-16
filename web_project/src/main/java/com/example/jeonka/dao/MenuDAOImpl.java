package com.example.jeonka.dao;

import com.example.jeonka.mapper.MenuMapper;
import com.example.jeonka.vo.MenuVO;
import com.example.jeonka.vo.ReadBoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.ArrayList;

@Repository("menuDAO")
public class MenuDAOImpl implements MenuDAO{

    @Autowired
    private MenuMapper menuMapper;

    public ArrayList<MenuVO> showList(int sCode){
        return menuMapper.showList(sCode);
    }

    public void insert(MenuVO menu){
        menuMapper.insert(menu);
    }
}
