package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class SeekBarActivity extends AppCompatActivity {

    SeekBar seekBar;
    RatingBar ratingBar;
    TextView tvSeekBar,tvSeekBar1,tvRate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);
        seekBar = findViewById(R.id.seek_bar);
        tvSeekBar = findViewById(R.id.tvSeek);
        tvSeekBar1 = findViewById(R.id.tv_seek1);
        ratingBar = findViewById(R.id.rate);
        tvRate = findViewById(R.id.tvRate);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                tvRate.setText(String.valueOf(v));
            }
        });



        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tvSeekBar.setText(String.valueOf(i));
                tvSeekBar1.setTextSize(TypedValue.COMPLEX_UNIT_SP,i);
                Toast.makeText(SeekBarActivity.this, "Progress " + i, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarActivity.this, "Start....", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                Toast.makeText(SeekBarActivity.this, "Stop...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}