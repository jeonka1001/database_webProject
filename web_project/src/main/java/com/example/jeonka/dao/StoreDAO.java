package com.example.jeonka.dao;

import com.example.jeonka.vo.StoreCommand;
import com.example.jeonka.vo.StoreVO;

import java.util.ArrayList;

public interface StoreDAO {
    ArrayList<StoreVO> showList();
    StoreVO show(int sCode);
    void insert(StoreCommand store);
    int getsCode();
}
