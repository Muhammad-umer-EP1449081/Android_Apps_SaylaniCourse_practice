package com.example.android.miwok;

/**
 * Created by scb on 8/5/2016.
 */
public class Word
{

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mAudioResourceId;

    public int getmAudioResourceId()
    {
        return mAudioResourceId;
    }

    private static final int Imagenotassigned = -1;


    private int mImageResourceId = Imagenotassigned;


    Word(String defaultTranslation , String miwokTranslation,int maudioResourceId)
    {
        mAudioResourceId = maudioResourceId;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

    }


    Word(String defaultTranslation , String miwokTranslation, int mimageResourceId, int maudioResourceId)
    {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId= mimageResourceId;
        mAudioResourceId = maudioResourceId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }


    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }



    public boolean ImageHasValue()
    {

        return (mImageResourceId != Imagenotassigned) ;
    }






}
