package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDBHelper myDBHelper = new MyDBHelper(MainActivity.this);
        myDBHelper.addData("rahul","214235346");
        myDBHelper.addData("krina","4636436345");
    }
}