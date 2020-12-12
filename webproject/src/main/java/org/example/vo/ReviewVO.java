package org.example.vo;

public class Review {
    String mId;
    int sCode;
    int rStar;

    public Review() {
    }

    public Review(String mId, int sCode, int rStar) {
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

    public int getrStar() {
        return rStar;
    }

    public void setrStar(int rStar) {
        this.rStar = rStar;
    }
}
