package com.example.jeonka.vo;

import java.sql.Timestamp;

public class StoreVO {
    private int sCode;
    private String sName;
    private String sAddress;
    private String sType;
    private Timestamp sDate;
    private String mId;

    public StoreVO() {
    }

    public StoreVO(int sCode, String sName, String sAddress, String sType, Timestamp sDate, String mId) {
        this.sCode = sCode;
        this.sName = sName;
        this.sAddress = sAddress;
        this.sType = sType;
        this.sDate = sDate;
        this.mId = mId;
    }

    public int getsCode() {
        return sCode;
    }

    public void setsCode(int sCode) {
        this.sCode = sCode;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getsType() {
        return sType;
    }

    public void setsType(String sType) {
        this.sType = sType;
    }

    public Timestamp getsDate() {
        return sDate;
    }

    public void setsDate(Timestamp sDate) {
        this.sDate = sDate;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }
}
