package com.jega.android.example.service;

import dagger.Binds;
import dagger.Module;

@Module(includes = DatabaseModule.class)
public abstract class ServiceModule {

    @Binds
    abstract ServiceManager bindS(ServiceManagerImpl db);


}
