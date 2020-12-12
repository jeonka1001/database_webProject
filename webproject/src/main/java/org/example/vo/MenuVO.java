package org.example.vo;

public class Menu {
    int sCode;
    int mNumber;
    String mName;
    int mPrice;

    public Menu() {
    }

    public Menu(int sCode, int mNumber, String mName, int mPrice) {
        this.sCode = sCode;
        this.mNumber = mNumber;
        this.mName = mName;
        this.mPrice = mPrice;
    }

    public int getsCode() {
        return sCode;
    }

    public void setsCode(int sCode) {
        this.sCode = sCode;
    }

    public int getmNumber() {
        return mNumber;
    }

    public void setmNumber(int mNumber) {
        this.mNumber = mNumber;
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
