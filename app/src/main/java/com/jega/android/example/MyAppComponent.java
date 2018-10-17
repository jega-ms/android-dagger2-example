package com.jega.android.example;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(modules = {AndroidInjectionModule.class, MyAppModule.class,})
public interface MyAppComponent extends AndroidInjector<DaggerApp> {

}
