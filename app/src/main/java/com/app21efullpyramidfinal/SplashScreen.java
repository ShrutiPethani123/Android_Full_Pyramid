package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        int time=3000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//                Intent i = new Intent(SplashScreen.this,AutoCompleteText.class);
//                startActivity(i);
//                finish();

                SharedPreferences sp = getSharedPreferences("login",MODE_PRIVATE);
                boolean check = sp.getBoolean("flag",false);


                Intent i;
                if(check)
                {
                        i = new Intent(SplashScreen.this,HomeSP.class);
                }else{
                        i = new Intent(SplashScreen.this,LoginSP.class);
                }
                startActivity(i);
                finish();


            }
        },time);

    }
}