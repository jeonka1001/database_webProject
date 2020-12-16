package com.example.jeonka.vo;

public class StoreCommand {
    private String sName;
    private String sAddress;
    private String sType;
    private String sDate;
    private String mId;

    public StoreCommand() {
    }

    public StoreCommand(String sName, String sAddress, String sType, String sDate, String mId) {
        this.sName = sName;
        this.sAddress = sAddress;
        this.sType = sType;
        this.sDate = sDate;
        this.mId = mId;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
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

    public String getsDate() {
        return sDate;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate;
    }
}
