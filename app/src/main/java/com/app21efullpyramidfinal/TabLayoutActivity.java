package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class TabLayoutActivity extends AppCompatActivity {

    TabLayout tab;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        tab = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewpager);

        ViewPageMessangerAdapter viewPageMessangerAdapter = new ViewPageMessangerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPageMessangerAdapter);

        tab.setupWithViewPager(viewPager);

    }
}