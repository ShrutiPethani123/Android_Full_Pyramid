package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class AutoCompleteText extends AppCompatActivity {

    AutoCompleteTextView autoText1;
    ArrayList<String>arrayList = new ArrayList<>();
    @SuppressLint("MissingInflatedId")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text);
        autoText1 = findViewById(R.id.text1);

        arrayList.add("India");
        arrayList.add("Australia");
        arrayList.add("USA");
        arrayList.add("UK");
        arrayList.add("Canada");
        arrayList.add("Itali");
        arrayList.add("India");
        arrayList.add("Australia");
        arrayList.add("USA");
        arrayList.add("UK");
        arrayList.add("Canada");
        arrayList.add("Itali");

        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayList);

        autoText1.setAdapter(arrayAdapter);

    }
}