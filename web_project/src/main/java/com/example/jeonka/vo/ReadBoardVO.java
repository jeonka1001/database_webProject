package com.example.jeonka.vo;

import java.sql.Timestamp;
import java.util.ArrayList;

public class ReadBoardVO {
    private String mId;
    private Timestamp sDate;
    private String sType;
    private String sAddress;
    private double rStar;
    private ArrayList<MenuVO> menuList;

    public ReadBoardVO() {
    }

    public ReadBoardVO(String mId, Timestamp sDate, String sType, String sAddress, double rStar, ArrayList<MenuVO> menuList) {
        this.mId = mId;
        this.sDate = sDate;
        this.sType = sType;
        this.sAddress = sAddress;
        this.rStar = rStar;
        this.menuList = menuList;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public Timestamp getsDate() {
        return sDate;
    }

    public void setsDate(Timestamp sDate) {
        this.sDate = sDate;
    }

    public String getsType() {
        return sType;
    }

    public void setsType(String sType) {
        this.sType = sType;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public double getrStar() {
        return rStar;
    }

    public void setrStar(double rStar) {
        this.rStar = rStar;
    }

    public ArrayList<MenuVO> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<MenuVO> menuList) {
        this.menuList = menuList;
    }
}
