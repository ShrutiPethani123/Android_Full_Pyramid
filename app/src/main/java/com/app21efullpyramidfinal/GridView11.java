package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class GridView11 extends AppCompatActivity {

    GridView gridView1;
    ArrayList<Integer>arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view11);
        gridView1 = findViewById(R.id.grid1);

        for(int i=1;i<=80;i++)
        {
            arrayList.add(i);
        }

//        ArrayAdapter<Integer>arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayList);
        ArrayAdapter<Integer>arrayAdapter = new ArrayAdapter<>(getApplicationContext(),R.layout.listview1,arrayList);
        gridView1.setAdapter(arrayAdapter);

        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int a = arrayList.get(i);
                Toast.makeText(GridView11.this, "Square: "+ (a*a), Toast.LENGTH_SHORT).show();
            }
        });









    }
}