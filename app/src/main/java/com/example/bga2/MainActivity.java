package com.example.bga2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tabBar);
        TabItem tabTermine = findViewById(R.id.tabTermine);
        TabItem tabSpieler = findViewById(R.id.tabSpieler);
        TabItem tabSpiele = findViewById(R.id.tabSpiele);


    }
}