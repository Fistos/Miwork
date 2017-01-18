package com.example.tih.miwork;

/**
 * Created by TIH on 11/23/2016.
 */

public class word {

    /**Default translation for the word*/
    private  String mDefaultTranslation;
    /**Miwork translation for the word*/
    private String mMiworkTranslation;
    /**Default returns Images*/
    private int mImageResourceId =NO_IMAGE_PROVIDED;
    private  static final int NO_IMAGE_PROVIDED = -1;

    public word(String defaultTranslation, String miworkTranslation){

        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;

    }

/***/
public word(String defaultTranslation, String miworkTranslation, int imageResourceId){

    mDefaultTranslation = defaultTranslation;
    mMiworkTranslation = miworkTranslation;
    mImageResourceId = imageResourceId;

}
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiworkTranslation(){
        return mMiworkTranslation;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
    //Returns where or not theres image or not
    public boolean hasImage(){
    return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
