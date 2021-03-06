package com.example.jeonka.vo;

import java.sql.Timestamp;

public class MemberVO {
    private String mId;
    private String mPass;
    private String mNick;
    private String mBirth;

    public MemberVO() {
    }
    public MemberVO(String mId, String mPass, String mNick, String mBirth) {
        this.mId = mId;
        this.mPass = mPass;
        this.mNick = mNick;
        this.mBirth = mBirth;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmPass() {
        return mPass;
    }

    public void setmPass(String mPass) {
        this.mPass = mPass;
    }

    public String getmNick() {
        return mNick;
    }

    public void setmNick(String mNick) {
        this.mNick = mNick;
    }

    public String getmBirth() {
        return mBirth;
    }

    public void setmBirth(String mBirth) {
        this.mBirth = mBirth;
    }
}
