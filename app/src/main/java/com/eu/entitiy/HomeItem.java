package com.eu.entitiy;

import java.io.Serializable;

/**
 * Created by Kamal on 4/29/16.
 */
public class HomeItem implements Serializable{

    private String mTitle;
    private String mDesc;
    private String mColor;
    private int mCount;


    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc;
    }

    public String getmColor() {
        return mColor;
    }

    public void setmColor(String mColor) {
        this.mColor = mColor;
    }

    public int getmCount() {
        return mCount;
    }

    public void setmCount(int mCount) {
        this.mCount = mCount;
    }
}
