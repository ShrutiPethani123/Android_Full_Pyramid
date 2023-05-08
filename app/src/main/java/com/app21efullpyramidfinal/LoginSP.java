package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginSP extends AppCompatActivity {

    Button btnLogin;
    EditText name,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sp);
        btnLogin=findViewById(R.id.btn_splogin);
        name = findViewById(R.id.edt_spname1);
        pass =findViewById(R.id.edt_sppass1);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getSharedPreferences("login",MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("username",name.getText().toString());
                editor.putString("password",pass.getText().toString());
                editor.putBoolean("flag",true);
                editor.apply();
            }
        });
    }
}