package com.example.scb.hello_world;

/**
 * Created by scb on 8/5/2016.
 */
public class Word
{

    private String category_name;


    private int mAudioResourceId;

    public int getmAudioResourceId()
    {
        return mAudioResourceId;
    }

    private static final int Imagenotassigned = -1;


    private int mImageResourceId = Imagenotassigned;


    Word(String defaultTranslation , int mimageResourceId)
    {
        mImageResourceId = mimageResourceId;
        category_name = defaultTranslation;

    }


    Word(String defaultTranslation ,int mimageResourceId, int maudioResourceId)
    {

        category_name = defaultTranslation;
        mImageResourceId= mimageResourceId;
        mAudioResourceId = maudioResourceId;
    }



    public int getmImageResourceId() {
        return mImageResourceId;
    }


    public String getCategory_name() {
        return category_name;
    }



    public boolean ImageHasValue()
    {

        return (mImageResourceId != Imagenotassigned) ;
    }






}
