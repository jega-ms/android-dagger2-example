package com.jega.android.example.service;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class ServiceManagerImpl implements ServiceManager {

    @Inject
    DatabaseManager manager;

    @Inject
    public ServiceManagerImpl() {
        Log.d("DI", "ServiceManager Initialized");
//        this.manager = manager;
    }

    public Bundle get() {
        return manager.get();
    }
}
