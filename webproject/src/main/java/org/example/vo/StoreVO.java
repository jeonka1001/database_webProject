package org.example.vo;

public class Store {
    int sCode;
    String sName;
    String sAddress;

    public Store() {
    }

    public Store(int sCode, String sName, String sAddress) {
        this.sCode = sCode;
        this.sName = sName;
        this.sAddress = sAddress;
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
}
