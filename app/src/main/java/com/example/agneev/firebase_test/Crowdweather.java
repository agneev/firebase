package com.example.agneev.firebase_test;

import com.firebase.client.Firebase;

/**
 * Created by Agneev on 29-04-2016.
 */
public class Crowdweather extends android.app.Application {

    public void onCreate()
    {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
