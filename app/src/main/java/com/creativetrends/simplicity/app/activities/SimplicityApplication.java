package com.creativetrends.simplicity.app.activities;// Created by Creative Trends Apps on 8/23/2016.

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import com.google.firebase.FirebaseApp;

public class SimplicityApplication extends Application {

    @SuppressLint("StaticFieldLeak")
    public static Context mContext;

    @Override
    public void onCreate() {
        mContext = getApplicationContext();
        FirebaseApp.initializeApp(this);
        super.onCreate();
    }

    public static Context getContextOfApplication() {
        return mContext;
    }
}