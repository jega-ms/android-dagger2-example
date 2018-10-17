package com.jega.android.example.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jega.android.example.service.ServiceManager;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {


    @Inject
    ServiceManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager.get();

    }

}
