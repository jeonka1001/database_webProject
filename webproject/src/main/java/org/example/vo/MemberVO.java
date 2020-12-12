package org.example.vo;

import java.sql.Timestamp;

public class Member {
    String mId;
    String mPass;
    String mNick;
    Timestamp mBirth;

    public Member() {
    }
    public Member(String mId, String mPass, String mNick, Timestamp mBirth) {
        this.mId = mId;
        this.mPass = mPass;
        this.mNick = mNick;
        this.mBirth = mBirth;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public void setmPass(String mPass) {
        this.mPass = mPass;
    }

    public void setmNick(String mNick) {
        this.mNick = mNick;
    }

    public void setmBirth(Timestamp mBirth) {
        this.mBirth = mBirth;
    }

    public String getmId() {
        return mId;
    }

    public String getmPass() {
        return mPass;
    }

    public String getmNick() {
        return mNick;
    }

    public Timestamp getmBirth() {
        return mBirth;
    }
}
