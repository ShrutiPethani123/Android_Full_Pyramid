package com.app21efullpyramidfinal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {

    Spinner spinner;
    ArrayList<String>country = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spinner=findViewById(R.id.spinner1);
        country.add("India");
        country.add("Canada");
        country.add("China");
        country.add("USA");

//        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,country);
        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.listview1,country){

            @Override
            public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//                return super.getDropDownView(position, convertView, parent);
                TextView tvdata = (TextView) super.getDropDownView(position, convertView, parent);

                if(position==0)
                {
                    tvdata.setTextColor(Color.RED);
                }else{
                    tvdata.setTextColor(Color.GREEN);
                }
                return  tvdata;
            }
        };


        spinner.setAdapter(arrayAdapter);


    }
}