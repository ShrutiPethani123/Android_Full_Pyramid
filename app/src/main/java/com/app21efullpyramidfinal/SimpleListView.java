package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SimpleListView extends AppCompatActivity {

    ListView listView;
//    ArrayList<String>arrLang=new ArrayList<>();
    String arr[]=new String[]{"India","Canada","Nepal","Africa","USA","China"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list_view);
        listView = findViewById(R.id.list_view);
//        arrLang.add("Python");
//        arrLang.add("Java");
//        arrLang.add("Android");
//        arrLang.add("C");
//        arrLang.add("C++");
//        arrLang.add("HTML");
//        arrLang.add("Css");
//        arrLang.add("Python");
//        arrLang.add("Java");
//        arrLang.add("Android");
//        arrLang.add("C");
//        arrLang.add("C++");
//        arrLang.add("HTML");
//        arrLang.add("Css");
//        arrLang.add("Python");
//        arrLang.add("Java");
//        arrLang.add("Android");
//        arrLang.add("C");
//        arrLang.add("C++");
//        arrLang.add("HTML");
//        arrLang.add("Css");

//        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,arrLang);
        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<>(this,R.layout.listview1,arr);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position==0)
                {
                    Toast.makeText(SimpleListView.this, "India...........", Toast.LENGTH_LONG).show();
                }
                else if(position==1)
                {
                    Toast.makeText(SimpleListView.this, "Canada.........", Toast.LENGTH_SHORT).show();
                }

            }
        });





    }
}
/*

Array
ArrayList


Task:
Android version
Alpha

Toast: Alpha-2000

 */