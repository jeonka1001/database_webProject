package com.example.jeonka.vo;

public class MenuVO {
    private int sCode;
    private int mNum;
    private String mName;
    private int mPrice;

    public MenuVO() {
    }

    public MenuVO(int sCode, int mNum, String mName, int mPrice) {
        this.sCode = sCode;
        this.mNum = mNum;
        this.mName = mName;
        this.mPrice = mPrice;
    }

    public int getsCode() {
        return sCode;
    }

    public void setsCode(int sCode) {
        this.sCode = sCode;
    }

    public int getmNum() {
        return mNum;
    }

    public void setmNum(int mNum) {
        this.mNum = mNum;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmPrice() {
        return mPrice;
    }

    public void setmPrice(int mPrice) {
        this.mPrice = mPrice;
    }
}
