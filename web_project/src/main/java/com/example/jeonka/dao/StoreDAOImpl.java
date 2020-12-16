package com.example.jeonka.dao;

import com.example.jeonka.mapper.StoreMapper;
import com.example.jeonka.vo.StoreCommand;
import com.example.jeonka.vo.StoreVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("storeDAO")
public class StoreDAOImpl implements StoreDAO{

    @Autowired
    private StoreMapper storeMapper;

    @Override
    public ArrayList<StoreVO> showList() {
        return storeMapper.showList();
    }

    public StoreVO show(int sCode){return storeMapper.show(sCode);}

    @Override
    public void insert(StoreCommand store) {
        storeMapper.insert(store);
    }
    public int getsCode(){
        return storeMapper.getsCode();
    }
}
