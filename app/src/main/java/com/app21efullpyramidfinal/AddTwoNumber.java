package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddTwoNumber extends AppCompatActivity {

//    EditText edt1,edt2;
    Button addBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_two_number);

       EditText edt1= findViewById(R.id.edtn1);
       EditText edt2 = findViewById(R.id.edtn2);
        addBtn=findViewById(R.id.btnAdd);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n1 = Integer.parseInt(edt1.getText().toString());
                int n2 = Integer.parseInt((edt2.getText().toString()));
                int sum = n1+n2;
                Toast.makeText(AddTwoNumber.this, "Addition is: " + sum, Toast.LENGTH_LONG).show();
            }
        });

    }
}