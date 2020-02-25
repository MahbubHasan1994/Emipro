package com.example.emipro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    CardView bank_cal;
    Dialog dialog;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.bank_cal_dialog);

//        tvCredit = dialog.findViewById(R.id.tvCredit);
//        tvInfo = dialog.findViewById(R.id.tvInfo);

        bundle=new Bundle();

        bank_cal = findViewById(R.id.bank_cal_dialog);
        bank_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                dialog.show();

            }
        });
    }
}
