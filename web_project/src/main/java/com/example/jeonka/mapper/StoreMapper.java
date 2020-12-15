package com.example.jeonka.mapper;

import com.example.jeonka.vo.StoreVO;

import java.util.ArrayList;

public interface StoreMapper {
    ArrayList<StoreVO> showList();
    StoreVO show(int sCode);
}
