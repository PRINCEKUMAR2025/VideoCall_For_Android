package com.example.videocall;

import android.app.Application;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;

import java.util.List;

public class TestApplication extends Application {
    public static final String APPLICATION_ID = "858680A0-FFAC-FC34-FF1C-62B1D051A300";
    public static final String API_KEY = "72CB2BB4-31D1-4370-B202-645AF0F636C8";
    public static final String SERVER_URL = "https://api.backendless.com";

    public static BackendlessUser user;

    public void onCreate() {
        super.onCreate();

        Backendless.setUrl(SERVER_URL);
        Backendless.initApp(getApplicationContext(),
                APPLICATION_ID,
                API_KEY);
    }
}
