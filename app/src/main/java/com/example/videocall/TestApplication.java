package com.example.videocall;

import android.app.Application;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;

import java.util.List;

public class TestApplication extends Application {
    public static final String APPLICATION_ID = "D853BE17-9B86-0B64-FF6E-9E0A7C13A600";
    public static final String API_KEY = "9E0393CB-DB34-4DA9-A098-6CE01BBE1242";
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
