package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageView3 extends AppCompatActivity {

    ImageView imgPerson;
    Button btnChange,btnNextPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view3);

        imgPerson=findViewById(R.id.person);
        btnChange = findViewById(R.id.btn_change_img);
        btnNextPage=findViewById(R.id.btn_next_page);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgPerson.setImageResource(R.drawable.img);
            }
        });

        btnNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),IntentActivity.class);
                String str = "Login Activity";
                i.putExtra("KEY_ACTIVITY",str);
                startActivity(i);
            }
        });

    }
}