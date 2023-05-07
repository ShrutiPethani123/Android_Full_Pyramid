package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SharedPreferenceActivity extends AppCompatActivity {

    EditText uname , pass;
    Button btnAdd,btnDel;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);
        uname = findViewById(R.id.edt_spname);
        pass = findViewById(R.id.edt_sppass);
        btnAdd=findViewById(R.id.btn_spadd);
        tv=findViewById(R.id.tv_sptext);
        btnDel = findViewById(R.id.btn_spdel);

        checkDetails();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getSharedPreferences("demo",MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("username",uname.getText().toString());
                editor.putString("password",pass.getText().toString());
                editor.apply();
                uname.setText("");
                pass.setText("");
                tv.setText("Inserted Successfully!!");
                tv.setTextColor(Color.GREEN);
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getSharedPreferences("demo",MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.clear();
                editor.apply();
                uname.setText("");
                pass.setText("");
                tv.setText("Delete Successfully!!");
                tv.setTextColor(Color.GREEN);
            }
        });


    }

    private void checkDetails() {
        SharedPreferences sp = getSharedPreferences("demo",MODE_PRIVATE);
        if(sp.contains("username"))
        {
            uname.setText(sp.getString("username",""));
            pass.setText(sp.getString("password",""));
        }else{
            tv.setText("Record Not Found!!");
            tv.setTextColor(Color.RED);
        }

    }
}


/*


Make one form for user that contain name , id , age , college name ,contact no.
and Make one button for save and one button for show.


 */





