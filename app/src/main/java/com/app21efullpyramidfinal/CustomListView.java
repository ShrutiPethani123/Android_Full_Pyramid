package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class CustomListView extends AppCompatActivity {

    ListView listView;
    int img[]={R.drawable.india,R.drawable.china,R.drawable.france,R.drawable.uk,R.drawable.usa,R.drawable.india,R.drawable.china,R.drawable.france,R.drawable.uk,R.drawable.usa};
    String name[]={"India","China","France","UK","USA","India","China","France","UK","USA"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        listView = findViewById(R.id.custom_list);

        MyListAdapter myListAdapter = new MyListAdapter(this,name,img);
        listView.setAdapter(myListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(CustomListView.this, "Selected: " +name[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}