package com.example.jeonka.vo;

public class ReviewVO {
    private String mId;
    private int sCode;
    private double rStar;

    public ReviewVO() {
    }

    public ReviewVO(String mId, int sCode, double rStar) {
        this.mId = mId;
        this.sCode = sCode;
        this.rStar = rStar;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public int getsCode() {
        return sCode;
    }

    public void setsCode(int sCode) {
        this.sCode = sCode;
    }

    public double getrStar() {
        return rStar;
    }

    public void setrStar(double rStar) {
        this.rStar = rStar;
    }
}
