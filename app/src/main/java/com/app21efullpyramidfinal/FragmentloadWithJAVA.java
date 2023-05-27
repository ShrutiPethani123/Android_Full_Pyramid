package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentloadWithJAVA extends AppCompatActivity {

    Button btnA,btnB,btnC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentload_with_java);
        btnA=findViewById(R.id.btn_a);
        btnB=findViewById(R.id.btn_b);
        btnC=findViewById(R.id.btn_c);

        onLoad(new AFragment(),1);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLoad(AFragment.getInstance("Royal",1234),0);

            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              onLoad(new BFragment(),0);

            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLoad(new CFragment(),0);
            }
        });
    }

    private void onLoad(Fragment fragment , int flag) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        Bundle bundle = new Bundle();
//        bundle.putString("name","Royal");
//        bundle.putInt("Code",567);
//        fragment.setArguments(bundle);

        if(flag==1)
        {
            fragmentTransaction.add(R.id.frame,fragment);
        }else{
            fragmentTransaction.replace(R.id.frame,fragment);
        }

        fragmentTransaction.commit();
    }
}