package com.example.izzie.contacts;

import android.app.Application;

import com.backendless.Backendless;

/**
 * Created by izzie on 2/6/2019.
 */

public class ContactsApplication extends Application
{
    public static final String APPLICATION_ID ="0C8FD60A-420F-CFFD-FF18-5ACE972DF400";
    public static final String API_KEY =  "B477F1D4-E2F8-BA16-FFB6-F92FDADCC700";
    public static final String SERVER_URL = "https://api.backendless.com";
    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl(SERVER_URL);

        String appVersion = "v1";
        Backendless.initApp(getApplicationContext(),APPLICATION_ID, API_KEY);
    }
}
