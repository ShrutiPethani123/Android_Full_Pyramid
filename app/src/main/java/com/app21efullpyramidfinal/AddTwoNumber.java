package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddTwoNumber extends AppCompatActivity {

    EditText edt1,edt2;
    Button addBtn;
    TextView tvans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_two_number);

       edt1= findViewById(R.id.edtn1);
       edt2 = findViewById(R.id.edtn2);
       addBtn=findViewById(R.id.btnAdd);
       tvans=findViewById(R.id.txtans);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                int n1 = Integer.parseInt(edt1.getText().toString());
//                int n2 = Integer.parseInt((edt2.getText().toString()));
//                int sum = n1+n2;
//                tvans.setText("Answer is " + sum);
//                Toast.makeText(AddTwoNumber.this, "Addition is: " + sum, Toast.LENGTH_LONG).show();


                if((edt1.getText().toString().length()>0) && (edt2.getText().toString().length()>0))
                {
                    int n1 = Integer.parseInt(edt1.getText().toString());
                    int n2 = Integer.parseInt((edt2.getText().toString()));
                    int sum = n1+n2;
                    tvans.setText("Answer is " + sum);

                }
                else{
                    Toast.makeText(AddTwoNumber.this, "Please Enter Number!!", Toast.LENGTH_LONG).show();
                }
            }
        });

    }


    public void mul(View view) {

        int n1 = Integer.parseInt(edt1.getText().toString());
        int n2 = Integer.parseInt((edt2.getText().toString()));
        int answer = n1*n2;
        tvans.setText("Answer is " + answer);
        Toast.makeText(AddTwoNumber.this, "Multiplication is: " + answer, Toast.LENGTH_LONG).show();

    }
}