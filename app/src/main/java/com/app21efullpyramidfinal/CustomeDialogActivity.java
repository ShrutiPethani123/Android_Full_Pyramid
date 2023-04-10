package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CustomeDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custome_dialog);

        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.raw_custome_dialog_layout);
        Button btnOkay = dialog.findViewById(R.id.btn_okay);
        dialog.setCancelable(false);

        btnOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CustomeDialogActivity.this, "OKAY..", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        dialog.show();
        dialog.getWindow().setGravity(Gravity.BOTTOM | Gravity.RIGHT);
    }
}