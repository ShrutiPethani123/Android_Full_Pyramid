package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class DateTimeActivity extends AppCompatActivity {

    Button btnDate,btnTime;
    TextView tvdate,tvtime;
    int year , month , date,hour , min;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);
        btnDate = findViewById(R.id.btn_date);
        tvdate = findViewById(R.id.tv_date);
        btnTime = findViewById(R.id.btn_time);
        tvtime = findViewById(R.id.tv_time);

        Calendar calendar = Calendar.getInstance();
        year=calendar.get(Calendar.YEAR);
        month=calendar.get(Calendar.MONTH);
        date= calendar.get(Calendar.DATE);
        hour = calendar.get(Calendar.HOUR);
        min = calendar.get(Calendar.MINUTE);


        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatePickerDialog datePickerDialog = new DatePickerDialog(DateTimeActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int date) {

                        tvdate.setText(date+ "/" + (month+1) + "/"+ year);
                    }
                },year,month,date);

                datePickerDialog.show();
            }
        });

        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(DateTimeActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {

                        tvtime.setText(i + " : " + i1);
                    }
                },hour , min ,true);
                timePickerDialog.show();
            }
        });




    }
}