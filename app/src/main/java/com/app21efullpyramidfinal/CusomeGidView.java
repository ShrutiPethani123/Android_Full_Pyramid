package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class CusomeGidView extends AppCompatActivity {

    GridView gridView;

    int img[]={R.drawable.india,R.drawable.china,R.drawable.france,R.drawable.uk,R.drawable.usa,R.drawable.india,R.drawable.china,R.drawable.france,R.drawable.uk,R.drawable.usa};
    String name[]={"India","China","France","UK","USA","India","China","France","UK","USA"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cusome_gid_view);
        gridView = findViewById(R.id.custom_grid);

        MyGridAdapter myGridAdapter = new MyGridAdapter(this, name , img);
        gridView.setAdapter(myGridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(CusomeGidView.this, "you select "+ name[i], Toast.LENGTH_SHORT).show();
            }
        });

    }
}