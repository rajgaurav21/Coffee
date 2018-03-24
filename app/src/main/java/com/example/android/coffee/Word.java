package com.example.android.coffee;

/**
 * Created by Gaurav on 28-06-2017.
 */

public class Word {
    private String mCoffeeName ;
    private String mCoffeeIngredients ;
    private int mImageResourceId = NO_IMAGE_PROVIDED ;
    private static final int NO_IMAGE_PROVIDED=-1 ;

    public Word ( String CoffeeName , String CoffeeIngredients , int imageResourceId ){
        mCoffeeName = CoffeeName ;
        mCoffeeIngredients = CoffeeIngredients ;
        mImageResourceId = imageResourceId ;
    }

    public String getmCoffeeName(){
        return mCoffeeName ;
    }

    public String getmCoffeeIngredients(){
        return mCoffeeIngredients ;
    }

    public int getmImageResourceId() {
        return mImageResourceId ;
    }

    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED ;
    }
}
