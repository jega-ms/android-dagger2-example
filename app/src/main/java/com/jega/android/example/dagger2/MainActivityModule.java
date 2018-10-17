package com.jega.android.example.dagger2;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainActivityModule {


    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();

//    @Binds
//    public abstract Activity accountActivity(MainActivity accountActivity);
}
