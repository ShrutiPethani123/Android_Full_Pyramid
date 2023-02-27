package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        Intent i =getIntent();
        String str = i.getStringExtra("KEY_ACTIVITY");
        Toast.makeText(this, "This Activity: "+ str, Toast.LENGTH_LONG).show();
    }
}

/*

Intent:

1. Implicit Intent
2. Explicit Intent

-> getIntExtra()

byte
int
long
float
double
char
string



 */