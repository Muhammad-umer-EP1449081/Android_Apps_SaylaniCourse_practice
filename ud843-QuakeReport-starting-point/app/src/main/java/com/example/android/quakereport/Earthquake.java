package com.example.android.quakereport;

/**
 * Created by scb on 8/17/2016.
 */
public class Earthquake
{

    private String mMagnitude;
    private String mlocation;

    private String mDate;


Earthquake(String magnitude,String location, String date )
{

    mMagnitude = magnitude;
    mlocation = location;
    mDate = date;

}


    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getMlocation() {
        return mlocation;
    }

    public String getmDate() {
        return mDate;
    }



}
