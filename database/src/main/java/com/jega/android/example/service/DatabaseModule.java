package com.jega.android.example.service;

import dagger.Binds;
import dagger.Module;

@Module
public class DatabaseModule {

    @Binds
    DatabaseManager bindS(DatabaseManagerImpl db) {
        return db;
    }
}
