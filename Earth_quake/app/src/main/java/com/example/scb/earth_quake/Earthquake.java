package com.example.scb.earth_quake;

/**
 * Created by scb on 8/17/2016.
 */
public class Earthquake
{

    private double mMagnitude;
    private String mlocation;

    private int mDate;


Earthquake(double magnitude, String location, int date )
{

    mMagnitude = magnitude;
    mlocation = location;
    mDate = date;

}


    public double getmMagnitude() {
        return  mMagnitude;
    }

    public String getMlocation() {
        return mlocation;
    }

    public int getmDate() {
        return mDate;
    }



}
