package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ImplicitIntent extends AppCompatActivity {

    Button btnDial,btnMsg,btnEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);

        btnDial = findViewById(R.id.btn_dial);
        btnMsg=findViewById(R.id.btn_msg);
        btnEmail=findViewById(R.id.btn_email);

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent i = new Intent(Intent.ACTION_DIAL);
                Intent idial = new Intent();
                idial.setAction(Intent.ACTION_DIAL);
                idial.setData(Uri.parse("tel: +9169845316223"));
                startActivity(idial);
            }
        });

        btnMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("smsto:" + Uri.encode("+91963852741")));
                i.putExtra("sms_body","Hello......");
                startActivity(i);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                String address[]={"abc@gmail.com"};
//                i.setData(Uri.parse("mailto:"));
                i.putExtra(Intent.EXTRA_EMAIL,address);
                i.putExtra(Intent.EXTRA_CC,"xyz@gmail.com");
                i.putExtra(Intent.EXTRA_SUBJECT,"Hello...");
                startActivity(i);

            }
        });
    }
}