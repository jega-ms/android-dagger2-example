package com.jega.android.example;

import android.app.Application;

import com.jega.android.example.dagger2.MainActivityModule;
import com.jega.android.example.service.ServiceModule;

import dagger.Binds;
import dagger.Module;

@Module(includes = {MainActivityModule.class , ServiceModule.class})
public abstract class MyAppModule {


    @Binds
    abstract Application application(DaggerApp app);


}
