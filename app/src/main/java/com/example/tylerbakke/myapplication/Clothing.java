package com.example.tylerbakke.myapplication;

import android.graphics.Bitmap;

import java.util.List;

/**
 * Created by Christopher Cabreros on 03-May-16.
 * This is a temporary class that contains images
 */
public class Clothing {

    private boolean mWorn;

    private String mCategory;

    private String mColor;
    private String mSize;
    private List<String> mOccasion;
    private String mStyle;
    private String mWeather;
    private String mNotes; //might change implementation

    private Bitmap mBitmap;

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String category) {
        mCategory = category;
    }

    public boolean isWorn() {
        return mWorn;
    }

    public void setWorn(boolean worn) {
        mWorn = worn;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }

    public String getSize() {
        return mSize;
    }

    public void setSize(String size) {
        mSize = size;
    }

    public List<String> getOccasion() {
        return mOccasion;
    }

    public void setOccasion(List<String> occasion) {
        mOccasion = occasion;
    }

    public String getStyle() {
        return mStyle;
    }

    public void setStyle(String style) {
        mStyle = style;
    }

    public String getWeather() {
        return mWeather;
    }

    public void setWeather(String weather) {
        mWeather = weather;
    }

    public String getNotes() {
        return mNotes;
    }

    public void setNotes(String notes) {
        mNotes = notes;
    }

    public Bitmap getBitmap() {
        return mBitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        mBitmap = bitmap;
    }
}
