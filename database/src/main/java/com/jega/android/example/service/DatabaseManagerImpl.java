package com.jega.android.example.service;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class DatabaseManagerImpl implements DatabaseManager {


    @Inject
    public DatabaseManagerImpl() {
        Log.d("DI", "DatabaseManager Initialized");
    }


    public Bundle get(){
        return new Bundle();
    }
}
