package com.example.jeonka.vo;

public class MyReviewVO {
    String mId;
    String sType;
    String sAddress;
    double sStar;

    public MyReviewVO() {
    }

    public MyReviewVO(String mId, String sType, String sAddress, double sStar) {
        this.mId = mId;
        this.sType = sType;
        this.sAddress = sAddress;
        this.sStar = sStar;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
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

    public double getsStar() {
        return sStar;
    }

    public void setsStar(double sStar) {
        this.sStar = sStar;
    }
}
